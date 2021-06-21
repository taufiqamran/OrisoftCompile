package computerdatabase.Module.Document

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
object ESSEMPMyDocument {

  val uri1 = "https://maps.googleapis.com/maps/api/js"
  val uri3 = "https://fonts.googleapis.com/css"
  val uri4 = "https://fonts.googleapis.com/css"

  def loadMyDocument = {
    exec(http("Load my Document")
      .get("/profile/doc_mngr.aspx?Mode=E")
      .check(regex("""<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="(.+?)" />""").saveAs("viewState"))
    )
      .exec(http("request_47")
        .get("/WebResource.axd?d=pynGkmcFUV13He1Qd6_TZOYXOnLy43dRx8HCf3vqtm7Uk9Dd5QTT0bKPZkChPJpkGd7et7925jgqVFYijtH4BlZm86YPMFKavMb3jiNdHO_DkODjc9ASxqTpYjlOyMlE0&t=637505973787431984"))
      .exec(http("request_48")
        .get("/ScriptResource.axd?d=P5lTttoqSeZXoYRLQMIScIf12FcrWAiNVtlJxQA9qnTW6iJpMmht7uXNg23QNwOPVke9qF6NTd062q-kq39p4MmkxhZ1ti3ckmNVSJHDik9HIeiTEBJ8AeazBYyjXlRbQWV2Q8-MBT7ldJqGwC6gtX5XcIt2Wd4nEFDQxuD-poI1&t=51e37521"))
      .exec(http("request_49")
        .get("/ScriptResource.axd?d=uvA9ANM76Fbpm1FfUlagnYp2obqkhmwI_C-NoQ89dB6TwrO7THFVAk1nHl1QRi68J_pozjXYUJHgZb6l02O3dvVqjaOzdIW44mTvv4FyAQ5MvnVeKZmB7OtG9BNkATLGOGWXvK2djBpsGpZ_x3Mi2KdwGSD0SZeW5VvD940G1Y8Cml0nm6ok2UFWSXa6k4SQ0&t=51e37521"))
      .exec(http("request_50")
        .get("/ScriptResource.axd?d=x6wALODbMJK5e0eRC_p1LTFBEqAduy6yzdGuAMP1dHrya3_IF2A8CsbaRF-ARwHq6m-SGT1rW_kEfDOVxpLiOwBwjQzZMYd6yIJvZ9ubgIyIzxTTWWPxLOJ6h2brQiXEeYW7vHWkdtbfdWvIHio91FSsDXmcUmI7kjdMETOH_XE1&t=51e37521"))
      .exec(http("request_51")
        .get("/ScriptResource.axd?d=XGoPW3Unw0ILT0eb9sSUayB1PCvz0eeMXm23ajXUnLKSVWvpEIM7qNdgqQtwIk3oGSO-umSPRJr1BQNhALudg4-gDqI9ltlNkOQMrPf4fNHBEAhja6GHf4He4_YSEbkQ4L1Bsn1aV_AF11ks4fQlTNxlg6tYk_UGpXjfNcFSD6D49VS2gjNTnElk4fHlLsM90&t=51e37521"))
      .exec(http("request_52")
        .get("/profile/doc_mngr.aspx?_TSM_CombinedScripts_=True&v=ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1&_TSM_Bundles_=&cdn=False"))
      .exec(http("request_53")
        .get(uri3 + "?family=Open+Sans:300,400,600,700"))
      .exec(http("request_54")
        .get(uri3 + "?family=Roboto:400,300,500,700"))
      .pause(104.milliseconds)
      .exec(http("request_55")
        .post("/verify_access.ashx")
      )
      .pause(140.milliseconds)
      .exec(http("request_56")
        .get("/Content/ESS/fonts/icomoon.ttf?5vru0d")
      )
      .pause(132.milliseconds)
      .exec(http("request_57")
        .get("/Notifications/GetNotificationCounts")
      )
      .exec(http("request_58")
        .get("/Notifications/ViewNotifications?type=YTY22B0I5yBZ2CKhPz/OAERMzHcCi0AhTpBsAIn36WvFelsrn2COMER9cNDKJNfmBKb2DeExCJSCUqVv4AkoiPACpHuPFxRqpAHhatJRDTKoVmRmKrZh08Vtv0iBwgz5cbyRNwYjbolg9rAZy7e8wfAvDa5Tv9q27RWcRRFDLbY=")
      )
      .pause(227.milliseconds)
      .exec(http("request_59")
        .get("/Notifications/GetNotificationsList?row=8")
      )
  }

