package computerdatabase.Module.Claim

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import scala.util.matching.Regex
import computerdatabase.Module.Claim.ESSEMPMyClaimApplicationWithdraw._
object ESSEMPMyClaimApplication {

  val uri1 = "https://maps.googleapis.com/maps/api/js"
  val uri3 = "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/fonts/fontawesome-webfont.woff2"
  val uri4 = "https://fonts.googleapis.com/css"

  def loadMyClaimApplication = {
    exec(http("Open My Claim Application")
      .get("/Claim/ApplicationListing")
      .check(regex("""<input name="__RequestVerificationToken" type="hidden" value="(.+?)" />""")	.find.saveAs("__RequestVerificationTokenLogout"))
    )
      .exec(http("request_47")
        .get("/bundles/jquery?v=_pxGe3mY2bQf-xjm4AiFp6ZjEyA5oTa8PuEQsuJbzEk1"))
      .exec(http("request_48")
        .get("/Scripts/ExecutiveDashboardBundle?v=hjG6uA4G8jx4L1ddHEH1O9rf3Ul4d41_HZHzUxDR9k41"))
      .exec(http("request_49")
        .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49-O3Vxm&p=b691a7d7"))
      .exec(http("request_50")
        .get("/Scripts/ExecutiveDashboardBundle/SideMenu?v=wmt4mX4cYH0d844GQc8r_NWCLWWdnZ_egKD54y34J2U1"))
      .exec(http("request_51")
        .get("/bundles/bootstrap?v=2Fz3B0iizV2NnnamQFrx-NbYJNTFeBJ2GM05SilbtQU1"))
      .exec(http("request_52")
        .get("/Content/Images/unifiedhcms_logo.png?V=01"))
      .exec(http("request_53")
        .get("/DXR.axd?r=1_58-N3Vxm"))
      .exec(http("request_54")
        .get("/profile_picture.ashx?EmployeeID=7317"))
      .exec(http("request_55")
        .get("/Scripts/MasterDevExBundle?v=0Nfn5KbcdrNt5eTp8R1rjNA5IlQgPjvDQ2MUmQSG31o1"))
      .exec(http("request_56")
        .get("/Content/css/root?v=fQqb8rdb3SX3t_q5clLhrjqLMPJRz5XyrffvnRHeaqY1"))
      .exec(http("request_57")
        .get("/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1"))
      .exec(http("request_58")
        .get("/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1"))
      .exec(http("request_59")
        .get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A"))
      .exec(http("request_60")
        .get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1"))
      .exec(http("request_61")
        .get(uri3 + "?family=Open+Sans:300,400,600,700"))
      .exec(http("request_62")
        .get(uri3 + "?family=Roboto:400,300,500,700"))
      .exec(http("request_63")
        .get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7-O3Vxm"))
      .exec(http("request_64")
        .get("/signalr/hubs")
      )
      .pause(164.milliseconds)
      .exec(http("request_65")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .pause(1)
      .exec(http("request_66")
        .get("/DXR.axd?r=0_2314-O3Vxm"))
      .pause(869.milliseconds)
      .exec(http("request_67")
        .get("/Notifications/GetNotificationUserId")
      )
      .exec(http("request_68")
        .get("/signalr/negotiate?clientProtocol=2.1&userid=KM00393&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1620719817280")
      )
      .exec(http("request_69")
        .get("/Notifications/GetNotificationCounts")
      )
      .pause(1)
      .exec(http("request_70")
        .get("/DXR.axd?r=0_2316-O3Vxm"))
      .pause(1)
      .exec(http("request_71")
        .get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=KM00393&connectionToken=MWNQB76lYO4ABrqjghOyb9%2FFiJXCFFH0XYFfwy5b68pXyF43myD2sZIPsLhSN%2Bl1fEwRWI6LVydeGk0YoGPZwlTLpXKLr9nyXXuCANZqPu6jMXt0ug8RvICznvRVWTmINGTn9GXGtlZgiE3Lz57JZlGT%2BAzW70VYbM0UumuH2Do%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1620719817281")
      )
      .pause(698.milliseconds)
      .exec(http("request_72")
        .post("/Account/VerifyAccess")
      )
  }

  def selectClaimApplication = {

    exec(http("request_74")
      .post("/Claim/ClaimApplicationListingGridViewPartial")
      .formParam("CustomSearchParameters[0][Name]", "RequestId")
      .formParam("CustomSearchParameters[0][Value]", "")
      .formParam("CustomSearchParameters[1][Name]", "ClaimStatus")
      .formParam("CustomSearchParameters[1][Value]", "P")
      .formParam("CustomSearchParameters[2][Name]", "ClaimRequestType")
      .formParam("CustomSearchParameters[2][Value]", "claimapplication")
      .formParam("CustomSearchParameters[3][Name]", "SubmissionDateFrom")
      .formParam("CustomSearchParameters[3][Value]", "2020/04/11")
      .formParam("CustomSearchParameters[4][Name]", "SubmissionDateTo")
      .formParam("CustomSearchParameters[4][Value]", "2022/05/11")
      .check(regex("""<td id="gvClaimApplicationListing_tccell0_0" class="dx-wrap dxgv dx-al"><a class="dxeHyperlink_MetropolisBlue" id="hl1" href="(|.+?)">""").saveAs("URL"))
    )
      .exec(session =>{
        val url = session("URL").as[String]
        println(s"URL : $url")

        session
      })

      .exec(http("request_75")
        .get(uri1 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Forisoftst.orisoftsaas.com%2FClaim%2FApplicationListing&4sAIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&callback=_xdc_._q2vodm&key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&token=5226")
      )
      .exec(http("request_76")
        .get("/DXR.axd?r=0_2223-O3Vxm"))
      .exec(http("request_77")
        .get("/DXR.axd?r=0_2216-O3Vxm"))
      .pause(4)

      .exec(http("Click Request ID")
        .get("${URL}")
        .check(bodyString.saveAs("BodyRequestId"))
        .check(regex("""<input id="hdnAgentID" name="hdnAgentID" type="hidden" value="(|.+?)" />""").saveAs("agentId"))
      )
      .exec(session => {
        val bodySearch = session("BodyRequestId").as[String]
        val value = new Regex("REQUEST_NO\\\\\":\\\\\"(.+)\\\\\",\\\\\"LOCATION")
        val empNoValue = ((value.findAllIn(bodySearch)).mkString).split("\\\\")(2).replace("\"","")
        println(s"Value : $empNoValue")
        session.set("requestNo",empNoValue)
      })
      .exec(http("request_79")
        .get("/bundles/jquery?v=_pxGe3mY2bQf-xjm4AiFp6ZjEyA5oTa8PuEQsuJbzEk1"))
      .exec(http("request_80")
        .get("/Scripts/ExecutiveDashboardBundle?v=hjG6uA4G8jx4L1ddHEH1O9rf3Ul4d41_HZHzUxDR9k41"))
      .exec(http("request_81")
        .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49-O3Vxm&p=b691a7d7"))
      .exec(http("request_82")
        .get("/Scripts/ExecutiveDashboardBundle/SideMenu?v=wmt4mX4cYH0d844GQc8r_NWCLWWdnZ_egKD54y34J2U1"))
      .exec(http("request_83")
        .get("/bundles/bootstrap?v=2Fz3B0iizV2NnnamQFrx-NbYJNTFeBJ2GM05SilbtQU1"))
  }

    def withdrawClaim = {
      exec(Withdraw.WithdrawProcess)
    }

  def logout = {
    exec(http("Logout")
      .post("/Account/LogOff")

      .formParam("__RequestVerificationToken", "${__RequestVerificationTokenLogout}")
      .formParam("DXScript", "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49")
      .formParam("DXCss", "/Content/css/root?v=fQqb8rdb3SX3t_q5clLhrjqLMPJRz5XyrffvnRHeaqY1,0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css,/Content/Claim.css")
      .check(status.is(302)))
      .exec(http("request_106")
        .get("/Account/Login")
      )
      .exec(http("request_107")
        .get("/bundles/jquery?v=_pxGe3mY2bQf-xjm4AiFp6ZjEyA5oTa8PuEQsuJbzEk1"))
      .exec(http("request_108")
        .get("/DXR.axd?r=1_58-N3Vxm"))
      .exec(http("request_109")
        .get("/DXR.axd?r=1_17,0_2214,1_50,1_53,1_51,1_16,0_2219,0_2312,0_2317-O3Vxm"))
      .exec(http("request_110")
        .get("/Content/css?v=w9USDPGryprQSMA62T1giyRXrtqAIG-BphxyQY0Qw_w1"))
      .exec(http("request_111")
        .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_208,1_216,1_212,1_189,1_222,17_42,1_297,1_215,1_207,1_289,1_205,17_7,1_287,1_211,17_23,1_197,17_1-N3Vxm"))
      .pause(163.milliseconds)
      .exec(http("request_112")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
      .pause(303.milliseconds)
      .exec(http("request_113")
        .get("/Content/Images/bg-login.jpg?V=03"))
  }
}
