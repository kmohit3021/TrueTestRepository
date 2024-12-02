import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.submitQuoteRequestForm
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /qcitech-solutions"

TrueTestScripts.navigate("/qcitech-solutions")

"Step 2: Click on link OurServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions/link_OurServices'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on link OurServices - Navigate to page qcitech-solutionshome.png')

"Step 3: Click on link learnMore (LearnMore) -> Navigate to page 'qcitech-solutions/team-4'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/link_learnMore'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on link learnMore LearnMore - Navigate to page qcitech-solutionsteam-4.png')

"Step 4: Click on link buyService (BuyService)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/team-4?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_team_4/link_buyService'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on link buyService BuyService.png')

"Step 5: Fill out and submit the quote request form for testing services"

submitQuoteRequestForm.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Click on div Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/div_Close'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on div Close.png')

"Step 7: Click on link OurServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/link_OurServices'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on link OurServices - Navigate to page qcitech-solutionshome.png')

"Step 8: Click on link OnboardUs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_OnboardUs'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on link OnboardUs.png')

"Step 9: Fill out and submit the quote request form for testing services"

submitQuoteRequestForm.execute(data_path_1, Integer.valueOf(index_1))

"Step 10: Click on span Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/span_Close'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Click on span Close.png')

"Step 11: Click on link OurServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/link_OurServices'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Click on link OurServices - Navigate to page qcitech-solutionshome.png')

"Step 12: Click on button navigation (Prev)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation', ['button_navigation_dataTestid': button_navigation_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 12-Click on button navigation Prev.png')

"Step 13: Click on div MeshContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/div_MeshContainer'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 13-Click on div MeshContainer.png')

"Step 14: Click on button navigation (Prev)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation', ['button_navigation_dataTestid': button_navigation_dataTestid_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 14-Click on button navigation Prev.png')

"Step 15: Click on div MeshContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/div_MeshContainer'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 15-Click on div MeshContainer.png')

"Step 16: Click on div ColorUnderlay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/div_ColorUnderlay'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 16-Click on div ColorUnderlay.png')

"Step 17: Click on button navigation (Prev)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation', ['button_navigation_dataTestid': button_navigation_dataTestid_2]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 17-Click on button navigation Prev.png')

"Step 18: Click on div Testimonials"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/div_Testimonials'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 18-Click on div Testimonials.png')

"Step 19: Click on div ContainerBackground"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/div_ContainerBackground'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 19-Click on div ContainerBackground.png')

"Step 20: Click on link OnboardUs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_OnboardUs2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 20-Click on link OnboardUs2.png')

"Step 21: Fill out and submit the quote request form for testing services"

submitQuoteRequestForm.execute(data_path_2, Integer.valueOf(index_2))

"Step 22: Click on span Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/span_Close'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 22-Click on span Close.png')

"Step 23: Click on link OurServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/link_OurServices'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 23-Click on link OurServices - Navigate to page qcitech-solutionshome.png')

"Step 24: Click on header AutomationTesting"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/header_AutomationTesting'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 24-Click on header AutomationTesting.png')

"Step 25: Click on link OurServices"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_OurServices'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 25-Click on link OurServices.png')

"Step 26: Click on link learnMore (LearnMore2) -> Navigate to page 'qcitech-solutions/team-4'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/link_learnMore'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 26-Click on link learnMore LearnMore2 - Navigate to page qcitech-solutionsteam-4.png')

"Step 27: Click on link buyService (BuyService2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/team-4?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_team_4/link_buyService'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 27-Click on link buyService BuyService2.png')

"Step 28: Fill out and submit the quote request form for testing services"

submitQuoteRequestForm.execute(data_path_3, Integer.valueOf(index_3))

"Step 29: Click on div ColorUnderlay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/div_ColorUnderlay'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 29-Click on div ColorUnderlay.png')

"Step 30: Click on span Close -> Navigate to page '/qcitech-solutions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/span_Close'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 30-Click on span Close - Navigate to page qcitech-solutions.png')

"Step 31: Click on link OurServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions/link_OurServices'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 31-Click on link OurServices - Navigate to page qcitech-solutionshome.png')

"Step 32: Click on link learnMore (LearnMore) -> Navigate to page 'qcitech-solutions/team-4'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/link_learnMore'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 32-Click on link learnMore LearnMore - Navigate to page qcitech-solutionsteam-4.png')

"Step 33: Click on link buyService (BuyService3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/team-4?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_team_4/link_buyService'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 33-Click on link buyService BuyService3.png')

"Step 34: Fill out and submit the quote request form for testing services"

submitQuoteRequestForm.execute(data_path_4, Integer.valueOf(index_4))

"Step 35: Click on div Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/div_Close'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 35-Click on div Close.png')

