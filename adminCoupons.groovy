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

WebUI.click(findTestObject('Object Repository/Page_TastyIgniter/span_Marketing'))

WebUI.click(findTestObject('Object Repository/Page_TastyIgniter/a_Coupons'))

WebUI.click(findTestObject('Object Repository/Page_Coupons - TastyIgniter/a_New'))

WebUI.setText(findTestObject('Object Repository/Page_Coupon Create - TastyIgniter/input_Name_Couponname'), 'TestCoupon')

WebUI.setText(findTestObject('Object Repository/Page_Coupon Create - TastyIgniter/input_Code_Couponcode'), 'test123')

WebUI.setText(findTestObject('Object Repository/Page_Coupon Create - TastyIgniter/input__Coupondiscount'), '0.00')

WebUI.doubleClick(findTestObject('Object Repository/Page_Coupon Create - TastyIgniter/input__Coupondiscount'))

WebUI.setText(findTestObject('Object Repository/Page_Coupon Create - TastyIgniter/input__Coupondiscount'), '-1.00')

WebUI.click(findTestObject('Object Repository/Page_Coupon Create - TastyIgniter/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Coupon Edit - TastyIgniter/a_Coupons'))

