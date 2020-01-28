$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:res/features/HomePage.feature");
formatter.feature({
  "name": "User is in homepage after login to the account",
  "description": "  Automation test scripts for homepage functionality",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Homepage"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verify user to land in homepage after login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@HomepageScreen"
    }
  ]
});
formatter.step({
  "name": "user is launched Govt Health Application",
  "keyword": "Given "
});
formatter.step({
  "name": "user landed on login page of the application",
  "keyword": "When "
});
formatter.step({
  "name": "user enters username as \u003cusername\u003e and password as \u003cpassword\u003e in the respecetive fields",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on login button in the login page",
  "keyword": "And "
});
formatter.step({
  "name": "user should land on home page of the application",
  "keyword": "Then "
});
formatter.step({
  "name": "user search for the location by entering zipcode \u003czipcode\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user selects the zip code from the dropdown",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on continue button on the home page",
  "keyword": "And "
});
formatter.step({
  "name": "user logged out from the application",
  "keyword": "And "
});
formatter.step({
  "name": "user close the application",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "zipcode"
      ]
    },
    {
      "cells": [
        "jayab.parella@gmail.com",
        "Jaya12345",
        "72712"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify user to land in homepage after login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Homepage"
    },
    {
      "name": "@HomepageScreen"
    }
  ]
});
formatter.step({
  "name": "user is launched Govt Health Application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_launched_Govt_Health_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user landed on login page of the application",
  "keyword": "When "
});
formatter.match({
  "location": "LandingPageSteps.user_landed_on_login_page_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as jayab.parella@gmail.com and password as Jaya12345 in the respecetive fields",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_enters_username_as_name_and_password_as_in_the_respecetive_fields(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button in the login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_click_on_login_button_in_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should land on home page of the application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_should_land_on_home_page_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for the location by entering zipcode 72712",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_search_for_the_location_by_entering_zipcode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the zip code from the dropdown",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_selects_the_zip_code_from_the_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on continue button on the home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_click_on_continue_button_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logged out from the application",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageSteps.user_logged_out_from_the_application()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@id \u003d\u0027logout\u0027]\"}\n  (Session info: chrome\u003d79.0.3945.117)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027HARIGEETH\u0027, ip: \u0027192.168.43.249\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.117, chrome: {chromedriverVersion: 78.0.3904.105 (60e2d8774a81..., userDataDir: C:\\Users\\JAYAP~1\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:58806}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 1cd4e3c49ea961107de6ebf8952937c2\n*** Element info: {Using\u003dxpath, value\u003d//a[@id \u003d\u0027logout\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:50)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)\r\n\tat java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:499)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:484)\r\n\tat com.jaya.bdd.pages.LandingPage.loggedOut(LandingPage.java:49)\r\n\tat com.jaya.bdd.steps.LandingPageSteps.user_logged_out_from_the_application(LandingPageSteps.java:25)\r\n\tat ✽.user logged out from the application(file:res/features/HomePage.feature:16)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user close the application",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_close_the_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:res/features/Login.feature");
formatter.feature({
  "name": "Govt Health App Login Functionality",
  "description": "  Writing the automation cases for login functionality",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verify Govt Heath App login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginWithPosivtiveFlow"
    }
  ]
});
formatter.step({
  "name": "user is launched Govt Health Application",
  "keyword": "Given "
});
formatter.step({
  "name": "user landed on login page of the application",
  "keyword": "When "
});
formatter.step({
  "name": "user enters username as \u003cusername\u003e and password as \u003cpassword\u003e in the respecetive fields",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on login button in the login page",
  "keyword": "And "
});
formatter.step({
  "name": "user should land on home page of the application",
  "keyword": "Then "
});
formatter.step({
  "name": "user search for the location by entering zipcode \u003czipcode\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "user selects the zip code from the dropdown",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on continue button on the home page",
  "keyword": "And "
});
formatter.step({
  "name": "verify that the user has landed on information page",
  "keyword": "Then "
});
formatter.step({
  "name": "verify the UI components of the page",
  "keyword": "And "
});
formatter.step({
  "name": "user logged out from the application",
  "keyword": "And "
});
formatter.step({
  "name": "user close the application",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "zipcode"
      ]
    },
    {
      "cells": [
        "jayab.parella@gmail.com",
        "Jaya12345",
        "72712"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify Govt Heath App login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@LoginWithPosivtiveFlow"
    }
  ]
});
formatter.step({
  "name": "user is launched Govt Health Application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_launched_Govt_Health_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user landed on login page of the application",
  "keyword": "When "
});
formatter.match({
  "location": "LandingPageSteps.user_landed_on_login_page_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as jayab.parella@gmail.com and password as Jaya12345 in the respecetive fields",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_enters_username_as_name_and_password_as_in_the_respecetive_fields(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button in the login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_click_on_login_button_in_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should land on home page of the application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_should_land_on_home_page_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for the location by entering zipcode 72712",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_search_for_the_location_by_entering_zipcode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the zip code from the dropdown",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_selects_the_zip_code_from_the_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on continue button on the home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_click_on_continue_button_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that the user has landed on information page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verify_that_the_user_has_landed_on_information_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the UI components of the page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.verify_the_UI_components_of_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logged out from the application",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageSteps.user_logged_out_from_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user close the application",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_close_the_application()"
});
formatter.result({
  "status": "passed"
});
});11-14T08:17:03\u0027\nSystem info: host: \u0027HARIGEETH\u0027, ip: \u0027192.168.43.249\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.117, chrome: {chromedriverVersion: 78.0.3904.105 (60e2d8774a81..., userDataDir: C:\\Users\\JAYAP~1\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:58699}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 59a7ebb87ef22bd92454d65771b4910b\n*** Element info: {Using\u003dxpath, value\u003d//a[@id \u003d\u0027logout\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:50)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)\r\n\tat java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:499)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:484)\r\n\tat com.jaya.bdd.pages.LandingPage.loggedOut(LandingPage.java:49)\r\n\tat com.jaya.bdd.steps.LandingPageSteps.user_logged_out_from_the_application(LandingPageSteps.java:25)\r\n\tat ✽.user logged out from the application(file:res/features/Login.feature:18)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user close the application",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_close_the_application()"
});
formatter.result({
  "status": "skipped"
});
});