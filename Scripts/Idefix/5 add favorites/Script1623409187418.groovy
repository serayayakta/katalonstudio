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

WebUI.navigateToUrl('https://www.idefix.com/')

WebUI.click(findTestObject('Object Repository/Page_Kitap, Hobi, Oyuncak, Kulaklk, ok Sata_319555/a_Giri Yap'))

WebUI.click(findTestObject('Object Repository/Page_Kitap, Hobi, Oyuncak, Kulaklk, ok Sata_319555/a_Giri Yap_1'))

WebUI.setText(findTestObject('Object Repository/Page_Giri  idefix/input_E-Posta Adresi_EmailField'), 'leesera@naver.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Giri  idefix/input_ifre_PasswordField'), 'tO3m0nBa5UU8Rk419DvAxw==')

WebUI.click(findTestObject('Object Repository/Page_Giri  idefix/input_ifremi Unuttum_login_btn'))

WebUI.setText(findTestObject('Object Repository/Page_Kitap, Hobi, Oyuncak, Kulaklk, ok Sata_319555/input_letiim_searchInput'), 
    'Biri,Hiçbiri,Binlercesi')

WebUI.click(findTestObject('Object Repository/Page_Kitap, Hobi, Oyuncak, Kulaklk, ok Sata_319555/input_letiim_searchIcon'))

WebUI.click(findTestObject('Object Repository/Page_Kitap, Hobi, Oyuncak, Kulaklk, ok Sata_319555/img_nerilen_lazyloaded'))

WebUI.click(findTestObject('Object Repository/Page_Biri Hibiri Binlercesi , Luigi Pirande_bc8a35/a_FAVORLERME EKLE'))

WebUI.click(findTestObject('Object Repository/Page_Biri Hibiri Binlercesi , Luigi Pirande_bc8a35/a_SEPETE GT_fancybox-item fancybox-close'))

WebUI.click(findTestObject('Object Repository/Page_Biri Hibiri Binlercesi , Luigi Pirande_bc8a35/a_Favori Listem'))

WebUI.click(findTestObject('Object Repository/Page_Beendiklerim  idefix/ins_STOK DURUMU_iCheck-helper'))

WebUI.click(findTestObject('Object Repository/Page_Beendiklerim  idefix/a_SL'))

WebUI.closeBrowser()
