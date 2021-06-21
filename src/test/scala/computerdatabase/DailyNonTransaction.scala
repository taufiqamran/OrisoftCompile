package computerdatabase
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import computerdatabase.Module.Login._
import computerdatabase.Module.Leave._
import computerdatabase.Module.Claim._
import computerdatabase.Module.Profile.Report._
import computerdatabase.Module.Leave.Report._
import computerdatabase.Module.Claim.Report._
import computerdatabase.Module.Document._
import computerdatabase.Module.Profile.ESSEMPMyProfile
import computerdatabase.Module.Service._
import computerdatabase.Module.Workflow._

class DailyNonTransaction extends Simulation{


  val domain = "https://orisoftst.orisoftsaas.com"
  val httpProtocol = http
    .baseUrl(domain)
    .disableFollowRedirect

  val loginFeeder8000 = csv("data/EMP8000.csv").random
  var loginFeeder = csv("data/ESSEMPLogin1000.csv").queue
  var loginFeeder1 = csv("data/ESSEMPLogin1001-2000.csv").queue
  var loginFeeder2 = csv("data/ESSEMPLogin2001-3000.csv").queue
  var loginFeeder3 = csv("data/ESSEMPLogin3001-4000.csv").queue
  var loginFeeder4 = csv("data/ESSEMPLogin4001-5000.csv").queue
  var loginFeeder5 = csv("data/ESSEMPLogin5001-6000.csv").queue
  var loginFeeder6 = csv("data/ESSEMPLogin6001-7000.csv").queue
  var loginFeeder7 = csv("data/ESSEMPLogin7001-7500.csv").queue

  var loginClaimFeeder1 = csv("data/ESSEMPLogin-Claim100.csv").queue
  var loginClaimFeeder2 = csv("data/ESSEMPLogin-Claim200.csv").queue

  val loginSupFeeder1 = csv("data/superior_Credential.csv").queue
  val loginSupFeeder2 = csv("data/superior_Credential.csv").queue
  val loginSupFeeder3 = csv("data/superior_Credential.csv").queue
  val loginSupFeeder4 = csv("data/superior_Credential.csv").queue
  val loginSupFeeder5 = csv("data/superior_Credential.csv").queue
  val loginSupFeeder6 = csv("data/superior_Credential.csv").queue
  val loginSupFeeder7 = csv("data/superior_Credential.csv").queue
  val loginSupFeeder8 = csv("data/superior_Credential.csv").queue
  val loginSupFeeder9 = csv("data/superior_Credential.csv").queue
  val loginSupFeeder10 = csv("data/superior_Credential.csv").queue

  val loginHrFeeder = csv("data/hr_Credential.csv").queue

  //No of Users
  val EMPNo = 1
  val SUPNo = 1
  val EMPNoClaim = 1
  val HRNo = 1

  //Duration
  val scriptDuration = 6

  //Login Employee

  val login1 = feed(loginFeeder1).exec(Login.loginProcess).exec(Login.loadDashboard)
  val login2 = feed(loginFeeder2).exec(Login.loginProcess).exec(Login.loadDashboard)
  val login3 = feed(loginFeeder3).exec(Login.loginProcess).exec(Login.loadDashboard)
  val login4 = feed(loginFeeder4).exec(Login.loginProcess).exec(Login.loadDashboard)
  val login5 = feed(loginFeeder5).exec(Login.loginProcess).exec(Login.loadDashboard)
  val login6 = feed(loginFeeder6).exec(Login.loginProcess).exec(Login.loadDashboard)
  val login7 = feed(loginFeeder7).exec(Login.loginProcess).exec(Login.loadDashboard)

  //Login Employee Claim
  val loginClaim = feed(loginClaimFeeder1).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginClaim2 = feed(loginClaimFeeder2).exec(Login.loginProcess).exec(Login.loadDashboard)

