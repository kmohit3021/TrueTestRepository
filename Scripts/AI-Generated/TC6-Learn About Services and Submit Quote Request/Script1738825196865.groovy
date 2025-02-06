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

"Step 2: Click on link OurServices -> Navigate to page 'generic homepage#*/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_company_profile/link_OurServices_1'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Click on link OurServices - Navigate to page generic homepagehome.png')

"Step 3: Click on link LearnMore -> Navigate to page 'disaster recovery services#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_homepage/link_LearnMore'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on link LearnMore - Navigate to page disaster recovery services.png')

"Step 4: Click on link Back"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_disaster_recovery_services/link_Back'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on link Back.png')

"Step 5: Fill out the quote request form with project details"

fillQuoteRequestFormWithProjectDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Learn About Services and Submit Quote Request_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}