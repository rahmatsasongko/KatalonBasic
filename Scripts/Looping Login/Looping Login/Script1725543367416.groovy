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

for (int i = 1; i < 3; i++) {
    WebUI.openBrowser('https://demowebshop.tricentis.com/login')

    WebUI.setText(findTestObject('ObjectLogin/input_Email_Email'), 'testqa1@yopmail.com')

    WebUI.setText(findTestObject('ObjectLogin/input_Password_Password'), 'Dummy123')

    WebUI.click(findTestObject('ObjectLogin/input_Forgot password_button-1 login-button'))

    WebUI.verifyElementText(findTestObject('ObjectLogin/verifyEmail'), 'testqa1@yopmail.com')

    WebUI.click(findTestObject('ObjectLogin/a_Log out'), FailureHandling.STOP_ON_FAILURE)
}