  //Login Superior
  val loginSup = feed(loginSupFeeder1).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginSup1 = feed(loginSupFeeder2).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginSup2 = feed(loginSupFeeder3).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginSup3 = feed(loginSupFeeder4).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginSup4 = feed(loginSupFeeder5).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginSup5 = feed(loginSupFeeder6).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginSup6 = feed(loginSupFeeder7).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginSup7 = feed(loginSupFeeder8).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginSup8 = feed(loginSupFeeder9).exec(Login.loginProcess).exec(Login.loadDashboard)
  val loginSup9 = feed(loginSupFeeder10).exec(Login.loginProcess).exec(Login.loadDashboard)

  //Login HR
  val loginHr = feed(loginHrFeeder).exec(Login.loginProcess).exec(Login.loadDashboard)

  //EMP
  val ALSaveDraftex = exec(ESSEMPApplyLeave.loadLeaveForm,ESSEMPApplyLeave.leaveLogout)
  val checkClaimApplicationex = exec(ESSEMPMyClaimApplication.loadMyClaimApplication,ESSEMPMyClaimApplication.logout)
  val MyServiceHistoryex = exec(ESSEMPMyServiceHistory.loadServicePage,ESSEMPMyServiceHistory.searchService,ESSEMPMyServiceHistory.logout)
  val myDocumentCreateex = exec(ESSEMPMyDocument.loadMyDocument,ESSEMPMyDocument.logout)
  val EmpMyWorkflowex = exec(ESSEMPMyWorkflow.loadApplication,ESSEMPMyWorkflow.logout)
  val ApplyClaimex = exec(ESSEMPApplyClaim.loadApplication,ESSEMPApplyClaim.logout1)
  val MyLeaveApplicationex = exec(ESSEMPMyLeaveApplication.loadApplication,ESSEMPMyLeaveApplication.searchMLADate,ESSEMPMyLeaveApplication.logout)
  val MyLeaveEntitlementex = exec(ESSEMPMyLeaveEntitlement.loadApplication,ESSEMPMyLeaveEntitlement.searchEntitle,ESSEMPMyLeaveApplication.logout)
  val MyProfileSubmitex = exec(ESSEMPMyProfile.loadApplication,ESSEMPMyProfile.logout)

  //SUP
  val MyTeamViewClaimEntitlementex = exec(ESSSUPMyTeamViewClaimEntitlement.LoadClaimEntitlement,ESSSUPMyTeamViewClaimEntitlement.searchClaimEntitlement,ESSSUPMyTeamViewClaimEntitlement.logout)
  val MyTeamViewLeaveEntitlementex = exec(ESSSUPMyTeamViewLeaveEntitlement.loadLeaveEntitlement,ESSSUPMyTeamViewLeaveEntitlement.clickLeaveEntitlement,ESSSUPMyTeamViewLeaveEntitlement.logout)
  val MyTeamViewLeaveApplicationex = exec(ESSSUPMyTeamViewLeaveApplication.loadLeaveApplication,ESSSUPMyTeamViewLeaveApplication.searchLeave,ESSSUPMyTeamViewLeaveApplication.logout)
  val MyTeamViewClaimApplicationex = exec(ESSSUPMyTeamViewClaimApplication.loadViewClaimApplication,ESSSUPMyTeamViewClaimApplication.clickRequestId,ESSSUPMyTeamViewClaimApplication.closeClaimApplication,ESSSUPMyTeamViewClaimApplication.logout)
  val MyWorkflowClaimex = exec(ESSSUPMyWorkflowClaim.loadApplication,ESSSUPMyWorkflowClaim.logout)
  val MyWorkflowDelegationex = exec(ESSSUPMyWorkflowDelegation.loadApplication,ESSSUPMyWorkflowDelegation.logout)
  val MyWorkflowEprofileChangeex = exec(ESSSUPMyWorkflowEProfileChanges.loadApplication,ESSSUPMyWorkflowEProfileChanges.logout)
  val MyWorkflowMassApprovalex = exec(ESSSUPMyWorkflowMassApprovalView.loadApplication,ESSSUPMyWorkflowMassApprovalView.logout)
  val MyWorkflowViewLeaveApplicationex = exec(ESSSUPMyWorkflowViewLeaveApplication.loadApplication,ESSSUPMyWorkflowViewLeaveApplication.logout)

