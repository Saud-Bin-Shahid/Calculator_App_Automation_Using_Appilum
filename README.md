# Calculator_App_Automation_Using_Appilum
This Repository contains, automation of a series of calculation in a calculator app by using Appium, Selenium Webdriver and TestNG.

# Tools and Technology 
- Selenium webdriver
- Appium
- Android Studio
- Appium Inspector
- Intellij

# Pre-requisities
- JDK
- Gradle
- Appium

# To Run this Project 
- clone this repositary
- open Appium server by this command ``` appium ```
- connect an android device with USB
- check the device connectivity by the command ``` adb devices ```
- open appium inspector and write the following Json code in desire capabalities section and start the session
```
{
  "platformName": "android",
  "appium:platformVersion": "11",
  "appium:automationName": "UIAutomator2",
  "appium:appPackage": "com.google.android.calculator",
  "appium:appActivity": "com.android.calculator2.Calculator",
  "appium:app": "D:\\apk\\calculator.apk"

}
```
- open the project with build gradle
- open the terminal and write the following command ``` gradle clean test ```

# Reports
![screencapture-192-168-31-108-63637-index-html-2023-11-26-10_16_40](https://github.com/Saud-Bin-Shahid/Calculator_App_Automation_Using_Appilum/assets/134185250/ae4fe7dd-0c73-488a-8914-e5e75e551ac5)
![screencapture-192-168-31-108-63637-index-html-2023-11-26-10_17_16](https://github.com/Saud-Bin-Shahid/Calculator_App_Automation_Using_Appilum/assets/134185250/76d83291-11e1-4f0d-83c1-43b83c892bbf)

# Video Output Link
https://drive.google.com/file/d/1Gm3mEeFToQ_cd6xmv6JxJlXQauQeXWug/view?usp=sharing
