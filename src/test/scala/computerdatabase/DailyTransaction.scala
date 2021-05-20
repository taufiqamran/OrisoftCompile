package computerdatabase

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import computerdatabase.Module.Login._
import computerdatabase.Module.Leave._
import computerdatabase.Module.Claim._
import computerdatabase.Module.Profile.Report._
import computerdatabase.Module.Leave.Report._


class DailyTransaction extends Simulation{


  val httpProtocol = http
    .baseUrl("https://orisoftst.orisoftsaas.com")
    .disableFollowRedirect

  var loginFeeder1 = csv("data/ESSEMPLogin1001-2000.csv").queue

  val loginSupFeeder1 = csv("data/superior_Credential.csv").queue

  val loginHrFeeder = csv("data/hr_Credential.csv").queue

  //Login Employee
  val login = feed(loginFeeder1).exec(Login.loginProcess).exec(Login.loadDashboard)

  //Login Superior
  val loginSup = feed(loginSupFeeder1).exec(Login.loginProcess).exec(Login.loadDashboard)

  val loginHr = feed(loginHrFeeder).exec(Login.loginProcess).exec(Login.loadDashboard)

  //EMP
  val ALSaveDraftex = exec(ESSEMPApplyLeave.loadLeaveForm,ESSEMPApplyLeave.saveLeaveDraft,ESSEMPApplyLeave.leaveLogout)
  val ALDeleteDraftex = exec(ESSEMPApplyLeave.loadLeaveForm,ESSEMPApplyLeave.getSavedDraft,ESSEMPApplyLeave.deleteSavedDraft,ESSEMPApplyLeave.leaveLogout)
  val ALSubmitDraftex = exec(ESSEMPApplyLeave.loadLeaveForm,ESSEMPApplyLeave.submitLeave,ESSEMPApplyLeave.leaveLogout)
  val checkClaimApplicationex = exec(ESSEMPMyClaimApplication.loadMyClaimApplication,ESSEMPMyClaimApplication.selectClaimApplication,ESSEMPMyClaimApplication.logout)
  val withdrawClaimApplicationex = exec(ESSEMPMyClaimApplication.loadMyClaimApplication,ESSEMPMyClaimApplication.selectClaimApplication,ESSEMPMyClaimApplication.withdrawClaim,ESSEMPMyClaimApplication.logout)

  //SUP
  val MyTeamViewClaimEntitlementex = exec(ESSSUPMyTeamViewClaimEntitlement.LoadClaimEntitlement,ESSSUPMyTeamViewClaimEntitlement.searchClaimEntitlement   ,ESSSUPMyTeamViewClaimEntitlement.logout)
  val MyTeamViewLeaveEntitlementex = exec(ESSSUPMyTeamViewLeaveEntitlement.loadLeaveEntitlement,ESSSUPMyTeamViewLeaveEntitlement.clickLeaveEntitlement   ,ESSSUPMyTeamViewLeaveEntitlement.logout)
  val MyTeamViewLeaveApplicationex = exec(ESSSUPMyTeamViewLeaveApplication.loadLeaveApplication,ESSSUPMyTeamViewLeaveApplication.searchLeave,ESSSUPMyTeamViewLeaveApplication.clickRequestId,ESSSUPMyTeamViewLeaveApplication.logout)
  val MyTeamViewClaimApplicationex = exec(ESSSUPMyTeamViewClaimApplication.loadViewClaimApplication,ESSSUPMyTeamViewClaimApplication.clickRequestId,ESSSUPMyTeamViewClaimApplication.closeClaimApplication,ESSSUPMyTeamViewClaimApplication.logout)

  //HR
  val EmployeeListingReportex = exec(EmployeeListingReport.loadReport,EmployeeListingReport.getReport,EmployeeListingReport.logout)
  val EmployeeMovementReportex = exec(EmployeeMovementReport.loadMovementReport,EmployeeMovementReport.FilterForm,EmployeeMovementReport.clickSearch,EmployeeMovementReport.logout)
  val FixedTransactionListingex = exec(FixedTransactionListing.loadFixedTransaction,FixedTransactionListing.selectFilter,FixedTransactionListing.clickSearch,FixedTransactionListing.logout)
  val EmployeeLeaveApproverListingex = exec(EmployeeLeaveApproverListingReport.loadLeaveApproverListing,EmployeeLeaveApproverListingReport.searchFilter,EmployeeLeaveApproverListingReport.clickSearch,EmployeeLeaveApproverListingReport.logout)


  val debug = exec(session => {

    //val leaveDetail = session("ViewBalance").as[String]
    //println(s"Leave Detail : $leaveDetail")

    val report = session("ReportViewer").as[String]
    println(s"Report : $report")

    val huhu = session("BodyCriteria").as[String]
    //println(s"Body : $huhu")
    //val bodyClaimListing = session("BodyClaim").as[String]
    //println(s"Body Claim Listing : $bodyClaimListing")

    //val bodySearch = session("ClaimListing").as[String]
    //println(s"Search Body : $bodySearch")

    //val clickRequestId = session("bodyrequestId").as[String]
    //println(s"Click Request : $clickRequestId")

    //val name = session("UserID").as[String]
    //println(s"Body : $name")

    session
  })
  //EMP
  val ApplyLeaveSaveDraft = scenario("Apply Leave Save Draft").exec(login,ALSaveDraftex,debug)
  val ApplyLeaveDeleteDraft = scenario("Apply Leave Delete Draft").exec(login,ALDeleteDraftex,debug)
  val ApplyLeaveSubmitDraft = scenario("Apply Leave Submit Draft").exec(login,ALSubmitDraftex,debug)
  val MyClaimApplicationCheck = scenario("My Claim Application Check Claim").exec(login,checkClaimApplicationex,debug)
  val MyClaimApplicationWithdraw = scenario("My Claim Application Withdraw Claim").exec(login,withdrawClaimApplicationex,debug)

  //SUP
  val MyTeamViewClaimEntitlement = scenario("My Team View Claim Entitlement").exec(loginSup,MyTeamViewClaimEntitlementex,debug)
  val MyTeamViewLeaveEntitlement = scenario("My Team View Leave Entitlement").exec(loginSup,MyTeamViewLeaveEntitlementex,debug)
  val MyTeamViewLeaveApplication = scenario("My Team View Leave Application").exec(loginSup,MyTeamViewLeaveApplicationex,debug)
  val MyTeamViewClaimApplication = scenario("My Team View Claim Application").exec(loginSup,MyTeamViewClaimApplicationex,debug)

  //HR Profile
  val ProfileEmployeeListingReportS = scenario("Profile Employee Listing Report").exec(loginHr,EmployeeListingReportex,debug)
  val ProfileEmployeeMovementReportS = scenario("Profile Employee Movement Report").exec(loginHr,EmployeeMovementReportex,debug)
  val ProfileFixedTransactionListingS = scenario("Profile Fixed Transaction Listing Report").exec(loginHr,FixedTransactionListingex,debug)
  val LeaveEmployeeApproverListingS = scenario("Leave Employee Approver Listing Report").exec(loginHr,EmployeeLeaveApproverListingex,debug)



  setUp(LeaveEmployeeApproverListingS.inject(atOnceUsers(1))).protocols(httpProtocol)

}