  //HR
  val EmployeeListingReportex = exec(EmployeeListingReport.loadReport,EmployeeListingReport.getReport,EmployeeListingReport.logout)
  val EmployeeMovementReportex = exec(EmployeeMovementReport.loadMovementReport,EmployeeMovementReport.FilterForm,EmployeeMovementReport.clickSearch,EmployeeMovementReport.logout)
  val FixedTransactionListingex = exec(FixedTransactionListing.loadFixedTransaction,FixedTransactionListing.selectFilter,FixedTransactionListing.clickSearch,FixedTransactionListing.logout)
  val EmployeeLeaveApproverListingex = exec(EmployeeLeaveApproverListingReport.loadLeaveApproverListing,EmployeeLeaveApproverListingReport.searchFilter,EmployeeLeaveApproverListingReport.clickSearch,EmployeeLeaveApproverListingReport.logout)
  val LeaveApplicationReportex = exec(LeaveApplicationReport.loadApplicationReport,LeaveApplicationReport.SearchFilterApplication,LeaveApplicationReport.generateReport,LeaveApplicationReport.logout)
  val LeaveEntitlementReportex = exec(LeaveEntitlementReport.loadLeaveEntitlementReport,LeaveEntitlementReport.searchProcess,LeaveEntitlementReport.submitSearch,LeaveEntitlementReport.logout)
  val ClaimApplicationReportex = exec(ClaimApplicationReport.LoadClaimApplicationView,ClaimApplicationReport.clickSubmit,ClaimApplicationReport.logout)
  val ExpensesDetailsforFinanceex = exec(ExpensesDetailsforFinance.loadExpensesDetails,ExpensesDetailsforFinance.submitForm,ExpensesDetailsforFinance.logout)
  val ExpensesDetailsforClaimex = exec(ExpensesDetailsforClaim.loadExpensesDetails,ExpensesDetailsforClaim.submitForm,ExpensesDetailsforClaim.logout)


  val debug = exec(session => {

    session
  })

  //EMP
  val ApplyLeaveSaveDraft = scenario("Apply Leave Save Draft").exec(login1,ALSaveDraftex,debug)
  val MyDocumentCreate = scenario("My Document Create").exec(login1,myDocumentCreateex,debug)
  val MyServiceHistory = scenario("My Service History").exec(login1,MyServiceHistoryex,debug)
  val MyWorkFlowLeave = scenario("My Workflow Leave").exec(login1,EmpMyWorkflowex,debug)
  val MyLeaveApplication = scenario("My Leave Application").exec(login1,MyLeaveApplicationex,debug)
  val MyLeaveEntitlement = scenario("My Leave Entitlement").exec(login1,MyLeaveEntitlementex,debug)
  val MyProfileSubmit = scenario("My Profile Submit").exec(login1,MyProfileSubmitex,debug)

  //EMP CLaim
  val ApplyClaim = scenario("Apply Claim Save Draft").exec(loginClaim,ApplyClaimex,debug)
  val MyClaimApplicationCheck = scenario("My Claim Application Check Claim").exec(loginClaim,checkClaimApplicationex,debug)

  //SUP
  val MyTeamViewClaimEntitlement = scenario("My Team View Claim Entitlement").exec(loginSup,MyTeamViewClaimEntitlementex,debug)
  val MyTeamViewLeaveEntitlement = scenario("My Team View Leave Entitlement").exec(loginSup,MyTeamViewLeaveEntitlementex,debug)
  val MyTeamViewLeaveApplication = scenario("My Team View Leave Application").exec(loginSup,MyTeamViewLeaveApplicationex,debug)
  val MyTeamViewClaimApplication = scenario("My Team View Claim Application").exec(loginSup,MyTeamViewClaimApplicationex,debug)
  val MyWorkflowClaim  = scenario("My Workflow Claim").exec(loginSup,MyWorkflowClaimex ,debug)
  val MyWorkflowDelegation  = scenario("My Workflow Delagation").exec(loginSup,MyWorkflowDelegationex ,debug)
  val MyWorkflowEprofileChanges = scenario("My Workflow E profile Changes").exec(loginSup,MyWorkflowEprofileChangeex ,debug)
  val MyWorkflowMassApproval  = scenario("My Workflow Mass Approval").exec(loginSup,MyWorkflowMassApprovalex,debug)
  val MyWorkflowViewLeaveApplication = scenario("My Workflow Leave Application").exec(loginSup,MyWorkflowViewLeaveApplicationex,debug)

