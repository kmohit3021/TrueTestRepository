import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.submitQuoteRequestForm
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

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

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on link OurServices - Navigate to page qcitech-solutionshome.png')

"Step 3: Click on link learnMore (LearnMore) -> Navigate to page 'qcitech-solutions/team-4'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/link_learnMore'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on link learnMore LearnMore - Navigate to page qcitech-solutionsteam-4.png')

"Step 4: Click on link buyService (BuyService)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/team-4?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_team_4/link_buyService'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on link buyService BuyService.png')

"Step 5: Fill out and submit the quote request form for testing services"

submitQuoteRequestForm.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Click on div Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/div_Close'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on div Close.png')

"Step 7: Click on link OurServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/link_OurServices'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on link OurServices - Navigate to page qcitech-solutionshome.png')

"Step 8: Click on link OnboardUs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_OnboardUs'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on link OnboardUs.png')

"Step 9: Fill out and submit the quote request form for testing services"

submitQuoteRequestForm.execute(data_path_1, Integer.valueOf(index_1))

"Step 10: Click on span Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/span_Close'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on span Close.png')

"Step 11: Click on link OurServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/link_OurServices'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on link OurServices - Navigate to page qcitech-solutionshome.png')

"Step 12: Click on button Prev"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/button_Prev'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on button Prev.png')

"Step 13: Click on div MeshContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/div_MeshContainer'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Click on div MeshContainer.png')

"Step 14: Click on button Prev"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/button_Prev'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Click on button Prev.png')

"Step 15: Click on div MeshContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/div_MeshContainer'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 15-Click on div MeshContainer.png')

"Step 16: Click on div ColorUnderlay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/div_ColorUnderlay'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 16-Click on div ColorUnderlay.png')

"Step 17: Click on button Prev"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/button_Prev'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 17-Click on button Prev.png')

"Step 18: Click on div Testimonials"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/div_Testimonials'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 18-Click on div Testimonials.png')

"Step 19: Click on div ContainerBackground"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/div_ContainerBackground'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 19-Click on div ContainerBackground.png')

"Step 20: Click on link OnboardUs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_OnboardUs2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 20-Click on link OnboardUs2.png')

"Step 21: Fill out and submit the quote request form for testing services"

submitQuoteRequestForm.execute(data_path_2, Integer.valueOf(index_2))

"Step 22: Click on span Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/span_Close'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 22-Click on span Close.png')

"Step 23: Click on link OurServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/link_OurServices'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 23-Click on link OurServices - Navigate to page qcitech-solutionshome.png')

"Step 24: Click on header AutomationTesting"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/header_AutomationTesting'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 24-Click on header AutomationTesting.png')

"Step 25: Click on link OurServices"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_OurServices'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 25-Click on link OurServices.png')

"Step 26: Click on link learnMore (LearnMore2) -> Navigate to page 'qcitech-solutions/team-4'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/link_learnMore'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 26-Click on link learnMore LearnMore2 - Navigate to page qcitech-solutionsteam-4.png')

"Step 27: Click on link buyService (BuyService2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/team-4?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_team_4/link_buyService'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 27-Click on link buyService BuyService2.png')

"Step 28: Fill out and submit the quote request form for testing services"

submitQuoteRequestForm.execute(data_path_3, Integer.valueOf(index_3))

"Step 29: Click on div ColorUnderlay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/div_ColorUnderlay'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 29-Click on div ColorUnderlay.png')

"Step 30: Click on span Close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/span_Close'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 30-Click on span Close - Navigate to page .png')

"Step 31: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Test Service Quote Request and Onboarding Process in Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}