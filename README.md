# Calculator App Automation With Appium
In this project i have automated the Google Calculator APK  using Selenium, TestNG, and Appium in IntelliJ IDEA, with testing conducted on the Android Studio emulator.I have generated the Allure Report for test visualization of the test suite.
## Problem Scenario
Automate any series for calculator app. Pass the series as a parameter to your test method.
For an example:

100/10*5-10+60

or

50+10-20*2+10/2

pseudocode for your test function can be look like:

public void doSeries(){

calcuateSeries("100/10*5-10+60");

}
## Prerequisites 
* Configure SDK of andriod studio
* Nodejs setup
* Appium inspector setup
* JDK 8 or above 

## Technology Used:
* Tool: _Selenium Webdriver_
* App Automation Framework: _Appium_
* Testing Framework: _TestNG_
*  Reporting Framework: _Allure_
* IDE: _Intellij, Android Studio_

## How to Run the Project
1. Clone the project
2. Open android studio go to Profile or debug APK option and open Google Calculator APK
3. Run the emulator device and go to cmd type : ````adb devices````
4. Type ````appium```` to run Apprium server
5. Go to Appium inspector and set the capability builder:
   ```
    {
   "platformName": "android",
   "platformVersion": "11",
   "appPackage": "com.google.android.calculator",
   "appActivity": "com.android.calculator2.Calculator",
   "app": "D:\\APK files\\calculator.apk",
   "automationName": "UiAutomator2"
   }  ```
6. Now open the project in intellij idea. Go to command prompt and write : ````gradle clean test```` to run the project
7. To generate Allure Report: Write the following commands in the command prompt
   
  *  _````allure generate allure-reports --clean -output````_
  *  _````allure serve allure-results````_
## Allure Report
![image](https://github.com/user-attachments/assets/3d974c38-a2e4-41c3-bba2-9b3f3dd31716)
![image](https://github.com/user-attachments/assets/2cc46692-2322-45ec-9027-cc823efe610b)
![image](https://github.com/user-attachments/assets/3e735c2d-f115-4c88-8ccc-ae78d67221ec)

## Demo Video

https://github.com/user-attachments/assets/877a38c7-937a-42db-9305-e6646afd2258



