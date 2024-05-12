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

WebUI.navigateToUrl('http://127.0.0.1:8000/')

WebUI.click(findTestObject('Object Repository/Page_Online Order - TastyIgniter/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Login - TastyIgniter/input_Log In_email'), 'test@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Login - TastyIgniter/input_Log In_email'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - TastyIgniter/input__password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_Login - TastyIgniter/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Account - TastyIgniter/a_Reservation'))

WebUI.click(findTestObject('Object Repository/Page_Reservation - TastyIgniter/td_30'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Reservation - TastyIgniter/select_2 people            3 people        _867a43'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Reservation - TastyIgniter/select_1200 am                    1205 am  _94b6ad'), 
    '00:15', true)

WebUI.click(findTestObject('Object Repository/Page_Reservation - TastyIgniter/button_Find Table'))

WebUI.click(findTestObject('Object Repository/Page_Reservation - TastyIgniter/button_1225 am'))

WebUI.click(findTestObject('Object Repository/Page_Reservation - TastyIgniter/button_Complete Reservation'))

WebUI.click(findTestObject('Object Repository/Page_Reservation Confirmation - TastyIgniter/p_Thank You Test Customer,'))

WebUI.click(findTestObject('Object Repository/Page_Reservation Confirmation - TastyIgniter/p_Your reservation at Default has been book_6c6f11'))

WebUI.click(findTestObject('Object Repository/Page_Reservation Confirmation - TastyIgniter/body_View Menu                             _b312d7'))

