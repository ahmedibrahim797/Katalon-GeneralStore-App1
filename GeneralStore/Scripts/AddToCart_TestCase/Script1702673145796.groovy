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

Mobile.startApplication('D:\\General-Store.apk', true)

Mobile.tap(findTestObject('Object Repository/SelectCountryList'), 0)

Mobile.tap(findTestObject('Object Repository/ChooseTheOption - Andorra'), 0)

Mobile.sendKeys(findTestObject('Object Repository/EnterTheName'), 'Ahmed Mohamed Ibrahim')

Mobile.tap(findTestObject('Object Repository/GenderRadioButton - Male'), 0)

Mobile.tap(findTestObject('Object Repository/Button - Lets Shop'), 0)

Mobile.tap(findTestObject('Object Repository/TheSelected-Item'), 0)

Mobile.tap(findTestObject('Object Repository/AddToCart-ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/The Item -In My Cart'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/The Item -In My Cart'), 0)

Mobile.closeApplication()