  def clickCreateButton = {
    exec(http("Click Create Document")
      .get("/profile/doc_mngr_edit.aspx?Value=3c56414c55453e3c5649455742593e453c2f5649455742593e3c2f56414c55453e")
      .check(regex("""<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="(.+?)" />""").saveAs("viewState"))
    )
      .exec(http("request_61")
        .get("/WebResource.axd?d=G7AEkw1asyYfSFk2Li5D0JhwAppflyxkpGSQDQbA3YX7Us59q1SeSvJlGoBadgH42WWogzokgjSTil628NjzJ-ho-6akTSnjNL_1W4rKMdV6J4E7SFdllL-EXlbUGTEk-wfRgTKBSFluXwws9OgQSz64mOsqxEoa9Z9MfmluHcdALHev8eL9dk6DjmuJdzHl0&t=637529727625595181"))
      .exec(http("request_62")
        .get("/WebResource.axd?d=pynGkmcFUV13He1Qd6_TZOYXOnLy43dRx8HCf3vqtm7Uk9Dd5QTT0bKPZkChPJpkGd7et7925jgqVFYijtH4BlZm86YPMFKavMb3jiNdHO_DkODjc9ASxqTpYjlOyMlE0&t=637505973787431984"))
      .exec(http("request_63")
        .get("/ScriptResource.axd?d=x6wALODbMJK5e0eRC_p1LTFBEqAduy6yzdGuAMP1dHrya3_IF2A8CsbaRF-ARwHq6m-SGT1rW_kEfDOVxpLiOwBwjQzZMYd6yIJvZ9ubgIyIzxTTWWPxLOJ6h2brQiXEeYW7vHWkdtbfdWvIHio91FSsDXmcUmI7kjdMETOH_XE1&t=51e37521"))
      .exec(http("request_64")
        .get("/ScriptResource.axd?d=P5lTttoqSeZXoYRLQMIScIf12FcrWAiNVtlJxQA9qnTW6iJpMmht7uXNg23QNwOPVke9qF6NTd062q-kq39p4MmkxhZ1ti3ckmNVSJHDik9HIeiTEBJ8AeazBYyjXlRbQWV2Q8-MBT7ldJqGwC6gtX5XcIt2Wd4nEFDQxuD-poI1&t=51e37521"))
      .exec(http("request_65")
        .get("/ScriptResource.axd?d=XGoPW3Unw0ILT0eb9sSUayB1PCvz0eeMXm23ajXUnLKSVWvpEIM7qNdgqQtwIk3oGSO-umSPRJr1BQNhALudg4-gDqI9ltlNkOQMrPf4fNHBEAhja6GHf4He4_YSEbkQ4L1Bsn1aV_AF11ks4fQlTNxlg6tYk_UGpXjfNcFSD6D49VS2gjNTnElk4fHlLsM90&t=51e37521"))
      .exec(http("request_66")
        .get("/ScriptResource.axd?d=uvA9ANM76Fbpm1FfUlagnYp2obqkhmwI_C-NoQ89dB6TwrO7THFVAk1nHl1QRi68J_pozjXYUJHgZb6l02O3dvVqjaOzdIW44mTvv4FyAQ5MvnVeKZmB7OtG9BNkATLGOGWXvK2djBpsGpZ_x3Mi2KdwGSD0SZeW5VvD940G1Y8Cml0nm6ok2UFWSXa6k4SQ0&t=51e37521"))
      .exec(http("request_67")
        .get("/ScriptResource.axd?d=nv7asgRUU0tRmHNR2D6t1HncJC0uSlzSoOMFzQL9KDgdtj1yUByaaYlMWCLR1tfb0zRr2KS8GU92MXS6P0lOX_vkDPQOiW6UvV384GibJ__q8DVUhGPtg7X0IEAXecIS6jMaZIGfhYY2bHennMwScvTacu4aYi7pwkjCfDx4XDhghn49oiHENcEjRtCYLFUt0&t=fffffffff6474071"))
      .exec(http("request_68")
        .get("/profile/doc_mngr_edit.aspx?_TSM_CombinedScripts_=True&v=ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1&_TSM_Bundles_=&cdn=False"))
      .exec(http("request_69")
        .get(uri3 + "?family=Open+Sans:300,400,600,700"))
      .exec(http("request_70")
        .get(uri3 + "?family=Roboto:400,300,500,700"))
      .exec(http("request_71")
        .post("/verify_access.ashx")
      )
      .pause(104.milliseconds)
      .exec(http("request_72")
        .get("/Content/ESS/fonts/icomoon.ttf?5vru0d")
      )
      .pause(180.milliseconds)
      .exec(http("request_73")
        .get("/Notifications/ViewNotifications?type=iBtH/+XnsC/KrgQlx4SCA4AFXlDelF7YcC14yzDjF7Y28UmUb2G3N9RUwRv21SMS8WtQQSVcVEQusqVy7mfzlLdRTcipmnpI50r8KuiTaNjIojboKvxbm+V93y3eAIE8+rmSZtS9qDx5IWRvi0Ub6BnKl902gjkuzkPgP24xGN0=")
      )
      .pause(210.milliseconds)
      .exec(http("request_74")
        .get("/Notifications/GetNotificationsList?row=8")
      )
      .exec(http("request_75")
        .get("/Notifications/GetNotificationCounts")
      )
  }
  def submitCreateDocument = {
    exec(http("Submit")
      .post("/profile/doc_mngr_edit.aspx?Value=3c56414c55453e3c5649455742593e453c2f5649455742593e3c2f56414c55453e")
      .formParam("__EVENTTARGET", "ctl00$ctl00$cntPlcHldrContent$btnSubmit")
      .formParam("__EVENTARGUMENT", "1")
      .formParam("_TSM_HiddenField_", "ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1")
      .formParam("__VIEWSTATE", "${viewState}")
      .formParam("__VIEWSTATEGENERATOR", "0137FCCD")
      .formParam("ctl00$ctl00$selCultureName", "")
      .formParam("ctl00$ctl00$selCountry", "1")
      .formParam("ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$hfID", "")
      .formParam("ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$hfFileName", "")
      .formParam("ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$hfFileType", "")
      .formParam("ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$hfSubordinateID", "")
      .formParam("ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$hfSubordinateNo", "")
      .formParam("ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$hfViewBy", "E")
      .formParam("ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$txtDesc0", "Script Upload")
      .formParam("ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cusvDescEx0_ClientState", "")
      .formParam("ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$selDocumentType0", "WORKFLOW")
      .formParam("ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cusvDocumentTypeEx0_ClientState", "")
      .formParam("ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$selDocumentSubType0", "")
      .formParam("ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$hfDocumentSubType0", "")
      .bodyPart(RawFileBodyPart("ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$fuAttachment0", "data/Redirect.PNG").fileName("Redirect.PNG")).asMultipartForm
      .formParam("ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$txtAttachment0", "C:\\fakepath\\Redirect.PNG")
      .formParam("ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cusvAttachmentEx0_ClientState", "")
      .formParam("ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$txtViewableBy0", "Owner , Direct/Primary Supervisor , Administrator")
      .formParam("ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$hfViewableBy0", "11")
      .formParam("ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$txtRmks0", "")
      .check(status.is(200))
      .check(bodyString.saveAs("Create"))
    )
      .exec(http("request_77")
        .get("/WebResource.axd?d=G7AEkw1asyYfSFk2Li5D0JhwAppflyxkpGSQDQbA3YX7Us59q1SeSvJlGoBadgH42WWogzokgjSTil628NjzJ-ho-6akTSnjNL_1W4rKMdV6J4E7SFdllL-EXlbUGTEk-wfRgTKBSFluXwws9OgQSz64mOsqxEoa9Z9MfmluHcdALHev8eL9dk6DjmuJdzHl0&t=637529727625595181"))
      .exec(http("request_78")
        .get("/WebResource.axd?d=pynGkmcFUV13He1Qd6_TZOYXOnLy43dRx8HCf3vqtm7Uk9Dd5QTT0bKPZkChPJpkGd7et7925jgqVFYijtH4BlZm86YPMFKavMb3jiNdHO_DkODjc9ASxqTpYjlOyMlE0&t=637505973787431984"))
      .exec(http("request_79")
        .get("/ScriptResource.axd?d=nv7asgRUU0tRmHNR2D6t1HncJC0uSlzSoOMFzQL9KDgdtj1yUByaaYlMWCLR1tfb0zRr2KS8GU92MXS6P0lOX_vkDPQOiW6UvV384GibJ__q8DVUhGPtg7X0IEAXecIS6jMaZIGfhYY2bHennMwScvTacu4aYi7pwkjCfDx4XDhghn49oiHENcEjRtCYLFUt0&t=fffffffff6474071"))
      .exec(http("request_80")
        .get("/ScriptResource.axd?d=x6wALODbMJK5e0eRC_p1LTFBEqAduy6yzdGuAMP1dHrya3_IF2A8CsbaRF-ARwHq6m-SGT1rW_kEfDOVxpLiOwBwjQzZMYd6yIJvZ9ubgIyIzxTTWWPxLOJ6h2brQiXEeYW7vHWkdtbfdWvIHio91FSsDXmcUmI7kjdMETOH_XE1&t=51e37521"))
      .exec(http("request_81")
        .get("/ScriptResource.axd?d=P5lTttoqSeZXoYRLQMIScIf12FcrWAiNVtlJxQA9qnTW6iJpMmht7uXNg23QNwOPVke9qF6NTd062q-kq39p4MmkxhZ1ti3ckmNVSJHDik9HIeiTEBJ8AeazBYyjXlRbQWV2Q8-MBT7ldJqGwC6gtX5XcIt2Wd4nEFDQxuD-poI1&t=51e37521"))

      .exec(http("request_82")
      .get("/profile/doc_mngr_edit.aspx?_TSM_CombinedScripts_=True&v=ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1&_TSM_Bundles_=&cdn=False"))
      .exec(http("request_83")
        .get("/ScriptResource.axd?d=XGoPW3Unw0ILT0eb9sSUayB1PCvz0eeMXm23ajXUnLKSVWvpEIM7qNdgqQtwIk3oGSO-umSPRJr1BQNhALudg4-gDqI9ltlNkOQMrPf4fNHBEAhja6GHf4He4_YSEbkQ4L1Bsn1aV_AF11ks4fQlTNxlg6tYk_UGpXjfNcFSD6D49VS2gjNTnElk4fHlLsM90&t=51e37521"))
      .exec(http("request_84")
        .get("/ScriptResource.axd?d=uvA9ANM76Fbpm1FfUlagnYp2obqkhmwI_C-NoQ89dB6TwrO7THFVAk1nHl1QRi68J_pozjXYUJHgZb6l02O3dvVqjaOzdIW44mTvv4FyAQ5MvnVeKZmB7OtG9BNkATLGOGWXvK2djBpsGpZ_x3Mi2KdwGSD0SZeW5VvD940G1Y8Cml0nm6ok2UFWSXa6k4SQ0&t=51e37521"))
      .exec(http("request_85")
        .get(uri3 + "?family=Open+Sans:300,400,600,700"))
      .exec(http("request_86")
        .get(uri3 + "?family=Roboto:400,300,500,700"))
      .exec(http("request_87")
        .post("/verify_access.ashx")
      )
      .exec(http("request_88")
        .get("/Content/ESS/fonts/icomoon.ttf?5vru0d")
      )
      .pause(131.milliseconds)
      .exec(http("request_89")
        .get("/Notifications/GetNotificationCounts")
      )
      .exec(http("request_90")
        .get("/Notifications/ViewNotifications?type=hkVLHqE7Y55DKUupzvfPsg0NcVeYl+Wvb3YKChGV+xXJw2jlX0Dm4MxaY3UKhRHi4hU1So9xPHSaLjxm3nhQQDFaLLw3i9n1edKusfqnSPVDf93tF+wecnt56bQ6YCuEPjPJgHRqOR2IiyJ314QpGVpahIqY0gvjMOMKqm5AVRY=")
      )
      .pause(213.milliseconds)
      .exec(http("request_91")
        .get("/Notifications/GetNotificationsList?row=8")
      )
      .pause(2)
      .exec(http("Listing Page")
        .get("/profile/doc_mngr.aspx?Mode=E")
        .check(regex("""<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="(.+?)" />""").saveAs("viewStateLogout"))
      )
      .pause(127.milliseconds)
      .exec(http("request_93")
        .get("/WebResource.axd?d=pynGkmcFUV13He1Qd6_TZOYXOnLy43dRx8HCf3vqtm7Uk9Dd5QTT0bKPZkChPJpkGd7et7925jgqVFYijtH4BlZm86YPMFKavMb3jiNdHO_DkODjc9ASxqTpYjlOyMlE0&t=637505973787431984"))
      .exec(http("request_94")
        .get("/ScriptResource.axd?d=x6wALODbMJK5e0eRC_p1LTFBEqAduy6yzdGuAMP1dHrya3_IF2A8CsbaRF-ARwHq6m-SGT1rW_kEfDOVxpLiOwBwjQzZMYd6yIJvZ9ubgIyIzxTTWWPxLOJ6h2brQiXEeYW7vHWkdtbfdWvIHio91FSsDXmcUmI7kjdMETOH_XE1&t=51e37521"))
      .exec(http("request_95")
        .get("/ScriptResource.axd?d=P5lTttoqSeZXoYRLQMIScIf12FcrWAiNVtlJxQA9qnTW6iJpMmht7uXNg23QNwOPVke9qF6NTd062q-kq39p4MmkxhZ1ti3ckmNVSJHDik9HIeiTEBJ8AeazBYyjXlRbQWV2Q8-MBT7ldJqGwC6gtX5XcIt2Wd4nEFDQxuD-poI1&t=51e37521"))
      .exec(http("request_96")
        .get("/ScriptResource.axd?d=XGoPW3Unw0ILT0eb9sSUayB1PCvz0eeMXm23ajXUnLKSVWvpEIM7qNdgqQtwIk3oGSO-umSPRJr1BQNhALudg4-gDqI9ltlNkOQMrPf4fNHBEAhja6GHf4He4_YSEbkQ4L1Bsn1aV_AF11ks4fQlTNxlg6tYk_UGpXjfNcFSD6D49VS2gjNTnElk4fHlLsM90&t=51e37521"))
      .exec(http("request_97")
        .get("/ScriptResource.axd?d=uvA9ANM76Fbpm1FfUlagnYp2obqkhmwI_C-NoQ89dB6TwrO7THFVAk1nHl1QRi68J_pozjXYUJHgZb6l02O3dvVqjaOzdIW44mTvv4FyAQ5MvnVeKZmB7OtG9BNkATLGOGWXvK2djBpsGpZ_x3Mi2KdwGSD0SZeW5VvD940G1Y8Cml0nm6ok2UFWSXa6k4SQ0&t=51e37521"))
      .exec(http("request_98")
        .get("/profile/doc_mngr.aspx?_TSM_CombinedScripts_=True&v=ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1&_TSM_Bundles_=&cdn=False"))
      .exec(http("request_99")
        .get(uri3 + "?family=Open+Sans:300,400,600,700"))
      .exec(http("request_100")
        .get(uri3 + "?family=Roboto:400,300,500,700"))
      .pause(116.milliseconds)
      .exec(http("request_101")
        .post("/verify_access.ashx")
      )
      .pause(168.milliseconds)
      .exec(http("request_102")
        .get("/Content/ESS/fonts/icomoon.ttf?5vru0d")
      )
      .pause(359.milliseconds)
      .exec(http("request_103")
        .get("/Notifications/GetNotificationCounts")
      )
      .exec(http("request_104")
        .get("/Notifications/ViewNotifications?type=c3nKFMryCHH3e7ehu4BU/fty4WQ8zeVor7TDgjCYAq/b1FnlppILiFTHYAVIzxr9gTCPwIZqiAX0BApznuE8RxkimwWVfazgOsH1KA9VU3j9eErakuALxRJ2QJjOdj5+r9871gqTVO5gUxMJ4kuuuuUCr3rSkFcdywNO9+F+hVI=")
      )
      .pause(420.milliseconds)
      .exec(http("request_105")
        .get("/Notifications/GetNotificationsList?row=8")
      )
  }

