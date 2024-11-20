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

WebUI.callTestCase(findTestCase('Dept Enforcement/Navigating to dept enforcement'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Common/button_Finish'))

WebUI.callTestCase(findTestCase('Dept Enforcement/Screen 1 - Extract Required'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Common/button_NextStep'))

WebUI.callTestCase(findTestCase('Dept Enforcement/Screen 2 - Requesting partys contact details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Common/button_NextStep'))

WebUI.callTestCase(findTestCase('Dept Enforcement/Screen 4 - Review Screen'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Common/button_NextStep'))

WebUI.callTestCase(findTestCase('Dept Enforcement/Screen 3 - Select debt enforcement office'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Common/button_Start'))

WebUI.click(findTestObject('Common/button_OkInPopup'))

WebUI.callTestCase(findTestCase('Dept Enforcement/Screen 5 - Delivery method'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Common/button_NextStep'))

WebUI.callTestCase(findTestCase('Dept Enforcement/Screen 6 - Delivery details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Common/button_NextStep'))

WebUI.callTestCase(findTestCase('Dept Enforcement/Screen 7 - Finish Screen'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Common/button_Complete'))

