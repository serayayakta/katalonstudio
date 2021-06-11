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

WebUI.click(findTestObject('Object Repository/Page_Stack Overflow - Where Developers Lear_3aff7a/span_Home_ps-relative'))

WebUI.click(findTestObject('Object Repository/Page_Stack Overflow - Where Developers Lear_3aff7a/div_Jobs'))

WebUI.setText(findTestObject('Object Repository/Page_Developer Jobs, Programming Jobs  More_d3b4aa/input_View all your job applications_q'), 
    'software engineer')

WebUI.click(findTestObject('Object Repository/Page_Developer Jobs, Programming Jobs  More_d3b4aa/input_View all your job applications_l'))

WebUI.setText(findTestObject('Object Repository/Page_Developer Jobs, Programming Jobs  More_d3b4aa/input_View all your job applications_l'), 
    'istanbul')

WebUI.click(findTestObject('Object Repository/Page_Developer Jobs, Programming Jobs  More_d3b4aa/span_within 20 km'))

WebUI.click(findTestObject('Object Repository/Page_Developer Jobs, Programming Jobs  More_d3b4aa/li_within 10 km'))

WebUI.click(findTestObject('Object Repository/Page_Developer Jobs, Programming Jobs  More_d3b4aa/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Developer Jobs, Programming Jobs  More_d3b4aa/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Developer Jobs, Programming Jobs  More_d3b4aa/input_View all your job applications_q'))

WebUI.click(findTestObject('Object Repository/Page_Developer Jobs, Programming Jobs  More_d3b4aa/input_View all your job applications_q'))

WebUI.click(findTestObject('Object Repository/Page_Developer Jobs, Programming Jobs  More_d3b4aa/input_View all your job applications_q'))

WebUI.closeBrowser()