"Step 36: Click on link OurServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/link_OurServices'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 36-Click on link OurServices - Navigate to page qcitech-solutionshome.png')

"Step 37: Click on link LearnMore3 -> Navigate to page 'qcitech-solutions/cloud-desktop'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_LearnMore3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 37-Click on link LearnMore3 - Navigate to page qcitech-solutionscloud-desktop.png')

"Step 38: Click on link Back -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/cloud-desktop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_cloud_desktop/link_Back'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 38-Click on link Back - Navigate to page qcitech-solutionshome.png')

"Step 39: Click on link LearnMore4 -> Navigate to page 'qcitech-solutions/disaster-recovery'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_LearnMore4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 39-Click on link LearnMore4 - Navigate to page qcitech-solutionsdisaster-recovery.png')

"Step 40: Click on link Back -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/disaster-recovery?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_disaster_recovery/link_Back'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 40-Click on link Back - Navigate to page qcitech-solutionshome.png')

"Step 41: Click on link learnMore (LearnMore2) -> Navigate to page 'qcitech-solutions/team-4'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/link_learnMore'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 41-Click on link learnMore LearnMore2 - Navigate to page qcitech-solutionsteam-4.png')

"Step 42: Click on link buyService (BuyService4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/team-4?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_team_4/link_buyService'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 42-Click on link buyService BuyService4.png')

"Step 43: Fill out and submit the quote request form for testing services"

submitQuoteRequestForm.execute(data_path_5, Integer.valueOf(index_5))

"Step 44: Click on span Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/span_Close'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 44-Click on span Close.png')

"Step 45: Click on link OurServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/link_OurServices'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 45-Click on link OurServices - Navigate to page qcitech-solutionshome.png')

"Step 46: Click on link learnMore (LearnMore) -> Navigate to page 'qcitech-solutions/team-4'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/link_learnMore'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 46-Click on link learnMore LearnMore - Navigate to page qcitech-solutionsteam-4.png')

"Step 47: Click on link buyService (BuyService5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/team-4?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_team_4/link_buyService'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 47-Click on link buyService BuyService5.png')

"Step 48: Fill out and submit the quote request form for testing services"

submitQuoteRequestForm.execute(data_path_6, Integer.valueOf(index_6))

"Step 49: Click on span Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/span_Close'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 49-Click on span Close.png')

"Step 50: Click on link Videos -> Navigate to page 'qcitech-solutions/videos'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/link_Videos'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 50-Click on link Videos - Navigate to page qcitech-solutionsvideos.png')

"Step 51: Click on link AboutUs -> Navigate to page '/qcitech-solutions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/videos?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_videos/link_AboutUs'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 51-Click on link AboutUs - Navigate to page qcitech-solutions.png')

"Step 52: Click on link OurServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions/link_OurServices'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 52-Click on link OurServices - Navigate to page qcitech-solutionshome.png')

"Step 53: Click on header PremierTestingPartners"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/header_PremierTestingPartners'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 53-Click on header PremierTestingPartners.png')

"Step 54: Click on link OnboardUs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_OnboardUs'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 54-Click on link OnboardUs.png')

"Step 55: Fill out and submit the quote request form for testing services"

submitQuoteRequestForm.execute(data_path_7, Integer.valueOf(index_7))

"Step 56: Click on span Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/span_Close'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 56-Click on span Close.png')

"Step 57: Click on link Videos -> Navigate to page 'qcitech-solutions/videos'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/link_Videos'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 57-Click on link Videos - Navigate to page qcitech-solutionsvideos.png')

"Step 58: Click on link OurServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/videos?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_videos/link_OurServices'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 58-Click on link OurServices - Navigate to page qcitech-solutionshome.png')

"Step 59: Click on button navigation (Next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation', ['button_navigation_dataTestid': button_navigation_dataTestid_3]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 59-Click on button navigation Next.png')

"Step 60: Click on button navigation (Next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation', ['button_navigation_dataTestid': button_navigation_dataTestid_4]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 60-Click on button navigation Next.png')

"Step 61: Click on button navigation (Next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation', ['button_navigation_dataTestid': button_navigation_dataTestid_5]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 61-Click on button navigation Next.png')

"Step 62: Click on header ReadyToEnsureQuality"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/header_ReadyToEnsureQuality'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 62-Click on header ReadyToEnsureQuality.png')

"Step 63: Click on link OnboardUs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_OnboardUs2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 63-Click on link OnboardUs2.png')

"Step 64: Fill out and submit the quote request form for testing services"

submitQuoteRequestForm.execute(data_path_8, Integer.valueOf(index_8))

"Step 65: Click on div Close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/div_Close'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 65-Click on div Close - Navigate to page .png')

"Step 66: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Request Multiple Quotes for Testing Services from Various Pages_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}