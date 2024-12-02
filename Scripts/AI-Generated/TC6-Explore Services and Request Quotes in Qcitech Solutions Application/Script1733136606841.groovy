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

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions/link_OurServices_1'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Click on link OurServices - Navigate to page qcitech-solutionshome.png')

"Step 3: Click on link learnMore (LearnMore) -> Navigate to page 'qcitech-solutions/team-4'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/link_learnMore_1'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on link learnMore LearnMore - Navigate to page qcitech-solutionsteam-4.png')

"Step 4: Click on link buyService (BuyService)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/team-4?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_team_4/link_buyService_1'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on link buyService BuyService.png')

"Step 5: Fill out and submit the quote request form for testing services"

submitQuoteRequestForm.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Click on div Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/div_Close_1'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on div Close.png')

"Step 7: Click on link Videos -> Navigate to page 'qcitech-solutions/videos'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/link_Videos_1'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on link Videos - Navigate to page qcitech-solutionsvideos.png')

"Step 8: Click on link ContactUs -> Navigate to page 'qcitech-solutions/get-a-quote'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/videos?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_videos/link_ContactUs_1'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on link ContactUs - Navigate to page qcitech-solutionsget-a-quote.png')

"Step 9: Click on link AboutUs -> Navigate to page '/qcitech-solutions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/link_AboutUs'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Click on link AboutUs - Navigate to page qcitech-solutions.png')

"Step 10: Click on link OurServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions/link_OurServices_1'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Click on link OurServices - Navigate to page qcitech-solutionshome.png')

"Step 11: Click on link OnboardUs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_OnboardUs_1'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11-Click on link OnboardUs.png')

"Step 12: Fill out and submit the quote request form for testing services"

submitQuoteRequestForm.execute(data_path_1, Integer.valueOf(index_1))

"Step 13: Click on span Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/span_Close2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 13-Click on span Close.png')

"Step 14: Click on link OurServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/link_OurServices_1'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 14-Click on link OurServices - Navigate to page qcitech-solutionshome.png')

"Step 15: Click on button navigation (Prev)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation_1', ['button_navigation_class': button_navigation_class, 'button_navigation_dataTestid': button_navigation_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 15-Click on button navigation Prev.png')

"Step 16: Click on button navigation (Prev)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation_1', ['button_navigation_class': button_navigation_class_1, 'button_navigation_dataTestid': button_navigation_dataTestid_1]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 16-Click on button navigation Prev.png')

"Step 17: Click on button navigation (Prev)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation_1', ['button_navigation_class': button_navigation_class_2, 'button_navigation_dataTestid': button_navigation_dataTestid_2]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 17-Click on button navigation Prev.png')

"Step 18: Click on button navigation (Next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation_1', ['button_navigation_class': button_navigation_class_3, 'button_navigation_dataTestid': button_navigation_dataTestid_3]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 18-Click on button navigation Next.png')

"Step 19: Click on button navigation (Next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation_1', ['button_navigation_class': button_navigation_class_4, 'button_navigation_dataTestid': button_navigation_dataTestid_4]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 19-Click on button navigation Next.png')

"Step 20: Click on button navigation (Next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation_1', ['button_navigation_class': button_navigation_class_5, 'button_navigation_dataTestid': button_navigation_dataTestid_5]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 20-Click on button navigation Next.png')

"Step 21: Click on button navigation (Next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/button_navigation_1', ['button_navigation_class': button_navigation_class_6, 'button_navigation_dataTestid': button_navigation_dataTestid_6]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 21-Click on button navigation Next.png')

"Step 22: Click on link OnboardUs2 -> Navigate to page 'qcitech-solutions/get-a-quote'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_OnboardUs2_1'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 22-Click on link OnboardUs2 - Navigate to page qcitech-solutionsget-a-quote.png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Explore Services and Request Quotes in Qcitech Solutions Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}