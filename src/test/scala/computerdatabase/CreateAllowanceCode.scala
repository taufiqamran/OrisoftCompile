package computerdatabase

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class CreateAllowanceCode extends Simulation {

	val httpProtocol = http
		.baseUrl("https://orisoftst.orisoftsaas.com")
		.disableFollowRedirect
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.101 Safari/537.36")

    val uri1 = "https://maps.googleapis.com/maps/api/js"
    val uri3 = "https://fonts.googleapis.com/css"

	val chain_0 = exec(http("request_0")
			.get("/")
		.check(regex("""<input name="__RequestVerificationToken" type="hidden" value="(.+?)" />""").find.saveAs("__RequestVerificationToken"))
			)
		.exec(http("request_1")
			.get("/bundles/jquery?v=BOadP4NdMhfEAxOx_qgeCESNgZMYYlRzghlNUzq6K-Y1"))
		.exec(http("request_2")
			.get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_208,1_216,1_212,1_189,1_222,17_42,1_297,1_215,1_207,1_289,1_205,17_7,1_287,1_211,17_23,1_197,17_1-N3Vxm"))
		.exec(http("request_3")
			.get("/DXR.axd?r=1_58-N3Vxm"))
		.exec(http("request_4")
			.get("/DXR.axd?r=1_17,0_2214,1_50,1_53,1_51,1_16,0_2219,0_2312,0_2317-O3Vxm"))
		.exec(http("request_5")
			.get("/Content/css?v=w9USDPGryprQSMA62T1giyRXrtqAIG-BphxyQY0Qw_w1"))
		.pause(104.milliseconds)
		.exec(http("request_6")
			.get("/Content/fonts/icomoon.ttf?5vru0d")
			)
		.pause(120.milliseconds)
		.exec(http("request_7")
			.get("/Content/Images/bg-login.jpg?V=03"))
		.pause(6)
		.exec(http("request_8")
			.post("/")
			
			.formParam("__RequestVerificationToken", "${__RequestVerificationToken}")
			.formParam("TIMEZONE_OFFSET", "480")
			.formParam("CUSTOMER_CODE$State", "{&quot;rawValue&quot;:&quot;pnt&quot;}")
			.formParam("CUSTOMER_CODE", "pnt")
			.formParam("USERID$State", "{&quot;rawValue&quot;:&quot;KM00023&quot;}")
			.formParam("USERID", "KM00023")
			.formParam("USERPWD$State", "{&quot;rawValue&quot;:&quot;pantai123&quot;}")
			.formParam("USERPWD", "pantai123")
			.formParam("selLanguage_VI", "")
			.formParam("selLanguage", "English")
			.formParam("selLanguage$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("selLanguage$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("selLanguage$DDD$L", "")
			.formParam("btnSignIn", "Sign In")
			.formParam("DXScript", "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_208,1_216,1_212,1_189,1_222,17_42,1_297,1_215,1_207,1_289,1_205,17_7,1_287,1_211,17_23,1_197,17_1")
			.formParam("DXCss", "/Content/css?v=w9USDPGryprQSMA62T1giyRXrtqAIG-BphxyQY0Qw_w1,1_17,0_2214,1_50,1_53,1_51,1_16,0_2219,0_2312,0_2317")
			.formParam("DXMVCEditorsValues", """{"CUSTOMER_CODE":"pnt","USERID":"KM00023","USERPWD":"pantai123","selLanguage_DDD_L":[],"selLanguage":null}""")
			.check(status.is(302)))
		.exec(http("request_9")
			.get("/Home/Dashboard")
			)
		.exec(http("request_10")
			.get("/bundles/jquery?v=BOadP4NdMhfEAxOx_qgeCESNgZMYYlRzghlNUzq6K-Y1"))
		.exec(http("request_11")
			.get("/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1"))
		.exec(http("request_12")
			.get("/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1"))
		.exec(http("request_13")
			.get("/DXR.axd?r=1_58-N3Vxm"))
		.exec(http("request_14")
			.get("/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1"))
		.exec(http("request_15")
			.get("/Scripts/ExecutiveDashboardBundle?v=hjG6uA4G8jx4L1ddHEH1O9rf3Ul4d41_HZHzUxDR9k41"))
		.exec(http("request_16")
			.get("/Scripts/ExecutiveDashboardBundle/SideMenu?v=wmt4mX4cYH0d844GQc8r_NWCLWWdnZ_egKD54y34J2U1"))
		.exec(http("request_17")
			.get("/bundles/bootstrap?v=2Fz3B0iizV2NnnamQFrx-NbYJNTFeBJ2GM05SilbtQU1"))
		.exec(http("request_18")
			.get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7-O3Vxm"))
		.exec(http("request_19")
			.get(uri3 + "?family=Open+Sans:300,400,600,700"))
		.exec(http("request_20")
			.get(uri3 + "?family=Roboto:400,300,500,700"))
		.exec(http("request_21")
			.get("/Scripts/MasterDevExBundle?v=h24JJD8hLg2uCOXtSNYJSvolBvJAIdCvb-_JDWPC9d41"))
		.exec(http("request_22")
			.get("/Content/fonts/icomoon.ttf?5vru0d")
			)
		.exec(http("request_23")
			.get("/signalr/hubs")
			)
		.exec(http("request_24")
			.get("/Content/css/dashboard?v=K9QTZqM85yMd9U6HphxfFJh4UfmNZDGAQzYRDkSO0Ag1"))
		.exec(http("request_25")
			.get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49-O3Vxm&p=b691a7d7"))
		.exec(http("request_26")
			.get("/Scripts/DashboardBundle?v=sRc8znFM4JYybonDFYc1vF6_RucTl7PF_nDDxiusOaU1"))
		.exec(http("request_27")
			.get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A"))
		.exec(http("request_28")
			.get("/Content/Images/unifiedhcms_logo.png?V=01"))
		.exec(http("request_29")
			.get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1"))
		.exec(http("request_30")
			.get("/profile_picture.ashx?EmployeeID=5302"))
		.exec(http("request_31")
			.get("/DXR.axd?r=1_58-N3Vxm"))
		.pause(611.milliseconds)
		.exec(http("request_32")
			.get("/DXR.axd?r=0_2303-O3Vxm"))
		.exec(http("request_33")
			.get("/Notifications/GetNotificationCounts")
			)
		.exec(http("request_34")
			.get("/Notifications/GetNotificationUserId")
			)
		.exec(http("request_35")
			.get("/signalr/negotiate?clientProtocol=2.1&userid=KM00023&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1623828276020")
			)
		.pause(1)
		.exec(http("request_36")
			.get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=KM00023&connectionToken=tXWGTJr3jSU8xBGpR8VWyM3%2FG2c5usWo3pyZNT19Gd0HB7r6wRKoKIDN78b9UxbasoXu3eie2dn5SayTVdv%2BqXwMaqTvfblBEX%2Fjfq3jnpUWXlv%2F1wcZYSTGXUDb%2Fbk8GS2PdlWHg3U%2B11B5Nh2ww4elvDz5ZIuHrwmYgDQOp%2FE%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1623828276021")
			)
		.exec(http("request_37")
			.get("/Home/DashboardWidgetPartial")
			)
		.pause(217.milliseconds)
		.exec(http("request_38")
			.get("/DXR.axd?r=0_2223-O3Vxm"))
		.pause(227.milliseconds)
		.exec(http("request_39")
			.get("/profile_picture.ashx?EmployeeID=7317"))
		.exec(http("request_40")
			.get("/profile_picture.ashx?EmployeeID=9126"))
		.exec(http("request_41")
			.get("/PayrollProcess/ProcessControlPanel")
			)
		.exec(http("request_42")
			.post("/GetLeaveJson")
			
			.formParam("leaveType", "0")
			.formParam("nShowSubord", "1")
			.formParam("nShowSubordInd", "0")
			.formParam("dateFrom", "2021-05-30")
			.formParam("dateTo", "2021-07-11")
			.formParam("start", "2021-05-30")
			.formParam("end", "2021-07-11"))
		.exec(http("request_43")
			.post("/GetHolidayJson")
			
			.formParam("dateFrom", "2021-05-30")
			.formParam("dateTo", "2021-07-11")
			.formParam("start", "2021-05-30")
			.formParam("end", "2021-07-11"))
		.exec(http("request_44")
			.post("/GetLeaveJson")
			
			.formParam("leaveType", "2")
			.formParam("nShowSubord", "1")
			.formParam("nShowSubordInd", "0")
			.formParam("dateFrom", "2021-05-30")
			.formParam("dateTo", "2021-07-11")
			.formParam("start", "2021-05-30")
			.formParam("end", "2021-07-11"))
		.exec(http("request_45")
			.post("/GetLeaveJson")
			
			.formParam("leaveType", "1")
			.formParam("nShowSubord", "1")
			.formParam("nShowSubordInd", "0")
			.formParam("dateFrom", "2021-05-30")
			.formParam("dateTo", "2021-07-11")
			.formParam("start", "2021-05-30")
			.formParam("end", "2021-07-11"))
		.exec(http("request_46")
			.get("/profile_picture.ashx?EmployeeID=6433"))
		.exec(http("request_47")
			.get("/profile_picture.ashx?EmployeeID=6652"))
		.exec(http("request_48")
			.get("/profile_picture.ashx?EmployeeID=7452"))
		.exec(http("request_49")
			.get("/profile_picture.ashx?EmployeeID=8196"))
		.exec(http("request_50")
			.get("/profile_picture.ashx?EmployeeID=11135"))
		.exec(http("request_51")
			.get("/profile_picture.ashx?EmployeeID=10376"))
		.exec(http("request_52")
			.get("/GlobalLeaveApplication/GlobalLeaveApplicationCriteria")
			)
		.pause(1)
		.exec(http("request_53")
			.get(uri1 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Forisoftst.orisoftsaas.com%2FHome%2FDashboard&4sAIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&callback=_xdc_._vo75l9&key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&token=101169")
			)
		.exec(http("request_54")
			.get("/SalaryAdvanceProcess/ProcessControlPanel")
			)
		.pause(173.milliseconds)
		.exec(http("request_55")
			.get("/Transaction/TransactionCode")
			
			.check(status.is(302)))
		.exec(http("request_56")
			.get("/Transaction/Allowance")
			
			.check(status.is(302)))
		.pause(3)
		.exec(http("request_57")
			.get("/bundles/jquery?v=BOadP4NdMhfEAxOx_qgeCESNgZMYYlRzghlNUzq6K-Y1"))
		.exec(http("request_58")
			.get("/Scripts/ExecutiveDashboardBundle?v=hjG6uA4G8jx4L1ddHEH1O9rf3Ul4d41_HZHzUxDR9k41"))
		.exec(http("request_59")
			.get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49-O3Vxm&p=b691a7d7"))
		.exec(http("request_60")
			.get("/Scripts/ExecutiveDashboardBundle/SideMenu?v=wmt4mX4cYH0d844GQc8r_NWCLWWdnZ_egKD54y34J2U1"))
		.exec(http("request_61")
			.get("/bundles/bootstrap?v=2Fz3B0iizV2NnnamQFrx-NbYJNTFeBJ2GM05SilbtQU1"))
		.exec(http("request_62")
			.get("/Content/Images/unifiedhcms_logo.png?V=01"))
		.exec(http("request_63")
			.get("/DXR.axd?r=1_58-N3Vxm"))
		.exec(http("request_64")
			.get("/profile_picture.ashx?EmployeeID=5302"))
		.exec(http("request_65")
			.get("/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1"))
		.exec(http("request_66")
			.get("/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1"))
		.exec(http("request_67")
			.get("/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1"))
		.exec(http("request_68")
			.get("/Scripts/MasterDevExBundle?v=h24JJD8hLg2uCOXtSNYJSvolBvJAIdCvb-_JDWPC9d41"))
		.exec(http("request_69")
			.get(uri3 + "?family=Open+Sans:300,400,600,700"))
		.exec(http("request_70")
			.get(uri3 + "?family=Roboto:400,300,500,700"))
		.exec(http("Open Allowance Listing")
			.get("/TransactionMY/Allowance/MY/Listing")

			)
		.exec(http("request_72")
			.get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317,0_5685,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7-O3Vxm"))
		.exec(http("request_73")
			.get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A"))
		.exec(http("request_74")
			.get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1"))
		.exec(http("request_75")
			.get("/signalr/hubs")
			)
		.pause(111.milliseconds)
		.exec(http("request_76")
			.get("/Content/fonts/icomoon.ttf?5vru0d")
			)
		.pause(860.milliseconds)
		.exec(http("request_77")
			.get("/DXR.axd?r=0_5687-O3Vxm"))
		.exec(http("request_78")
			.get("/DXR.axd?r=0_2314-O3Vxm"))
		.exec(http("request_79")
			.get("/DXR.axd?r=0_2321-O3Vxm"))
		.exec(http("request_80")
			.get("/DXR.axd?r=0_2223-O3Vxm"))
		.exec(http("request_81")
			.get("/DXR.axd?r=0_2216-O3Vxm"))
		.exec(http("request_82")
			.get("/DXR.axd?r=0_2316-O3Vxm"))
		.pause(840.milliseconds)
		.exec(http("request_83")
			.get("/Notifications/GetNotificationCounts")
			)
		.exec(http("request_84")
			.get("/Notifications/GetNotificationUserId")
			)
		.exec(http("request_85")
			.get("/signalr/negotiate?clientProtocol=2.1&userid=KM00023&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1623828287714")
			)
		.pause(1)

val chain_1 = exec(http("request_86")
			.get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=KM00023&connectionToken=YLE1pJmijDov6zh%2FfPTcSNwyxf0ZytCz7dW97gTZ0jqsYgJ94y27rh%2Bxoaf4boKlID5plr7XF2PUdvfGPZL4oTagIVqA0hOtvuspRf4d7VJ5uAZ9q8g9tv2yM38%2FQMqmXqX0dv7AcdKKKO8O0LwXVK%2FKo9tX9z%2BAKUj7mmX41H0%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1623828287715")
			)
		.exec(http("Open Create Allowance Code")
			.get("/TransactionMY/Allowance/MY/Details")
			.check(regex("""<input name="__RequestVerificationToken" type="hidden" value="(.+?)" />""").find.saveAs("__RequestVerificationTokenForm"))
			)
		.pause(101.milliseconds)
		.exec(http("request_88")
			.get("/bundles/jquery?v=BOadP4NdMhfEAxOx_qgeCESNgZMYYlRzghlNUzq6K-Y1"))
		.exec(http("request_89")
			.get("/Scripts/ExecutiveDashboardBundle?v=hjG6uA4G8jx4L1ddHEH1O9rf3Ul4d41_HZHzUxDR9k41"))
		.exec(http("request_90")
			.get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49-O3Vxm&p=b691a7d7"))
		.exec(http("request_91")
			.get("/Scripts/ExecutiveDashboardBundle/SideMenu?v=wmt4mX4cYH0d844GQc8r_NWCLWWdnZ_egKD54y34J2U1"))
		.exec(http("request_92")
			.get("/bundles/bootstrap?v=2Fz3B0iizV2NnnamQFrx-NbYJNTFeBJ2GM05SilbtQU1"))
		.exec(http("request_93")
			.get("/Content/Images/unifiedhcms_logo.png?V=01"))
		.exec(http("request_94")
			.get("/DXR.axd?r=1_58-N3Vxm"))
		.exec(http("request_95")
			.get("/profile_picture.ashx?EmployeeID=5302"))
		.exec(http("request_96")
			.get("/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1"))
		.exec(http("request_97")
			.get("/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1"))
		.exec(http("request_98")
			.get("/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1"))
		.exec(http("request_99")
			.get("/Scripts/MasterDevExBundle?v=h24JJD8hLg2uCOXtSNYJSvolBvJAIdCvb-_JDWPC9d41"))
		.exec(http("request_100")
			.get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A"))
		.exec(http("request_101")
			.get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1"))
		.exec(http("request_102")
			.get(uri3 + "?family=Open+Sans:300,400,600,700"))
		.exec(http("request_103")
			.get(uri3 + "?family=Roboto:400,300,500,700"))
		.exec(http("request_104")
			.get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7-O3Vxm"))
		.exec(http("request_105")
			.get("/signalr/hubs")
			)
		.exec(http("request_106")
			.get("/Content/fonts/icomoon.ttf?5vru0d")
			)
		.pause(982.milliseconds)
		.exec(http("request_107")
			.get("/DXR.axd?r=0_2314-O3Vxm"))
		.exec(http("request_108")
			.get("/DXR.axd?r=0_2321-O3Vxm"))
		.exec(http("request_109")
			.get("/DXR.axd?r=0_2216-O3Vxm"))
		.exec(http("request_110")
			.get("/DXR.axd?r=0_2316-O3Vxm"))
		.exec(http("request_111")
			.get("/DXR.axd?r=0_2223-O3Vxm"))
		.pause(931.milliseconds)
		.exec(http("request_112")
			.get("/Notifications/GetNotificationCounts")
			)
		.exec(http("request_113")
			.get("/Notifications/GetNotificationUserId")
			)
		.exec(http("request_114")
			.get("/signalr/negotiate?clientProtocol=2.1&userid=KM00023&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1623828292724")
			)
		.pause(1)
		.exec(http("request_115")
			.get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=KM00023&connectionToken=enyna6CVmXNOg0c9692NwkHzPpVkWtKTTailqECicTC%2B8Yv7Mzxp0LAUSDvV5ZeptG3hjHmuT8X%2FEyKyZJpBiXj78AWagorwsq0mR95bJNEFbQiGL3wtxB%2BiuyX7pgsGQ0%2FLu2s5jwGgxmMf2BjoZ5t8A%2FrqLfkkwWDz1KCudhU%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1623828292725")
			)
		.exec(http("request_116")
			.post("/TransactionMY/ContribGridViewPartial")
			
			.formParam("DXCallbackName", "gvContrib")
			.formParam("__DXCallbackArgument", "c0:KV|2;[];GB|19;14|CUSTOMCALLBACK0|;")
			.formParam("gvContrib", "{&quot;batchEditClientModifiedValues&quot;:{&quot;ClientState&quot;:{&quot;InsertedIndices&quot;:[],&quot;InsertedValues&quot;:{},&quot;UpdatedValues&quot;:{},&quot;DeletedKeys&quot;:[]},&quot;EditState&quot;:{&quot;insertedRowValues&quot;:{},&quot;modifiedRowValues&quot;:{},&quot;deletedRowKeys&quot;:[]}},&quot;keys&quot;:[],&quot;callbackState&quot;:&quot;mLXSr3t1E5/y7J2JldcZ+ilIORRSmXVKTbX26FikLbtqVWFJMMgSZ9xBBi8sS3IpWEVhnpBIdYkqVZkjRkyb98vMi4NeUASV1BNgm72F2+Yk/tbWbBNIdXKHxNf8kwlmC98tD+W4BDUYnJvLAhalKAE+kaEcrvtkrOYDgYGJVDGe4o90Ns9JeTAcDHsoIcaDR/kT2KkTjOuXtRv+N+YqwmHPSK+SfbMGEPCltqodfD4Yyci8OEPPeKP6xk8Oa7F1SIb7YGhXg2YfGaZRRi5PZnlLZeLuMuN0FBnv1XLxPRpEoQj+96qb3y7ofOIGl5SZw3CuXuOkVztcjOVeYsmqBeNE2E5umhveaVr0Hv2Np7nBMYLkMatWPdicMhDvdc8pj9BjGp3ZdW/KJdSkAiAJnhUwMAUiuggT8/kl/L8qr/UNauI0VY+HXoIHdPLUrTEUAB77CWXeiiUbVofs/y1aDg==&quot;,&quot;selection&quot;:&quot;&quot;}")
			.formParam("gvContrib_DXFREditorcol1_VI", "")
			.formParam("gvContrib$DXFREditorcol1", "")
			.formParam("gvContrib$DXFREditorcol1$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("gvContrib$DXFREditorcol1$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("gvContrib$DXFREditorcol1$DDD$L", "")
			.formParam("gvContrib$DXFREditorcol2", "")
			.formParam("gvContrib$DXEditor1$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvContrib_DXEditor1_VI", "")
			.formParam("gvContrib$DXEditor1", "")
			.formParam("gvContrib$DXEditor1$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("gvContrib$DXEditor1$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("gvContrib$DXEditor1$DDD$L", "")
			.formParam("gvContrib$DXEditor2$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("gvContrib$DXEditor2", "")
			.formParam("DXMVCEditorsValues", """{"LOCATION_ID_DDD_L":[279],"LOCATION_ID":279,"TRX_CODE":null,"TRX_DESCRIPTION":null,"LOCAL_DESCRIPTION":null,"INCOME_TYPE_DDD_L":["0"],"INCOME_TYPE":"0","DEFAULT_RATE":"0.00","EXEMPTION_CODE_DDD_L":[],"EXEMPTION_CODE":null,"STATUS_CODE_DDD_L":["A"],"STATUS_CODE":"A","AFFECT_FLAG01":0,"AFFECT_FLAG02":0,"AFFECT_FLAG04":0,"AFFECT_FLAG03":0,"AFFECT_FLAG06":0,"AFFECT_FLAG05":0,"REMARKS":null,"gvContrib_DXFREditorcol1_DDD_L":[],"gvContrib_DXFREditorcol1":null,"gvContrib_DXFREditorcol2":null,"gvContrib_DXEditor1_DDD_L":[],"gvContrib_DXEditor1":null,"gvContrib_DXEditor2":null}""")
			.formParam("DXMVCBatchEditingValuesRequestKey", "gvContrib")
			.formParam("DXMVCBatchEditingKeyFieldName", "ID")
			.formParam("RECORDSXML", "&lt;RECORDS&gt;&lt;/RECORDS&gt;")
			.formParam("LocId", "279"))
		.pause(1)
		.exec(http("request_117")
			.get(uri1 + "/AuthenticationService.Authenticate?1shttps%3A%2F%2Forisoftst.orisoftsaas.com%2FTransactionMY%2FAllowance%2FMY%2FDetails&4sAIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&callback=_xdc_._80kqbk&key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A&token=69225")
			)
		.pause(14)
		.exec(http("request_118")
			.post("/Account/VerifyAccess")
			)
		.exec(http("request_119")
			.get("/DXR.axd?r=0_2303-O3Vxm"))
		.exec(http("Create Allowance Code")
			.post("/Transaction/SaveTransaction?TransactionType=A_0")
			.formParam("__RequestVerificationToken", "${__RequestVerificationTokenForm}")
			.formParam("ID", "0")
			.formParam("ROWVERSION", "")
			.formParam("CUSTOMER_CODE", "")
			.formParam("EDITION_ID", "0")
			.formParam("tcTransaction", "{&quot;activeTabIndex&quot;:0}")
			.formParam("LOCATION_ID$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("LOCATION_ID_VI", "279")
			.formParam("LOCATION_ID", "ARC")
			.formParam("LOCATION_ID$DDDState", "{&quot;windowsState&quot;:&quot;1:1:12000:317:11:1:257:196:1:0:0:0&quot;}")
			.formParam("LOCATION_ID$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("LOCATION_ID$DDD$L", "279")
			.formParam("LOCATION_ID", "0")
			.formParam("TRX_CODE$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("TRX_CODE", "ABC1222")
			.formParam("TRX_DESCRIPTION$State", "{&quot;validationState&quot;:&quot;&quot;}")
			.formParam("TRX_DESCRIPTION", "Scrit Test Test")
			.formParam("LOCAL_DESCRIPTION", "")
			.formParam("INCOME_TYPE_VI", "0")
			.formParam("INCOME_TYPE", "Fixed")
			.formParam("INCOME_TYPE$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("INCOME_TYPE$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("INCOME_TYPE$DDD$L", "0")
			.formParam("DEFAULT_RATE$State", "{&quot;rawValue&quot;:&quot;0.00&quot;,&quot;validationState&quot;:&quot;&quot;}")
			.formParam("DEFAULT_RATE", "2.00")
			.formParam("EXEMPTION_CODE$State", "{&quot;rawValue&quot;:&quot;&quot;}")
			.formParam("EXEMPTION_CODE_VI", "")
			.formParam("EXEMPTION_CODE", " ")
			.formParam("EXEMPTION_CODE$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("EXEMPTION_CODE$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("EXEMPTION_CODE$DDD$L", "")
			.formParam("STATUS_CODE_VI", "A")
			.formParam("STATUS_CODE", "Active")
			.formParam("STATUS_CODE$DDDState", "{&quot;windowsState&quot;:&quot;0:0:-1:0:0:0:-10000:-10000:1:0:0:0&quot;}")
			.formParam("STATUS_CODE$DDD$L$State", "{&quot;CustomCallback&quot;:&quot;&quot;}")
			.formParam("STATUS_CODE$DDD$L", "A")
			.formParam("AFFECT_FLAG01", "U")
			.formParam("AFFECT_FLAG02", "U")
			.formParam("AFFECT_FLAG04", "U")
			.formParam("AFFECT_FLAG03", "U")
			.formParam("AFFECT_FLAG06", "U")
			.formParam("AFFECT_FLAG05", "U")
			.formParam("REMARKS", "")
			.formParam("gvContrib", "{&quot;batchEditClientModifiedValues&quot;:{&quot;ClientState&quot;:{&quot;InsertedIndices&quot;:[],&quot;InsertedValues&quot;:{},&quot;UpdatedValues&quot;:{},&quot;DeletedKeys&quot;:[]},&quot;EditState&quot;:{&quot;insertedRowValues&quot;:{},&quot;modifiedRowValues&quot;:{},&quot;deletedRowKeys&quot;:[]}},&quot;keys&quot;:[],&quot;callbackState&quot;:&quot;mLXSr3t1E5/y7J2JldcZ+ilIORRSmXVKTbX26FikLbtqVWFJMMgSZ9xBBi8sS3IpWEVhnpBIdYkqVZkjRkyb98vMi4NeUASV1BNgm72F2+Yk/tbWbBNIdXKHxNf8kwlmC98tD+W4BDUYnJvLAhalKAE+kaEcrvtkrOYDgYGJVDGe4o90Ns9JeTAcDHsoIcaDR/kT2KkTjOuXtRv+N+YqwmHPSK+SfbMGEPCltqodfD4Yyci8OEPPeKP6xk8Oa7F1SIb7YGhXg2YfGaZRRi5PZnlLZeLuMuN0FBnv1XLxPRpEoQj+96qb3y7ofOIGl5SZw3CuXuOkVztcjOVeYsmqBeNE2E5umhveaVr0Hv2Np7nBMYLkMatWPdicMhDvdc8pj9BjGp3ZdW/KJdSkAiAJnhUwMAUiuggT8/kl/L8qr/UNauI0VY+HXoIHdPLUrTEUAB77CWXeiiUbVofs/y1aDg==&quot;,&quot;selection&quot;:&quot;&quot;}")
			.formParam("gvContrib_DXFREditorcol1_VI", "")
			.formParam("gvContrib$DXFREditorcol1", "")
			.formParam("gvContrib$DXFREditorcol1$DDD$L", "")
			.formParam("gvContrib$DXFREditorcol2", "")
			.formParam("gvContrib_DXEditor1_VI", "")
			.formParam("gvContrib$DXEditor1", "")
			.formParam("gvContrib$DXEditor1$DDD$L", "")
			.formParam("gvContrib$DXEditor2", "")
			.formParam("DXScript", "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49")
			.formParam("DXCss", "/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1,0_2312,1_50,1_53,1_51,0_2317,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css")
			.formParam("DXMVCEditorsValues", """{"LOCATION_ID_DDD_L":[279],"LOCATION_ID":279,"TRX_CODE":"ABbC124","TRX_DESCRIPTION":"SCritp Test","LOCAL_DESCRIPTION":null,"INCOME_TYPE_DDD_L":["0"],"INCOME_TYPE":"0","DEFAULT_RATE":"2.00","EXEMPTION_CODE_DDD_L":[],"EXEMPTION_CODE":null,"STATUS_CODE_DDD_L":["A"],"STATUS_CODE":"A","AFFECT_FLAG01":0,"AFFECT_FLAG02":0,"AFFECT_FLAG04":0,"AFFECT_FLAG03":0,"AFFECT_FLAG06":0,"AFFECT_FLAG05":0,"REMARKS":null,"gvContrib_DXFREditorcol1_DDD_L":[],"gvContrib_DXFREditorcol1":null,"gvContrib_DXFREditorcol2":null,"gvContrib_DXEditor1_DDD_L":[],"gvContrib_DXEditor1":null,"gvContrib_DXEditor2":null}"""))
		.pause(3)
		.exec(http("request_121")
			.get("/bundles/jquery?v=BOadP4NdMhfEAxOx_qgeCESNgZMYYlRzghlNUzq6K-Y1"))
		.exec(http("request_122")
			.get("/Scripts/ExecutiveDashboardBundle?v=hjG6uA4G8jx4L1ddHEH1O9rf3Ul4d41_HZHzUxDR9k41"))
		.exec(http("request_123")
			.get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49-O3Vxm&p=b691a7d7"))
		.exec(http("request_124")
			.get("/Scripts/ExecutiveDashboardBundle/SideMenu?v=wmt4mX4cYH0d844GQc8r_NWCLWWdnZ_egKD54y34J2U1"))
		.exec(http("request_125")
			.get("/bundles/bootstrap?v=2Fz3B0iizV2NnnamQFrx-NbYJNTFeBJ2GM05SilbtQU1"))
		.exec(http("request_126")
			.get("/Content/Images/unifiedhcms_logo.png?V=01"))
		.exec(http("request_127")
			.get("/DXR.axd?r=1_58-N3Vxm"))
		.exec(http("request_128")
			.get("/profile_picture.ashx?EmployeeID=5302"))
		.exec(http("request_129")
			.get("/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1"))
		.exec(http("request_130")
			.get("/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1"))
		.exec(http("request_131")
			.get("/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1"))
		.exec(http("request_132")
			.get("/Scripts/MasterDevExBundle?v=h24JJD8hLg2uCOXtSNYJSvolBvJAIdCvb-_JDWPC9d41"))
		.exec(http("request_133")
			.get(uri3 + "?family=Open+Sans:300,400,600,700"))
		.exec(http("request_134")
			.get(uri3 + "?family=Roboto:400,300,500,700"))
		.exec(http("request_135")
			.get("/TransactionMY/Allowance/MY/Listing")
			)
		.exec(http("request_136")
			.get("/DXR.axd?r=0_2312,1_50,1_53,1_51,0_2317,0_5685,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7-O3Vxm"))
		.exec(http("request_137")
			.get("/signalr/hubs")
			)
		.exec(http("request_138")
			.get(uri1 + "?key=AIzaSyDu3r6sgbYDPJTjUH9Dun7RSWAyB5aQi8A"))
		.exec(http("request_139")
			.get("/Scripts/RootBundle?v=Z5MJwH8Xi0bCONWdJcmOtX_Ca81BpX4JptdIbZb919g1"))
		.pause(111.milliseconds)
		.exec(http("request_140")
			.get("/Content/fonts/icomoon.ttf?5vru0d")
			)
		.pause(939.milliseconds)
		.exec(http("request_141")
			.get("/DXR.axd?r=0_5687-O3Vxm"))
		.exec(http("request_142")
			.get("/DXR.axd?r=0_2314-O3Vxm"))
		.exec(http("request_143")
			.get("/DXR.axd?r=0_2321-O3Vxm"))
		.exec(http("request_144")
			.get("/DXR.axd?r=0_2223-O3Vxm"))
		.exec(http("request_145")
			.get("/DXR.axd?r=0_2216-O3Vxm"))
		.exec(http("request_146")
			.get("/DXR.axd?r=0_2316-O3Vxm"))
		.pause(664.milliseconds)
		.exec(http("request_147")
			.get("/Notifications/GetNotificationCounts")
			)
		.exec(http("request_148")
			.get("/Notifications/GetNotificationUserId")
			)
		.exec(http("request_149")
			.get("/signalr/negotiate?clientProtocol=2.1&userid=KM00023&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1623828319554")
			)
		.pause(215.milliseconds)
		.exec(http("request_150")
			.get("/signalr/start?transport=webSockets&clientProtocol=2.1&userid=KM00023&connectionToken=KNMmAHXyi5X2reK0Gbr680fJqMtq8dwl390kt5jSy8eoJscuuJdZjw6VWnmiEK74%2B1Ll1fH%2BmYfZ5PkZ5IzTDrR8Thm4k1zwF5Ob9dR8%2BU7cQYUZJPlJ0EYiwVqW6KjhGH6ldyE5m9ozg7YxeFym2htvaQVhMH4u%2BAhLMkAKgwM%3D&connectionData=%5B%7B%22name%22%3A%22notificationhub%22%7D%5D&_=1623828319555")
			)
		.pause(1)
		.exec(http("request_151")
			.post("/Account/LogOff")
			
			.formParam("__RequestVerificationToken", "fkO7d630JhR73aMsO141FC1C65aM9zChMUCqHSAyZng32u6HD6TI8xlZrGo2b8GaFUmGdXJBXFXsxD4hc-6myaYLDqxbgJZchyFo50mPVmMNmUEoNOoEJLSm6Mjx2YK2xUGv2fDOGRvgK0UiOkD0OQ2")
			.formParam("DXScript", "1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_270,1_286,1_289,1_183,17_42,17_3,1_285,1_188,17_8,1_297,1_192,17_10,1_287,1_194,1_193,17_11,1_208,1_216,1_301,1_253,1_234,1_246,1_302,1_221,17_12,1_296,1_295,1_278,17_41,1_189,1_222,1_290,1_288,1_195,1_255,1_262,1_261,1_254,1_251,1_258,1_252,1_260,1_257,1_256,1_247,1_243,1_241,1_250,1_249,1_248,1_245,1_244,1_259,1_240,1_237,1_238,1_239,1_242,17_15,17_17,1_271,1_272,17_19,1_273,1_274,17_20,17_21,1_223,17_14,1_276,17_24,17_28,1_280,17_25,1_293,17_27,1_291,1_294,17_32,1_298,17_36,17_40,1_197,17_1,1_207,1_235,17_16,6_18,6_16,6_15,6_14,6_17,17_39,1_212,1_196,17_0,1_198,17_2,1_199,17_4,1_200,1_201,1_202,1_204,1_218,1_205,17_7,1_211,17_23,1_206,17_9,1_275,1_214,1_215,17_22,1_213,1_217,17_38,1_219,1_232,1_233,1_231,17_5,1_191,1_284,18_36,18_38,18_33,18_42,18_37,18_35,17_31,1_203,1_283,9_54,9_55,24_379,24_389,9_57,9_56,17_44,9_45,9_47,9_46,17_30,9_51,9_48,9_31,17_29,9_50,9_41,9_53,9_52,9_49")
			.formParam("DXCss", "/Content/css/root?v=Y-cRE08jNAR0IkYEwKTDpwfzJ2kuWuiVp8Nt6e1lBRg1,0_2312,1_50,1_53,1_51,0_2317,0_5685,1_40,1_17,0_2214,1_16,0_2219,0_2221,0_2225,1_18,1_4,0_2279,6_3,0_2283,0_2186,0_2190,0_2257,18_3,18_11,18_7,0_2261,0_2313,1_34,24_359,24_364,24_360,9_19,9_15,9_12,0_2338,9_1,0_2342,9_4,1_7,/Content/ExecutiveDashboard/ExecutiveDashboardBundle?v=K3bp7bOUCg7jvMi3yCOp8VvRDHaxkZJNkgNJYDsPeIA1,/Content/ExecutiveDashboardBundle?v=yudLVP8cmmFF7pYfIl5_OmdH-W3uaCGxdSLyC-jbYQo1,/Content/notifications.css")
			.check(status.is(302)))
		.exec(http("request_152")
			.get("/Account/Login")
			)
		.exec(http("request_153")
			.get("/bundles/jquery?v=BOadP4NdMhfEAxOx_qgeCESNgZMYYlRzghlNUzq6K-Y1"))
		.exec(http("request_154")
			.get("/DXR.axd?r=1_58-N3Vxm"))
		.exec(http("request_155")
			.get("/DXR.axd?r=1_17,0_2214,1_50,1_53,1_51,1_16,0_2219,0_2312,0_2317-O3Vxm"))
		.exec(http("request_156")
			.get("/Content/css?v=w9USDPGryprQSMA62T1giyRXrtqAIG-BphxyQY0Qw_w1"))
		.exec(http("request_157")
			.get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_208,1_216,1_212,1_189,1_222,17_42,1_297,1_215,1_207,1_289,1_205,17_7,1_287,1_211,17_23,1_197,17_1-N3Vxm"))
		.exec(http("request_158")
			.get("/Content/fonts/icomoon.ttf?5vru0d")
			)
		.pause(137.milliseconds)
		.exec(http("request_159")
			.get("/Content/Images/bg-login.jpg?V=03"))

	val scn = scenario("CreateAllowanceCode").exec(
		chain_0, chain_1)

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}