  //HR Profile
  val ProfileEmployeeListingReportS = scenario("Profile Employee Listing Report").exec(loginHr,EmployeeListingReportex,debug)
  val ProfileEmployeeMovementReportS = scenario("Profile Employee Movement Report").exec(loginHr,EmployeeMovementReportex,debug)
  val ProfileFixedTransactionListingS = scenario("Profile Fixed Transaction Listing Report").exec(loginHr,FixedTransactionListingex,debug)
  val LeaveEmployeeApproverListingS = scenario("Leave Employee Approver Listing Report").exec(loginHr,EmployeeLeaveApproverListingex,debug)
  val LeaveApplicationReportListingS = scenario("Leave Leave Application Report").exec(loginHr,LeaveApplicationReportex,debug)
  val LeaveEntitlementReportListingS = scenario("Leave Leave Entitlement Report").exec(loginHr,LeaveEntitlementReportex,debug)
  val ClaimApplicationReportListing = scenario("Claim Application Report").exec(loginHr,ClaimApplicationReportex,debug)
  val ExpensesDetailsforFinanceListing = scenario("Expenses Details For Finance").exec(loginHr,ExpensesDetailsforFinanceex,debug)
  val ExpensesDetailsforClaimListing = scenario("Expenses Details For Claim").exec(loginHr,ExpensesDetailsforClaimex,debug)


  setUp(
    MyLeaveApplication.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    MyLeaveEntitlement.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    MyProfileSubmit.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    MyServiceHistory.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    MyWorkFlowLeave.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    MyDocumentCreate.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),
    ApplyLeaveSaveDraft.inject(rampUsers(EMPNo).during(scriptDuration.minutes)),

    ApplyClaim.inject(rampUsers(EMPNoClaim).during(scriptDuration.minutes)),
    MyClaimApplicationCheck.inject(rampUsers(EMPNoClaim).during(scriptDuration.minutes)),
    MyTeamViewLeaveApplication.inject(rampUsers(SUPNo).during(scriptDuration.minutes)),
    MyTeamViewClaimEntitlement.inject(rampUsers(SUPNo).during(scriptDuration.minutes)),
    MyTeamViewLeaveEntitlement.inject(rampUsers(SUPNo).during(scriptDuration.minutes)),
    MyWorkflowClaim.inject(rampUsers(SUPNo).during(scriptDuration.minutes)),
    MyWorkflowDelegation.inject(rampUsers(SUPNo).during(scriptDuration.minutes)),
    MyWorkflowEprofileChanges.inject(rampUsers(SUPNo).during(scriptDuration.minutes)),
    MyWorkflowMassApproval.inject(rampUsers(SUPNo).during(scriptDuration.minutes)),
    MyWorkflowViewLeaveApplication.inject(rampUsers(SUPNo).during(scriptDuration.minutes)),

    ProfileEmployeeListingReportS.inject(rampUsers(HRNo).during(scriptDuration.minutes)),
    ProfileEmployeeMovementReportS.inject(rampUsers(HRNo).during(scriptDuration.minutes)),
    ProfileFixedTransactionListingS.inject(rampUsers(HRNo).during(scriptDuration.minutes)),
    LeaveEmployeeApproverListingS.inject(rampUsers(HRNo).during(scriptDuration.minutes)),
    LeaveApplicationReportListingS.inject(rampUsers(HRNo).during(scriptDuration.minutes)),
    LeaveEntitlementReportListingS.inject(rampUsers(HRNo).during(scriptDuration.minutes)),
    ClaimApplicationReportListing.inject(rampUsers(HRNo).during(scriptDuration.minutes)),
    ExpensesDetailsforFinanceListing.inject(rampUsers(HRNo).during(scriptDuration.minutes)),
    ExpensesDetailsforClaimListing.inject(rampUsers(HRNo).during(scriptDuration.minutes))

  ).protocols(httpProtocol)
}
