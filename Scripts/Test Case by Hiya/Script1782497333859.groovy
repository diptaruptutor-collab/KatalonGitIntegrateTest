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

WebUI.openBrowser(null)

WebUI.navigateToUrl('https://katalon.com/')

WebUI.click(findTestObject('Katalon.com/Page_Katalon True Platform  The AI Platform for Software Quality/a_Start free trial'))

WebUI.click(findTestObject('Katalon.com/Page_Katalon Software Quality Management Platform/a_Start trial with Katalon Studio'))

WebUI.click(findTestObject('Katalon.com/Page_Katalon Studio Download  Katalon/div_Pricing'))

WebUI.click(findTestObject('Katalon.com/Page_Katalon True Platform Pricing  Team  Enterprise Plans/div_Solutions'))

WebUI.click(findTestObject('Katalon.com/Page_Katalon True Platform Pricing  Team  Enterprise Plans/div_API Testing'))

WebUI.closeBrowser()

