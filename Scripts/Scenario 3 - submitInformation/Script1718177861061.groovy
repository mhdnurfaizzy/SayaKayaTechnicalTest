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

Mobile.startApplication('C:\\Users\\HOME\\Katalon Studio\\SayaKayaTechnicalTest\\APK\\flutter-app (1).apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Material'), 0)

Mobile.scrollToText('Text field')

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Text fieldsSingle line of editable text and numbers'), 
    0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Name'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - What do people call you'), 'Muhammad Nurfaizi', 
    10)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Phone Number'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Phone Number'), '0819039182012', 15)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - E-mail'), 'izi@gmail.com', 10)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Life story'), 'stay on the path', 10)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Salary'), '9.000.000', 10)

Mobile.scrollToText('SUBMIT')

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password'), 'inipassword', 10)

Mobile.scrollToText('SUBMIT')

Mobile.tap(findTestObject('Object Repository/android.widget.Button - SUBMIT'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

