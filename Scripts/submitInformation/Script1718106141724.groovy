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

// Start the mobile application
Mobile.startApplication('C:\\Users\\HOME\\Katalon Studio\\SayaKayaTechnicalTest\\APK\\flutter-app (1).apk', true)

// Tap on the Material button
Mobile.tap(findTestObject('Object Repository/android.widget.Button - Material'), 0)

// Scroll to the Text field option
Mobile.scrollToText('Text field')

// Tap on the Text fields button
Mobile.tap(findTestObject('Object Repository/android.widget.Button - Text fieldsSingle line of editable text and numbers'), 
    0)

// Tap on the Name input field
Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Name'), 0)

// Set text in the Name input field
//Mobile.setText(findTestObject('Object Repository/android.widget.EditText - What do people call you'), 'Muhammad Nurfaizi', 
//    10)
Mobile.setText(findTestObject('android.widget.EditText - What do people call you'), 'hggghjghvjvb', 10, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

//Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Name'), 'hggghjghvjvb')
// Tap on the Phone Number input field
Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Phone Number'), 0)

// Set text in the Phone Number input field
Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Phone Number'), '0819039182012', 15)

// Set text in the E-mail input field
Mobile.setText(findTestObject('Object Repository/android.widget.EditText - E-mail'), 'izi@gmail.com', 10)

// Set text in the Life story input field
Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Life story'), 'stay on the path', 10)

// Set text in the Salary input field
Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Salary'), '9.000.000', 10)

// Set text in the Password input field
Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password'), 'inipassword', 10)

// Scroll to the SUBMIT button
Mobile.scrollToText('SUBMIT')

// Tap on the SUBMIT button
Mobile.tap(findTestObject('Object Repository/android.widget.Button - SUBMIT'), 0)

// Close the mobile application
Mobile.closeApplication()

