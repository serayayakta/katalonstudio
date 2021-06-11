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

WebUI.navigateToUrl('https://stackoverflow.com/')

WebUI.click(findTestObject('Object Repository/Page_Stack Overflow - Where Developers Lear_3aff7a/button_Accept all cookies'))

WebUI.click(findTestObject('Object Repository/Page_Stack Overflow - Where Developers Lear_3aff7a/svg_Take the Survey_m0 svg-icon iconClear'))

WebUI.setText(findTestObject('Object Repository/Page_Stack Overflow - Where Developers Lear_3aff7a/input_About the company_q'), 
    'unit testing')

WebUI.click(findTestObject('Object Repository/Page_Human verification - Stack Overflow/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.click(findTestObject('Object Repository/Page_Human verification - Stack Overflow/img_traffic lights_rc-image-tile-44'))

WebUI.click(findTestObject('Object Repository/Page_Human verification - Stack Overflow/img_traffic lights_rc-image-tile-44'))

WebUI.click(findTestObject('Object Repository/Page_Human verification - Stack Overflow/img_traffic lights_rc-image-tile-44'))

WebUI.click(findTestObject('Object Repository/Page_Human verification - Stack Overflow/button_Verify'))

WebUI.closeBrowser()

