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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://kiemthutudong.com/blog/')

WebUI.click(findTestObject('Page_Automation Blog  Quality is not an act it is a habit  Aristotle/a_About'))

WebUI.click(findTestObject('Page_About  Automation Blog/a_Home'))

WebUI.scrollToPosition(1000, 0)

WebUI.setText(findTestObject('Page_Automation Blog  Quality is not an act it is a habit  Aristotle/input_Search for_s'), 
    'Best Software')

WebUI.click(findTestObject('Page_Automation Blog  Quality is not an act it is a habit  Aristotle/section_Search forSearch'))

WebUI.click(findTestObject('Page_Search Results for Best Software  Automation Blog/a_Continue readingBest Software Testing Quotes'))

WebUI.verifyTextPresent('Here are some of the best interesting quotes on software testing and quality assurance', false)

WebUI.closeBrowser()

