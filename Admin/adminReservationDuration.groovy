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

WebUI.navigateToUrl('http://localhost/mytasty/admin/login')

WebUI.setText(findTestObject('Object Repository/Page_Login - TastyIgniter/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - TastyIgniter/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Login - TastyIgniter/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_TastyIgniter/span_Sales'))

WebUI.click(findTestObject('Object Repository/Page_TastyIgniter/a_Reservations'))

WebUI.click(findTestObject('Object Repository/Page_Reservations - TastyIgniter/a_Switch to calender view'))

WebUI.click(findTestObject('Object Repository/Page_Reservations - TastyIgniter/a_New'))

WebUI.click(findTestObject('Object Repository/Page_Reservation Create - TastyIgniter/div_Select Value'))

WebUI.click(findTestObject('Object Repository/Page_Reservation Create - TastyIgniter/div_Table 13'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Reservation Create - TastyIgniter/select_Table 1Table 13Table 12Table 11Table_bf4330'), 
    '13', true)

WebUI.setText(findTestObject('Object Repository/Page_Reservation Create - TastyIgniter/input_Guest Number_Reservationguest_num'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Page_Reservation Create - TastyIgniter/input_Reservation Duration_Reservationduration'), 
    '-2')

WebUI.setText(findTestObject('Object Repository/Page_Reservation Create - TastyIgniter/input_Reservation Date_datepicker-formreser_21deed'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Reservation Create - TastyIgniter/input_Reservation Date_datepicker-formreser_21deed'))

WebUI.click(findTestObject('Object Repository/Page_Reservation Create - TastyIgniter/td_16'))

WebUI.setText(findTestObject('Object Repository/Page_Reservation Create - TastyIgniter/input_Reservation Time_Reservationreserve_time'), 
    '14:00')

WebUI.setText(findTestObject('Object Repository/Page_Reservation Create - TastyIgniter/input_First Name_Reservationfirst_name'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Page_Reservation Create - TastyIgniter/input_Last Name_Reservationlast_name'), 
    'Duration')

WebUI.click(findTestObject('Object Repository/Page_Reservation Create - TastyIgniter/svg_- please select -_ss-arrow'))

WebUI.click(findTestObject('Object Repository/Page_Reservation Create - TastyIgniter/div_Testrestaurant'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Reservation Create - TastyIgniter/select_DefaultTestrestaurantTestrestaurantT_d5dbef'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/Page_Reservation Create - TastyIgniter/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Reservation Edit - TastyIgniter/button_btn-close'))

