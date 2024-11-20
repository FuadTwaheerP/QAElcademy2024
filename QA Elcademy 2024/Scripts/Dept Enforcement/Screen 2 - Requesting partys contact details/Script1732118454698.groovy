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

WebUI.click(findTestObject('Dept enforcement/Screen 2 - Requesting partys contact details/radio_Individual'))

WebUI.setText(findTestObject('Dept enforcement/Screen 2 - Requesting partys contact details/datepicker_DateOfBirth'), '20.10.1999')

WebUI.setText(findTestObject('Dept enforcement/Screen 2 - Requesting partys contact details/input_Surname'), 'Mousstass')

WebUI.setText(findTestObject('Dept enforcement/Screen 2 - Requesting partys contact details/input_FirstName'), 'Missier')

WebUI.setText(findTestObject('Dept enforcement/Screen 2 - Requesting partys contact details/input_Title'), 'Boss')

'Selecting Mr with value 1'
WebUI.selectOptionByValue(findTestObject('Dept enforcement/Screen 2 - Requesting partys contact details/dropdown_Salutation'), 
    '1', false)

WebUI.setText(findTestObject('Dept enforcement/Screen 2 - Requesting partys contact details/input_Telephone'), '0311234567')

WebUI.setText(findTestObject('Dept enforcement/Screen 2 - Requesting partys contact details/input_Email'), 'test@mail.mu')

WebUI.setText(findTestObject('Dept enforcement/Screen 2 - Requesting partys contact details/input_Street'), 'Baselstrasse')

WebUI.setText(findTestObject('Dept enforcement/Screen 2 - Requesting partys contact details/input_HouseNumber'), '1')

WebUI.setText(findTestObject('Dept enforcement/Screen 2 - Requesting partys contact details/input_AdditionalAddress'), 'Vivea Business Park')

WebUI.setText(findTestObject('Dept enforcement/Screen 2 - Requesting partys contact details/input_POBox'), '1234')

WebUI.setText(findTestObject('Dept enforcement/Screen 2 - Requesting partys contact details/input_Postcode'), '4144')

WebUI.setText(findTestObject('Dept enforcement/Screen 2 - Requesting partys contact details/input_Place'), 'Arlesheim')

WebUI.clearText(findTestObject('Dept enforcement/Screen 2 - Requesting partys contact details/input_Place'))

WebUI.setText(findTestObject('Dept enforcement/Screen 2 - Requesting partys contact details/input_Place'), 'Arlesheim')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Dept enforcement/Screen 2 - Requesting partys contact details/input_Place'), Keys.chord(Keys.DOWN, 
        Keys.ENTER))

