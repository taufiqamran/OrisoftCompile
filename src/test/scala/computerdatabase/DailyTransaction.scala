package computerdatabase

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import computerdatabase.Module.Login._
import computerdatabase.Module.Leave._
import computerdatabase.Module.Claim._


class DailyTransaction extends Simulation{


  val httpProtocol = http
    .baseUrl("https://orisoftst.orisoftsaas.com")
    .disableFollowRedirect

  var loginFeeder1 = csv("data/ESSEMPLogin1001-2000.csv").queue

  val loginSupFeeder1 = csv("data/superior_Credential.csv").queue

  //Login Employee
  val login = feed(loginFeeder1).exec(Login.loginProcess).exec(Login.loadDashboard)

  //Login Superior
  val loginSup = feed(loginSupFeeder1).exec(Login.loginProcess).exec(Login.loadDashboard)

  //EMP
  val ALSaveDraftex = exec(ESSEMPApplyLeave.loadLeaveForm,ESSEMPApplyLeave.saveLeaveDraft,ESSEMPApplyLeave.leaveLogout)
  val ALDeleteDraftex = exec(ESSEMPApplyLeave.loadLeaveForm,ESSEMPApplyLeave.getSavedDraft,ESSEMPApplyLeave.deleteSavedDraft,ESSEMPApplyLeave.leaveLogout)
  val ALSubmitDraftex = exec(ESSEMPApplyLeave.loadLeaveForm,ESSEMPApplyLeave.submitLeave,ESSEMPApplyLeave.leaveLogout)
  val checkClaimApplicationex = exec(ESSEMPMyClaimApplication.loadMyClaimApplication,ESSEMPMyClaimApplication.selectClaimApplication,ESSEMPMyClaimApplication.logout)
  val withdrawClaimApplicationex = exec(ESSEMPMyClaimApplication.loadMyClaimApplication,ESSEMPMyClaimApplication.selectClaimApplication,ESSEMPMyClaimApplication.withdrawClaim,ESSEMPMyClaimApplication.logout)

  //SUP
  val MyTeamViewClaimEntitlementex = exec(ESSSUPMyTeamViewClaimEntitlement.LoadClaimEntitlement,ESSSUPMyTeamViewClaimEntitlement.searchClaimEntitlement   ,ESSSUPMyTeamViewClaimEntitlement.logout)


  val debug = exec(session => {

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

  setUp(MyTeamViewClaimEntitlement.inject(atOnceUsers(1))).protocols(httpProtocol)

}