  def searchItem = {
    exec(http("Search")
      .post("/profile/doc_mngr.aspx?Mode=E")
      .formParam("__EVENTTARGET", "ctl00$ctl00$ctl00$cntPlcHldrContent$btnSearch")
      .formParam("__EVENTARGUMENT", "")
      .formParam("_TSM_HiddenField_", "ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1")
      .formParam("__VIEWSTATE", "${viewState}")
      .formParam("__VIEWSTATEGENERATOR", "08F0C9C6")
      .formParam("ctl00$ctl00$ctl00$selCultureName", "")
      .formParam("ctl00$ctl00$ctl00$selCountry", "1")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$hfViewBy", "E")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtDesc", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$selDocType", "WORKFLOW")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtFileName", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$gvSearch$ctl23$gpCustomPager$txtPageSize", "50")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfIndex", "")
      .check(css("input[name='__VIEWSTATE']", "value").saveAs("viewStateSearch"))
    )
      .exec(http("request_144")
        .get("/WebResource.axd?d=pynGkmcFUV13He1Qd6_TZOYXOnLy43dRx8HCf3vqtm7Uk9Dd5QTT0bKPZkChPJpkGd7et7925jgqVFYijtH4BlZm86YPMFKavMb3jiNdHO_DkODjc9ASxqTpYjlOyMlE0&t=637505973787431984"))
      .exec(http("request_145")
        .get("/ScriptResource.axd?d=x6wALODbMJK5e0eRC_p1LTFBEqAduy6yzdGuAMP1dHrya3_IF2A8CsbaRF-ARwHq6m-SGT1rW_kEfDOVxpLiOwBwjQzZMYd6yIJvZ9ubgIyIzxTTWWPxLOJ6h2brQiXEeYW7vHWkdtbfdWvIHio91FSsDXmcUmI7kjdMETOH_XE1&t=51e37521"))
      .exec(http("request_146")
        .get("/ScriptResource.axd?d=P5lTttoqSeZXoYRLQMIScIf12FcrWAiNVtlJxQA9qnTW6iJpMmht7uXNg23QNwOPVke9qF6NTd062q-kq39p4MmkxhZ1ti3ckmNVSJHDik9HIeiTEBJ8AeazBYyjXlRbQWV2Q8-MBT7ldJqGwC6gtX5XcIt2Wd4nEFDQxuD-poI1&t=51e37521"))
      .exec(http("request_147")
        .get("/profile/doc_mngr.aspx?_TSM_CombinedScripts_=True&v=ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1&_TSM_Bundles_=&cdn=False"))
      .exec(http("request_148")
        .get("/ScriptResource.axd?d=XGoPW3Unw0ILT0eb9sSUayB1PCvz0eeMXm23ajXUnLKSVWvpEIM7qNdgqQtwIk3oGSO-umSPRJr1BQNhALudg4-gDqI9ltlNkOQMrPf4fNHBEAhja6GHf4He4_YSEbkQ4L1Bsn1aV_AF11ks4fQlTNxlg6tYk_UGpXjfNcFSD6D49VS2gjNTnElk4fHlLsM90&t=51e37521"))
      .exec(http("request_149")
        .get("/ScriptResource.axd?d=uvA9ANM76Fbpm1FfUlagnYp2obqkhmwI_C-NoQ89dB6TwrO7THFVAk1nHl1QRi68J_pozjXYUJHgZb6l02O3dvVqjaOzdIW44mTvv4FyAQ5MvnVeKZmB7OtG9BNkATLGOGWXvK2djBpsGpZ_x3Mi2KdwGSD0SZeW5VvD940G1Y8Cml0nm6ok2UFWSXa6k4SQ0&t=51e37521"))
      .exec(http("request_150")
        .get(uri4 + "?family=Open+Sans:300,400,600,700"))
      .exec(http("request_151")
        .get(uri4 + "?family=Roboto:400,300,500,700"))
      .exec(http("request_152")
        .post("/verify_access.ashx")
      )
      .exec(http("request_153")
        .get("/Content/ESS/fonts/icomoon.ttf?5vru0d")
      )
      .exec(http("request_154")
        .get(uri3 + "?v=4.7.0")
      )
      .pause(126.milliseconds)
      .exec(http("request_155")
        .get("/Notifications/GetNotificationCounts")
      )
      .exec(http("request_156")
        .get("/Notifications/ViewNotifications?type=LjnqWyxfRoiCCgU40Hi1G8Jt1feFiovTGaaS7JrahX1Yt57KPpob+oGfmfIP91RazJVtT3dSPVKLdZPDGVfSyP6hGfoWkSXo6Q0n/JP5wLV7YlyhHXVAdgwvmojLQ1RWnK/aX7CnNb8LLk//glif5ixzelI7qvjMiIOH6qRTj84=")
      )
      .pause(182.milliseconds)
      .exec(http("request_157")
        .get("/Notifications/GetNotificationsList?row=8")
      )
  }
  def deleteDocumentItem = {
    exec(http("Delete document")
      .post("/profile/doc_mngr.aspx?Mode=E")
      .formParam("__EVENTTARGET", "ctl00$ctl00$ctl00$cntPlcHldrContent$btnDelete")
      .formParam("__EVENTARGUMENT", "")
      .formParam("_TSM_HiddenField_", "ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1")
      .formParam("__VIEWSTATE", "${viewStateSearch}")
      .formParam("__VIEWSTATEGENERATOR", "08F0C9C6")
      .formParam("ctl00$ctl00$ctl00$selCultureName", "")
      .formParam("ctl00$ctl00$ctl00$selCountry", "1")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$hfViewBy", "E")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtDesc", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$selDocType", "WORKFLOW")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtFileName", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$gvSearch$ctl02$cbChkChild", "on")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$gvSearch$ctl20$gpCustomPager$txtPageSize", "50")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfIndex", "")
      .check(css("input[name='__VIEWSTATE']", "value").saveAs("viewStateLogout"))
    )
      .exec(http("request_159")
        .get("/WebResource.axd?d=pynGkmcFUV13He1Qd6_TZOYXOnLy43dRx8HCf3vqtm7Uk9Dd5QTT0bKPZkChPJpkGd7et7925jgqVFYijtH4BlZm86YPMFKavMb3jiNdHO_DkODjc9ASxqTpYjlOyMlE0&t=637505973787431984"))
      .exec(http("request_160")
        .get("/ScriptResource.axd?d=x6wALODbMJK5e0eRC_p1LTFBEqAduy6yzdGuAMP1dHrya3_IF2A8CsbaRF-ARwHq6m-SGT1rW_kEfDOVxpLiOwBwjQzZMYd6yIJvZ9ubgIyIzxTTWWPxLOJ6h2brQiXEeYW7vHWkdtbfdWvIHio91FSsDXmcUmI7kjdMETOH_XE1&t=51e37521"))
      .exec(http("request_161")
        .get("/ScriptResource.axd?d=P5lTttoqSeZXoYRLQMIScIf12FcrWAiNVtlJxQA9qnTW6iJpMmht7uXNg23QNwOPVke9qF6NTd062q-kq39p4MmkxhZ1ti3ckmNVSJHDik9HIeiTEBJ8AeazBYyjXlRbQWV2Q8-MBT7ldJqGwC6gtX5XcIt2Wd4nEFDQxuD-poI1&t=51e37521"))
      .exec(http("request_162")
        .get("/profile/doc_mngr.aspx?_TSM_CombinedScripts_=True&v=ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1&_TSM_Bundles_=&cdn=False"))
      .exec(http("request_163")
        .get("/ScriptResource.axd?d=XGoPW3Unw0ILT0eb9sSUayB1PCvz0eeMXm23ajXUnLKSVWvpEIM7qNdgqQtwIk3oGSO-umSPRJr1BQNhALudg4-gDqI9ltlNkOQMrPf4fNHBEAhja6GHf4He4_YSEbkQ4L1Bsn1aV_AF11ks4fQlTNxlg6tYk_UGpXjfNcFSD6D49VS2gjNTnElk4fHlLsM90&t=51e37521"))
      .exec(http("request_164")
        .get("/ScriptResource.axd?d=uvA9ANM76Fbpm1FfUlagnYp2obqkhmwI_C-NoQ89dB6TwrO7THFVAk1nHl1QRi68J_pozjXYUJHgZb6l02O3dvVqjaOzdIW44mTvv4FyAQ5MvnVeKZmB7OtG9BNkATLGOGWXvK2djBpsGpZ_x3Mi2KdwGSD0SZeW5VvD940G1Y8Cml0nm6ok2UFWSXa6k4SQ0&t=51e37521"))
      .exec(http("request_165")
        .get(uri4 + "?family=Open+Sans:300,400,600,700"))

      .exec(http("request_166")
      .get(uri4 + "?family=Roboto:400,300,500,700"))
      .exec(http("request_167")
        .post("/verify_access.ashx")
      )
      .exec(http("request_168")
        .get("/Content/ESS/fonts/icomoon.ttf?5vru0d")
      )
      .exec(http("request_169")
        .get(uri3 + "?v=4.7.0")
      )
      .pause(144.milliseconds)
      .exec(http("request_170")
        .get("/Notifications/GetNotificationCounts")
      )
      .exec(http("request_171")
        .get("/Notifications/ViewNotifications?type=blfGji6WarZSao7KekahRNstsadg73rjD5ZRWV2RIXzvQN5trpKab0vbrxj3kI1lHkZP7WLZJLiVJf0bKsVSYL+2FbTKGoFrnl2bnyLuPvaSU8RqpEvsCVSLyUMuLRmYO7/PYAymLyTlmvIHyHwF3pa5znax/pG5DYn3Wgp/P7A=")
      )
      .pause(198.milliseconds)
      .exec(http("request_172")
        .get("/Notifications/GetNotificationsList?row=8")
      )
  }
  def clickDownloadItem = {
    exec(http("Click First Document")
      .post("/profile/doc_mngr.aspx?Mode=E")
      .formParam("__EVENTTARGET", "ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$btnFile")
      .formParam("__EVENTARGUMENT", "")
      .formParam("_TSM_HiddenField_", "ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1")
      .formParam("__VIEWSTATE", "${viewStateSearch}")
      .formParam("__VIEWSTATEGENERATOR", "08F0C9C6")
      .formParam("ctl00$ctl00$ctl00$selCultureName", "")
      .formParam("ctl00$ctl00$ctl00$selCountry", "1")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$hfViewBy", "E")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtDesc", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$selDocType", "WORKFLOW")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtFileName", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$gvSearch$ctl14$gpCustomPager$txtPageSize", "50")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfIndex", "0")
      .check(header("Location").saveAs("url"))
      .check(status.is(302))
    )
      .exec(http("Download")
        .get("${url}")
      )
      .exec(session => {
        val url = session("url").as[String]
        println(s"URL : $url")
        session
      })
  }
  def logout = {
    exec(http("Logout")
      .post("/profile/doc_mngr.aspx?Mode=E")
      .formParam("__EVENTTARGET", "ctl00$ctl00$ctl00$lbLogout")
      .formParam("__EVENTARGUMENT", "")
      .formParam("_TSM_HiddenField_", "ZaMfZ6yYhPPHZ1NeEf8j6-t902-6pHpn2MehV0eep-I1")
      .formParam("__VIEWSTATE", "${viewState}")
      .formParam("__VIEWSTATEGENERATOR", "08F0C9C6")
      .formParam("ctl00$ctl00$ctl00$selCultureName", "")
      .formParam("ctl00$ctl00$ctl00$selCountry", "1")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$hfViewBy", "E")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtDesc", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$selDocType", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrCriteria$txtFileName", "")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$gvSearch$ctl21$gpCustomPager$txtPageSize", "50")
      .formParam("ctl00$ctl00$ctl00$cntPlcHldrContent$cntPlcHldrContent$cntPlcHldrContent$hfIndex", "")
      .check(status.is(302)))
      .exec(http("request_107")
        .get("/Account/Login")
      )
      .exec(http("request_108")
        .get("/DXR.axd?r=1_17,0_2214,1_50,1_53,1_51,1_16,0_2219,0_2312,0_2317-O3Vxm"))
      .exec(http("request_109")
        .get("/Content/css?v=w9USDPGryprQSMA62T1giyRXrtqAIG-BphxyQY0Qw_w1"))
      .exec(http("request_110")
        .get("/bundles/jquery?v=_pxGe3mY2bQf-xjm4AiFp6ZjEyA5oTa8PuEQsuJbzEk1"))
      .exec(http("request_111")
        .get("/DXR.axd?r=1_303,1_210,1_184,1_220,1_187,1_181,1_279,1_292,1_208,1_216,1_212,1_189,1_222,17_42,1_297,1_215,1_207,1_289,1_205,17_7,1_287,1_211,17_23,1_197,17_1-N3Vxm"))
      .exec(http("request_112")
        .get("/DXR.axd?r=1_58-N3Vxm"))
      .exec(http("request_113")
        .get("/Content/Images/bg-login.jpg?V=03"))
      .exec(http("request_114")
        .get("/Content/fonts/icomoon.ttf?5vru0d")
      )
  }
}
