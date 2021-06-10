import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.iletisim.gov.tr/turkce')

WebUI.click(findTestObject('Object Repository/Page_Trkiye Cumhuriyeti  letiim Bakanl/i_letiim_ui-search nav__search-trigger-icon'))

WebUI.setText(findTestObject('Object Repository/Page_Trkiye Cumhuriyeti  letiim Bakanl/input_letiim_keywords'), 'rapor')

WebUI.click(findTestObject('Object Repository/Page_Trkiye Cumhuriyeti  letiim Bakanl/i_letiim_ui-search nav__search-icon'))

WebUI.click(findTestObject('Object Repository/Page_Trkiye Cumhuriyeti  letiim Bakanl/a_letiim Bakanl_pagination__page pagination_270c3e'))

WebUI.click(findTestObject('Object Repository/Page_/a_letiim Bakanl_pagination__page pagination_270c3e'))

WebUI.click(findTestObject('Object Repository/Page_/a_letiim Bakanl_pagination__page pagination_270c3e_1'))

WebUI.closeBrowser()

