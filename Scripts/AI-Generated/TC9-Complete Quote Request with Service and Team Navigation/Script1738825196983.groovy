import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.navigateServiceInformationAndTeamDetails
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

"Step 2: Navigate through service information and team details"

navigateServiceInformationAndTeamDetails.execute()

"Step 3: Click on input FullName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/input_FullName'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on input FullName.png')

"Step 4: Enter input value in input FullName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_quote_request/input_FullName'), input_FullName)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Enter input value in input FullName.png')

"Step 5: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on input Email.png')

"Step 6: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_quote_request/input_Email'), input_Email)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Enter input value in input Email.png')

"Step 7: Click on input CompanyName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/input_CompanyName'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on input CompanyName.png')

"Step 8: Enter input value in input CompanyName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_quote_request/input_CompanyName'), input_CompanyName)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Enter input value in input CompanyName.png')

"Step 9: Click on input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/input_Phone'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on input Phone.png')

"Step 10: Enter input value in input Phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_quote_request/input_Phone'), input_Phone)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Enter input value in input Phone.png')

"Step 11: Click on input Position"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/input_Position'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Click on input Position.png')

"Step 12: Enter input value in input Position"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_quote_request/input_Position'), input_Position)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Enter input value in input Position.png')

"Step 13: Click on form QuoteRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/form_QuoteRequest'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 13-Click on form QuoteRequest.png')

"Step 14: Click on input ProjectTimeline"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/input_ProjectTimeline'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Click on input ProjectTimeline.png')

"Step 15: Enter input value in input ProjectTimeline"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_quote_request/input_ProjectTimeline'), input_ProjectTimeline)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 15-Enter input value in input ProjectTimeline.png')

"Step 16: Click on div designableListOptions (DesignableListOption4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_quote_request/div_designableListOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_quote_request/div_designableListOptions', ['div_designableListOptions_internalRoleOptionName': div_designableListOptions_internalRoleOptionName]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 16-Click on div designableListOptions DesignableListOption4.png')

"Step 17: Click on label TestingTool"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/label_TestingTool'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 17-Click on label TestingTool.png')

"Step 18: Click on div designableListOptions (DesignableListOption5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_quote_request/div_designableListOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_quote_request/div_designableListOptions', ['div_designableListOptions_internalRoleOptionName': div_designableListOptions_internalRoleOptionName_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 18-Click on div designableListOptions DesignableListOption5.png')

"Step 19: Click on input Budget"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/input_Budget'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 19-Click on input Budget.png')

"Step 20: Enter input value in input Budget"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_quote_request/input_Budget'), input_Budget)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 20-Enter input value in input Budget.png')

"Step 21: Click on textarea DescribeTestScenarios"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/textarea_DescribeTestScenarios'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 21-Click on textarea DescribeTestScenarios.png')

"Step 22: Enter input value in textarea DescribeTestScenarios"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_quote_request/textarea_DescribeTestScenarios'), textarea_DescribeTestScenarios)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 22-Enter input value in textarea DescribeTestScenarios.png')

"Step 23: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 23-Click on button Submit.png')

"Step 24: Click on div Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/div_Close'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 24-Click on div Close.png')

"Step 25: Click on link Videos -> Navigate to page 'video content page#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/link_Videos'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 25-Click on link Videos - Navigate to page video content page.png')

"Step 26: Click on link ContactUs -> Navigate to page 'quote request#*/get-a-quote'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_video_content_page/link_ContactUs'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 26-Click on link ContactUs - Navigate to page quote requestget-a-quote.png')

"Step 27: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Complete Quote Request with Service and Team Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}