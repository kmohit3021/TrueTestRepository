import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillQuoteRequestFormWithProjectDetails
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to *"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}")

"Step 2: Click on link OurServices"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_company_profile/link_OurServices'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on link OurServices.png')

"Step 3: Fill out the quote request form with project details"

fillQuoteRequestFormWithProjectDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Click on link Videos -> Navigate to page 'video content page#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/link_Videos'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on link Videos - Navigate to page video content page.png')

"Step 5: Click on link ContactUs -> Navigate to page 'quote request#*/get-a-quote'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_video_content_page/link_ContactUs'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on link ContactUs - Navigate to page quote requestget-a-quote.png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Request a Quote and Verify Submission on Company Profile Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}