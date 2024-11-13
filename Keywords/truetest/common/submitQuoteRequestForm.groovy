package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

public class submitQuoteRequestForm {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input FullName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_FullName'))
        
        "Step 2: Enter input value in input FullName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_FullName'), data['input_FullName'])
        
        "Step 3: Click on input Email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_Email'))
        
        "Step 4: Enter input value in input Email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_Email'), data['input_Email'])
        
        "Step 5: Click on input CompanyName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_CompanyName'))
        
        "Step 6: Enter input value in input CompanyName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_CompanyName'), data['input_CompanyName'])
        
        "Step 7: Click on input Phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_Phone'))
        
        "Step 8: Click on input Position"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_Position'))
        
        "Step 9: Enter input value in input Position"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_Position'), data['input_Position'])
        
        "Step 10: Click on form QuoteRequest"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/form_QuoteRequest'))
        
        "Step 11: Enter input value in input CompanyName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_CompanyName'), data['input_CompanyName_1'])
        
        "Step 12: Click on input ProjectTimeline"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_ProjectTimeline'))
        
        "Step 13: Enter input value in input ProjectTimeline"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_ProjectTimeline'), data['input_ProjectTimeline'])
        
        "Step 14: Click on select TestingType"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/select_TestingType'))
        
        "Step 15: Click on div serviceOptions (WebOption)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_qcitech_solutions_get_a_quote/div_serviceOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_get_a_quote/div_serviceOptions', ['div_serviceOptions_internalText': data['div_serviceOptions_internalText']]))
        
        "Step 16: Click on select TestingTool"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/select_TestingTool'))
        
        "Step 17: Click on div serviceOptions (KatalonStudioOption)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_qcitech_solutions_get_a_quote/div_serviceOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_qcitech_solutions_get_a_quote/div_serviceOptions', ['div_serviceOptions_internalText': data['div_serviceOptions_internalText_1']]))
        
        "Step 18: Click on input Budget"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_Budget'))
        
        "Step 19: Enter input value in input Budget"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_Budget'), data['input_Budget'])
        
        "Step 20: Click on textarea TestScenarios"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/textarea_TestScenarios'))
        
        "Step 21: Enter input value in textarea TestScenarios"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/textarea_TestScenarios'), data['textarea_TestScenarios'])
        
        "Step 22: Click on button Submit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/button_Submit'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['div_serviceOptions_internalText'] = testData.getValue('div_serviceOptions_internalText', rowIndex)
        data['div_serviceOptions_internalText_1'] = testData.getValue('div_serviceOptions_internalText_1', rowIndex)
        data['input_Budget'] = testData.getValue('input_Budget', rowIndex)
        data['input_CompanyName'] = testData.getValue('input_CompanyName', rowIndex)
        data['input_CompanyName_1'] = testData.getValue('input_CompanyName_1', rowIndex)
        data['input_Email'] = testData.getValue('input_Email', rowIndex)
        data['input_FullName'] = testData.getValue('input_FullName', rowIndex)
        data['input_Position'] = testData.getValue('input_Position', rowIndex)
        data['input_ProjectTimeline'] = testData.getValue('input_ProjectTimeline', rowIndex)
        data['textarea_TestScenarios'] = testData.getValue('textarea_TestScenarios', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['div_serviceOptions_internalText'] = 'default_data'
        data['div_serviceOptions_internalText_1'] = 'default_data'
        data['input_Budget'] = 'default_data'
        data['input_CompanyName'] = 'default_data'
        data['input_CompanyName_1'] = 'default_data'
        data['input_Email'] = 'default_data'
        data['input_FullName'] = 'default_data'
        data['input_Position'] = 'default_data'
        data['input_ProjectTimeline'] = 'default_data'
        data['textarea_TestScenarios'] = 'default_data'
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

