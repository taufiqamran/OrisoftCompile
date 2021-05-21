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


  val httpProtocol = http
    .baseUrl("https://orisoftst.orisoftsaas.com")
    .disableFollowRedirect

  var loginFeeder1 = csv("data/ESSEMPLogin1001-2000.csv").queue

  var loginClaimFeeder1 = csv("data/ESSEMPLogin-Claim100.csv").queue

  val loginSupFeeder1 = csv("data/superior_Credential.csv").queue

  val loginHrFeeder = csv("data/hr_Credential.csv").queue

  //Login Employee
  val login = feed(loginFeeder1).exec(Login.loginProcess).exec(Login.loadDashboard)

  //Login Employee Claim
  val loginClaim = feed(loginClaimFeeder1).exec(Login.loginProcess).exec(Login.loadDashboard)

  //Login Superior
  val loginSup = feed(loginSupFeeder1).exec(Login.loginProcess).exec(Login.loadDashboard)

  //Login HR
  val loginHr = feed(loginHrFeeder).exec(Login.loginProcess).exec(Login.loadDashboard)

  //EMP
  val ALSaveDraftex = exec(ESSEMPApplyLeave.loadLeaveForm,ESSEMPApplyLeave.leaveLogout)
  val checkClaimApplicationex = exec(ESSEMPMyClaimApplication.loadMyClaimApplication,ESSEMPMyClaimApplication.logout)
  val MyServiceHistoryex = exec(ESSEMPMyServiceHistory.loadServicePage,ESSEMPMyServiceHistory.searchService,ESSEMPMyServiceHistory.logout)
  val myDocumentCreateex = exec(ESSEMPMyDocument.loadMyDocument,ESSEMPMyDocument.logout)
  val EmpMyWorkflowex = exec(ESSEMPMyWorkflow.loadApplication,ESSEMPMyWorkflow.logout)
  val ApplyClaimex = exec(ESSEMPMyApplyClaim.loadApplication,ESSEMPMyApplyClaim.logout)
  val MyLeaveApplicationex = exec(ESSEMPMyLeaveApplication.loadApplication,ESSEMPMyLeaveApplication.searchMLADate,ESSEMPMyLeaveApplication.logout)
  val MyLeaveEntitlementex = exec(ESSEMPMyLeaveEntitlement.loadApplication,ESSEMPMyLeaveEntitlement.searchEntitle,ESSEMPMyLeaveApplication.logout)
  val MyProfileSubmitex = exec(ESSEMPMyProfile.loadApplication,ESSEMPMyProfile.logout)

  //SUP
  val MyTeamViewClaimEntitlementex = exec(ESSSUPMyTeamViewClaimEntitlement.LoadClaimEntitlement,ESSSUPMyTeamViewClaimEntitlement.searchClaimEntitlement   ,ESSSUPMyTeamViewClaimEntitlement.logout)
  val MyTeamViewLeaveEntitlementex = exec(ESSSUPMyTeamViewLeaveEntitlement.loadLeaveEntitlement,ESSSUPMyTeamViewLeaveEntitlement.clickLeaveEntitlement   ,ESSSUPMyTeamViewLeaveEntitlement.logout)
  val MyTeamViewLeaveApplicationex = exec(ESSSUPMyTeamViewLeaveApplication.loadLeaveApplication,ESSSUPMyTeamViewLeaveApplication.searchLeave,ESSSUPMyTeamViewLeaveApplication.clickRequestId,ESSSUPMyTeamViewLeaveApplication.logout)
  val MyTeamViewClaimApplicationex = exec(ESSSUPMyTeamViewClaimApplication.loadViewClaimApplication,ESSSUPMyTeamViewClaimApplication.clickRequestId,ESSSUPMyTeamViewClaimApplication.closeClaimApplication,ESSSUPMyTeamViewClaimApplication.logout)
  val MyWorkflowClaimex = exec(ESSSUPMyWorkflowClaimView.loadApplication,ESSSUPMyWorkflowClaimView.logout)
  val MyWorkflowDelegationex = exec(ESSSUPMyWorkflowDelegationView.loadApplication,ESSSUPMyWorkflowDelegationView.logout)
  val MyWorkflowEprofileChangeex = exec(ESSSUPMyWorkflowEProfileChangesView.loadApplication,ESSSUPMyWorkflowEProfileChangesView.logout)
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
  val ApplyLeaveSaveDraft = scenario("Apply Leave Save Draft").exec(login,ALSaveDraftex,debug)
  val MyDocumentCreate = scenario("My Document Create").exec(login,myDocumentCreateex,debug)
  val MyServiceHistory = scenario("My Service History").exec(login,MyServiceHistoryex,debug)
  val MyWorkFlowLeave = scenario("My Workflow Leave").exec(login,EmpMyWorkflowex,debug)
  val MyLeaveApplication = scenario("My Leave Application").exec(login,MyLeaveApplicationex,debug)
  val MyLeaveEntitlement = scenario("My Leave Entitlement").exec(login,MyLeaveEntitlementex,debug)
  val MyProfileSubmit = scenario("My Profile Submit").exec(login,MyProfileSubmitex,debug)

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


  setUp(ApplyLeaveSaveDraft.inject(atOnceUsers(1)),
  MyDocumentCreate.inject(atOnceUsers(1)),
  MyServiceHistory.inject(atOnceUsers(1)),
 MyWorkFlowLeave.inject(atOnceUsers(1)),
 MyLeaveApplication.inject(atOnceUsers(1)),
 MyLeaveEntitlement.inject(atOnceUsers(1)),
 MyProfileSubmit.inject(atOnceUsers(1)),
 ApplyClaim.inject(atOnceUsers(1)),
 MyClaimApplicationCheck.inject(atOnceUsers(1)),
 MyTeamViewClaimEntitlement.inject(atOnceUsers(1)),
 MyTeamViewLeaveEntitlement.inject(atOnceUsers(1)),
 MyTeamViewLeaveApplication.inject(atOnceUsers(1)),
 MyTeamViewClaimApplication.inject(atOnceUsers(1)),
  ProfileEmployeeListingReportS.inject(atOnceUsers(1)),
  ProfileEmployeeMovementReportS.inject(atOnceUsers(1)),
  ProfileFixedTransactionListingS.inject(atOnceUsers(1)),
  LeaveEmployeeApproverListingS.inject(atOnceUsers(1)),
  LeaveApplicationReportListingS.inject(atOnceUsers(1)),
  LeaveEntitlementReportListingS.inject(atOnceUsers(1)),
  ClaimApplicationReportListing.inject(atOnceUsers(1)),
  ExpensesDetailsforFinanceListing.inject(atOnceUsers(1)),
  ExpensesDetailsforClaimListing.inject(atOnceUsers(1)),
    MyWorkflowClaim.inject(atOnceUsers(1)),
 MyWorkflowDelegation.inject(atOnceUsers(1)),
 MyWorkflowEprofileChanges.inject(atOnceUsers(1)),
 MyWorkflowMassApproval.inject(atOnceUsers(1)),
 MyWorkflowViewLeaveApplication.inject(atOnceUsers(1))
  ).protocols(httpProtocol)
}
