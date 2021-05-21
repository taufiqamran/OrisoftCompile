package computerdatabase.Module.Workflow

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

object ESSSUPMyWorkflowClaimView {

  val uri1 = "https://maps.googleapis.com/maps/api/js"
  val uri3 = "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/fonts/fontawesome-webfont.woff2"
  val uri4 = "https://fonts.googleapis.com/css"

    def loadApplication = {
      exec(http("My Workflow Claim Page")
        .get("/works/request_lst.aspx")
        .check(bodyString.saveAs("WorkflowClaim"))
        .check(regex("""<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="(|.+?)" />""").saveAs("viewStateTable"))

      )
        .exec(http("request_66")
          .get(uri4 + "?family=Open+Sans:300,400,600,700")
        )
        .exec(http("request_67")
          .get(uri4 + "?family=Roboto:400,300,500,700")
        )
        .exec(http("request_68")
          .get("/WebResource.axd?d=pynGkmcFUV13He1Qd6_TZOYXOnLy43dRx8HCf3vqtm7Uk9Dd5QTT0bKPZkChPJpkGd7et7925jgqVFYijtH4BlZm86YPMFKavMb3jiNdHO_DkODjc9ASxqTpYjlOyMlE0&t=637505973787431984")
        )
        .exec(http("request_69")
          .get("/ScriptResource.axd?d=x6wALODbMJK5e0eRC_p1LTFBEqAduy6yzdGuAMP1dHrya3_IF2A8CsbaRF-ARwHq6m-SGT1rW_kEfDOVxpLiOwBwjQzZMYd6yIJvZ9ubgIyIzxTTWWPxLOJ6h2brQiXEeYW7vHWkdtbfdWvIHio91FSsDXmcUmI7kjdMETOH_XE1&t=51e37521")
        )
        .exec(http("request_70")
          .get("/ScriptResource.axd?d=P5lTttoqSeZXoYRLQMIScIf12FcrWAiNVtlJxQA9qnTW6iJpMmht7uXNg23QNwOPVke9qF6NTd062q-kq39p4MmkxhZ1ti3ckmNVSJHDik9HIeiTEBJ8AeazBYyjXlRbQWV2Q8-MBT7ldJqGwC6gtX5XcIt2Wd4nEFDQxuD-poI1&t=51e37521")
        )
        .exec(http("request_71")
          .get("/ScriptResource.axd?d=XGoPW3Unw0ILT0eb9sSUayB1PCvz0eeMXm23ajXUnLKSVWvpEIM7qNdgqQtwIk3oGSO-umSPRJr1BQNhALudg4-gDqI9ltlNkOQMrPf4fNHBEAhja6GHf4He4_YSEbkQ4L1Bsn1aV_AF11ks4fQlTNxlg6tYk_UGpXjfNcFSD6D49VS2gjNTnElk4fHlLsM90&t=51e37521")
        )
        .exec(http("request_72")
          .get("/ScriptResource.axd?d=uvA9ANM76Fbpm1FfUlagnYp2obqkhmwI_C-NoQ89dB6TwrO7THFVAk1nHl1QRi68J_pozjXYUJHgZb6l02O3dvVqjaOzdIW44mTvv4FyAQ5MvnVeKZmB7OtG9BNkATLGOGWXvK2djBpsGpZ_x3Mi2KdwGSD0SZeW5VvD940G1Y8Cml0nm6ok2UFWSXa6k4SQ0&t=51e37521")
        )
        .exec(http("request_73")
          .post("/verify_access.ashx")
        )
        .exec(http("request_74")
          .get("/works/request_lst.aspx?_TSM_CombinedScripts_=True&v=ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1&_TSM_Bundles_=&cdn=False")
        )
        .pause(119.milliseconds)
        .exec(http("request_75")
          .get("/Content/ESS/fonts/icomoon.ttf?5vru0d")
        )
        .exec(http("request_76")
          .get("/Notifications/GetNotificationCounts")
        )
        .exec(http("request_77")
          .get("/Account/VerifyAccess")
        )
        .exec(http("request_78")
          .get("/Notifications/ViewNotifications?type=Wb6RlA4XG6fXKkO5Hk+GmIsUR9pknj7q3I9naTLLruuzpo/KsTQEpmowv4wwz1bchOb5vkqCEGER3nGPvCReWZviC1CokqCCaHkc/45e9Ojj3kmNls4ebMYaadYaBQ/6BOf4+DD78A6iWGEv3r+lGg8c43+Witis11IMeIFTs5M=")
        )
        .exec(http("request_79")
          .get(uri3 + "?v=4.7.0")
        )
        .exec(http("request_80")
          .get("/Account/VerifyAccess")
        )
        .exec(http("request_81")
          .get("/Notifications/GetNotificationsList?row=8")
        )
        .pause(96)
    }

    def logout = {
      exec(http("Logout Process")
        .post("/works/request_lst.aspx")

        .formParam("__EVENTTARGET", "ctl00$ctl00$ctl00$lbLogout")
        .formParam("__EVENTARGUMENT", "")
        .formParam("_TSM_HiddenField_", "ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1")
        .formParam("__VIEWSTATE", "${viewStateTable}")
        .formParam("__VIEWSTATEGENERATOR", "197FAB68")
        .formParam("ctl00$ctl00$ctl00$selCultureName", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$hfMode", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$hfStatus", "[P]")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtRequestID", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$selActionType", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtRequestorName", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$selRequestType", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtDateFrom", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtDateTo", "")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtStatus", "Pending")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$cbStatus$0", "P")
        .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$gvSearch$ctl12$gpCustomPager$txtPageSize", "50")
        .check(status.is(302)))
        .exec(http("Login - After Logout")
          .get("/Account/Login")
        )
        .exec(http("request_84")
          .get("/Content/css?v=w9USDPGryprQSMA62T1giyRXrtqAIG-BphxyQY0Qw_w1")
        )
        .exec(http("request_85")
          .get("/DXR.axd?r=1_17,0_2214,1_50,1_53,1_51,1_16,0_2219,0_2312,0_2317-4WXkk")
        )
        .exec(http("request_86")
          .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_208,1_216,1_212,1_189,1_222,17_42,1_297,1_215,1_207,1_289,1_205,17_7,1_287,1_211,17_23,1_197,17_1-lUXkk")
        )
        .exec(http("request_87")
          .get("/DXR.axd?r=1_58-lUXkk")
        )
        .exec(http("request_88")
          .get("/bundles/jquery?v=w1vknpWt6KqlZcHeJQvaK6VbvvXt1Go8HcGH_DqKzzo1")
        )
        .pause(133.milliseconds)
        .exec(http("request_89")
          .get("/Content/Images/bg-login.jpg?V=03")
        )
        .exec(http("request_90")
          .get("/Content/fonts/icomoon.ttf?5vru0d")
        )
    }




}