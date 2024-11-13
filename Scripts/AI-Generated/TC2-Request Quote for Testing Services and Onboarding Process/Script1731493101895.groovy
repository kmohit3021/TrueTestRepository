import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.common.submitQuoteRequestForm

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

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on link OurServices - Navigate to page qcitech-solutionshome.png')

"Step 3: Click on link learnMore (LearnMore3) -> Navigate to page 'qcitech-solutions/team-4'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_home/link_learnMore'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link learnMore LearnMore3 - Navigate to page qcitech-solutionsteam-4.png')

"Step 4: Click on link buyService (BuyService2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/team-4?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_team_4/link_buyService'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on link buyService BuyService2.png')

"Step 5: Fill out and submit the quote request form for testing services"

submitQuoteRequestForm.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Click on div Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/div_Close'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on div Close.png')

"Step 7: Click on link OurServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/link_OurServices'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on link OurServices - Navigate to page qcitech-solutionshome.png')

"Step 8: Click on link OnboardUs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_OnboardUs'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on link OnboardUs.png')

"Step 9: Fill out and submit the quote request form for testing services"

submitQuoteRequestForm.execute(data_path_1, Integer.valueOf(index_1))

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Request Quote for Testing Services and Onboarding Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}