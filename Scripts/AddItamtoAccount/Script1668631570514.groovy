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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUICommonScripts
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.constants.WebUICommonScriptConstants
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.webui.contribution.WebUiKeywordContributor
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import javassist.compiler.KeywordTable

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebDriver as Keys

CustomKeywords.'demokatalon.Login.loginwithCredentials'(GlobalVariable.UserName, GlobalVariable.Password)


//WebUI


//WebUIAbstractKeyword

//WebUiCommonHelper

//WebUICommonScripts.

//WebUIKeywordMain

//KeywordUtil



WebDriver driver=DriverFactory.getWebDriver()

//driver.findElement(By.ByXPath(""));



WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_0dff71'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_1'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Remove'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_firstName'), 'shravan')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_lastName'), 'tentu')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_postalCode'), '5678')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Cancel_continue'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Finish'))

WebUI.verifyTextPresent("THANK YOU FOR YOUR ORDER", false)

WebUI.closeBrowser()


 




//(findTestObject('Object Repository/Page_Swag Labs/h2_THANK YOU FOR YOUR ORDER'))

