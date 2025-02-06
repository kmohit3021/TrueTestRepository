package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class fillQuoteRequestFormWithProjectDetails {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link LearnMore2 -> Navigate to page 'team information#*/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_homepage/link_LearnMore2'))
        
        "Step 2: Click on link serviceOptions -> Navigate to page 'quote request#*/get-a-quote'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_information/link_serviceOptions'))
        
        "Step 3: Click on input FullName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/input_FullName'))
        
        "Step 4: Enter input value in input FullName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_quote_request/input_FullName'), data['input_FullName'])
        
        "Step 5: Click on input Email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/input_Email'))
        
        "Step 6: Enter input value in input Email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_quote_request/input_Email'), data['input_Email'])
        
        "Step 7: Click on input CompanyName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/input_CompanyName'))
        
        "Step 8: Enter input value in input CompanyName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_quote_request/input_CompanyName'), data['input_CompanyName'])
        
        "Step 9: Click on input Phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/input_Phone'))
        
        "Step 10: Enter input value in input Phone"
        
        WebUI.setText(findTestObject('AI-Generated/Page_quote_request/input_Phone'), data['input_Phone'])
        
        "Step 11: Click on input Position"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/input_Position'))
        
        "Step 12: Enter input value in input Position"
        
        WebUI.setText(findTestObject('AI-Generated/Page_quote_request/input_Position'), data['input_Position'])
        
        "Step 13: Click on input ProjectTimeline"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/input_ProjectTimeline'))
        
        "Step 14: Enter input value in input ProjectTimeline"
        
        WebUI.setText(findTestObject('AI-Generated/Page_quote_request/input_ProjectTimeline'), data['input_ProjectTimeline'])
        
        "Step 15: Click on div designableListOptions"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_quote_request/div_designableListOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_quote_request/div_designableListOptions', ['div_designableListOptions_internalRoleOptionName': data['div_designableListOptions_internalRoleOptionName']]))
        
        "Step 16: Click on div designableListOptions"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_quote_request/div_designableListOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_quote_request/div_designableListOptions', ['div_designableListOptions_internalRoleOptionName': data['div_designableListOptions_internalRoleOptionName_1']]))
        
        "Step 17: Click on input Budget"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/input_Budget'))
        
        "Step 18: Enter input value in input Budget"
        
        WebUI.setText(findTestObject('AI-Generated/Page_quote_request/input_Budget'), data['input_Budget'])
        
        "Step 19: Click on textarea DescribeTestScenarios"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/textarea_DescribeTestScenarios'))
        
        "Step 20: Enter input value in textarea DescribeTestScenarios"
        
        WebUI.setText(findTestObject('AI-Generated/Page_quote_request/textarea_DescribeTestScenarios'), data['textarea_DescribeTestScenarios'])
        
        "Step 21: Click on button Submit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/button_Submit'))
        
        "Step 22: Click on div Close"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_quote_request/div_Close'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['div_designableListOptions_internalRoleOptionName'] = testData.getValue('div_designableListOptions_internalRoleOptionName', rowIndex)
        data['div_designableListOptions_internalRoleOptionName_1'] = testData.getValue('div_designableListOptions_internalRoleOptionName_1', rowIndex)
        data['input_Budget'] = testData.getValue('input_Budget', rowIndex)
        data['input_CompanyName'] = testData.getValue('input_CompanyName', rowIndex)
        data['input_Email'] = testData.getValue('input_Email', rowIndex)
        data['input_FullName'] = testData.getValue('input_FullName', rowIndex)
        data['input_Phone'] = testData.getValue('input_Phone', rowIndex)
        data['input_Position'] = testData.getValue('input_Position', rowIndex)
        data['input_ProjectTimeline'] = testData.getValue('input_ProjectTimeline', rowIndex)
        data['textarea_DescribeTestScenarios'] = testData.getValue('textarea_DescribeTestScenarios', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['div_designableListOptions_internalRoleOptionName'] = 'default_data'
        data['div_designableListOptions_internalRoleOptionName_1'] = 'default_data'
        data['input_Budget'] = 'default_data'
        data['input_CompanyName'] = 'default_data'
        data['input_Email'] = 'default_data'
        data['input_FullName'] = 'default_data'
        data['input_Phone'] = 'default_data'
        data['input_Position'] = 'default_data'
        data['input_ProjectTimeline'] = 'default_data'
        data['textarea_DescribeTestScenarios'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

