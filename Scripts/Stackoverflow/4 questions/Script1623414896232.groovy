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

WebUI.click(findTestObject('Object Repository/Page_Stack Overflow - Where Developers Lear_3aff7a/span_Home_ps-relative'))

WebUI.click(findTestObject('Object Repository/Page_Stack Overflow - Where Developers Lear_3aff7a/span_Questions'))

WebUI.click(findTestObject('Object Repository/Page_Newest Questions - Stack Overflow/button_Accept all cookies'))

WebUI.click(findTestObject('Object Repository/Page_Newest Questions - Stack Overflow/path'))

WebUI.click(findTestObject('Object Repository/Page_Newest Questions - Stack Overflow/input_No accepted answer_filterId'))

WebUI.click(findTestObject('Object Repository/Page_Newest Questions - Stack Overflow/button_Apply filter'))

WebUI.click(findTestObject('Object Repository/Page_Custom filtered posts - Stack Overflow/input_Recent activity_sortId'))

WebUI.setText(findTestObject('Object Repository/Page_Custom filtered posts - Stack Overflow/input_The following tags_s-input js-tagedit_3630b1'), 
    't')

WebUI.setText(findTestObject('Object Repository/Page_Custom filtered posts - Stack Overflow/input_The following tags_s-input js-tagedit_3630b1_1'), 
    'testing')

WebUI.click(findTestObject('Object Repository/Page_Custom filtered posts - Stack Overflow/span_testing'))

WebUI.click(findTestObject('Object Repository/Page_Custom filtered posts - Stack Overflow/button_Apply filter'))

WebUI.closeBrowser()
