package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class navigateServiceInformationAndTeamDetails {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link OurServices -> Navigate to page 'generic homepage#*/home'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_company_profile/link_OurServices'))
        
        "Step 2: Click on link LearnMore -> Navigate to page 'disaster recovery services#*/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_homepage/link_LearnMore'))
        
        "Step 3: Click on link Back2 -> Navigate to page 'generic homepage#*/home'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_disaster_recovery_services/link_Back2'))
        
        "Step 4: Click on link LearnMore2 -> Navigate to page 'team information#*/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_homepage/link_LearnMore2'))
        
        "Step 5: Click on link serviceOptions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_team_information/link_serviceOptions'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        
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

