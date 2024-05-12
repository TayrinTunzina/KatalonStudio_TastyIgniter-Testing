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

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - TastyIgniter/input__password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_Login - TastyIgniter/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Account - TastyIgniter/a_Reservation'))

WebUI.click(findTestObject('Object Repository/Page_Menu - TastyIgniter/a_View Menu'))

WebUI.click(findTestObject('Object Repository/Page_Menu - TastyIgniter/h6_SCOTCH EGG'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Menu - TastyIgniter/h6_SCOTCH EGG'))

WebUI.click(findTestObject('Object Repository/Page_Menu - TastyIgniter/div_Puff-Puff                            Tr_c44637'))

WebUI.click(findTestObject('Object Repository/Page_Menu - TastyIgniter/i_4.99_fa fa-plus'))

WebUI.click(findTestObject('Object Repository/Page_Menu - TastyIgniter/div_Add to order'))

WebUI.click(findTestObject('Object Repository/Page_Menu - TastyIgniter/button_Checkout  1.00'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout - TastyIgniter/input_Address 1_addressaddress_1'), 'test st.')

WebUI.click(findTestObject('Object Repository/Page_Checkout - TastyIgniter/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_Checkout Confirmation - TastyIgniter/p_Your order has been received'))

WebUI.click(findTestObject('Object Repository/Page_Checkout Confirmation - TastyIgniter/p_Your order has been received and will be _6dfe7e'))

WebUI.click(findTestObject('Object Repository/Page_Checkout Confirmation - TastyIgniter/div_12 May at 0953    Order 6              _38050f'))

