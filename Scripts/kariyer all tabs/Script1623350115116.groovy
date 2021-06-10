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

WebUI.click(findTestObject('Object Repository/Page_Trkiye Cumhuriyeti  letiim Bakanl/a_Kariyer'))

WebUI.click(findTestObject('Object Repository/Page_Trkiye Cumhuriyeti  letiim Bakanl/a_Sz.Mtercim-Tercman'))

WebUI.click(findTestObject('Object Repository/Page_Trkiye Cumhuriyeti  letiim Bakanl/a_Redaktr'))

WebUI.click(findTestObject('Object Repository/Page_Trkiye Cumhuriyeti  letiim Bakanl/a_Sz. Basn-Enformasyon Pers'))

WebUI.click(findTestObject('Object Repository/Page_Trkiye Cumhuriyeti  letiim Bakanl/a_letiim Uzman'))

WebUI.click(findTestObject('Object Repository/Page_Trkiye Cumhuriyeti  letiim Bakanl/a_Basn Maviri'))

WebUI.click(findTestObject('Object Repository/Page_Trkiye Cumhuriyeti  letiim Bakanl/a_Mahalli Katip Sekreter'))

WebUI.click(findTestObject('Object Repository/Page_Trkiye Cumhuriyeti  letiim Bakanl/a_Duyurular'))

WebUI.closeBrowser()

