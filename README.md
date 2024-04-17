Appium is an open-source framework that allows QAs to conduct automated
app testing on different platforms like Android, iOS, and Windows.

Similar to Selenium, Appium allows QAs to write test scripts in
different programming languages, which include Java, JavaScript, PHP,
Ruby, Python, and C#.

It automates testing for:

-   Native Mobile Applications that are written using iOS, Android, or
    Windows SDKs

-   Mobile Web Applications that can be accessed using mobile browsers
    such as Safari, Chrome, or in-built native browser applications for
    android devices

-   Hybrid Mobile Applications that have a native wrapper around the web
    view

**APPIUM CONFIGURATION:**

-   Download Java

-   Download Android Studio and find out android SDK path.

-   Download Node

-   Set Home paths (Java, Android SDK & Node) in windows system
    variables.

-   Download Appium Inspector

**PATHS SHOULD ADD UNDER ENVIRONMENT VARIABLES:**

1.  Enter Jdk bin folder path folder path from C:\>Program
    Files\>Java\>jdk-21\>bin

2.  Enter SDK tools bin folder path From
    C:\\Users\>SUMAHALI\>AppData\>Local\>Android\>Sdk\>tools\>bin

3.  Enter platform tools folder path
    C:\\Users\>SUMAHALI\>AppData\>Local\>Android\>Sdk\>platform-tools

4.  Enter Npm Folder path also from
    C:\>Users\>SUMAHALI\>AppData\>Roaming\>npm

5.  Press ok and save it.

**CONFIGURE ANDROID VIRTUAL DEVICE/EMULATOR:**

1.  Navigate to Tools \>\> Device Manager

2.  Click on Create Device

3.  Select Mobile model.

4.  Select Android Version. If android version is not available,
    download that version.

5.  Click on finish.

6.  When you click on play button in action. It will launch the virtual
    device.

7.  Then you can close the android studio. For better performance.

**INSTALL AND START APPIUM SERVER:**

**npm install appium**

Type the above command in cmd to install appium server.

**START THE APPIUM:**

**appium**

Type the above command in cmd to start appium server.

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**SETUP MAVEN PROJECT WITH APPIUM CLIENT DEPENDENCIES:**

1.  Create Maven project (archetype-quickstart)

2.  Add Java Client dependency in pom.xml file

> \<!\-- https://mvnrepository.com/artifact/io.appium/java-client \--\>
>
> \<dependency\>
>
> \<groupId\>io.appium\</groupId\>
>
> \<artifactId\>java-client\</artifactId\>
>
> \<version\>9.2.2\</version\>
>
> \</dependency\>

3.  Add TestNG dependency

> \<!\-- https://mvnrepository.com/artifact/org.testng/testng \--\>
>
> \<dependency\>
>
> \<groupId\>org.testng\</groupId\>
>
> \<artifactId\>testng\</artifactId\>
>
> \<version\>7.9.0\</version\>
>
> \<scope\>test\</scope\>
>
> \</dependency\>

4.  Add TestNG- plugin from eclipse marketplace ( Help \>\> Eclipse
    Marketplace )

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**APPIUM INSPECTOR:**

Appium Inspector is a GUI assistant tool for Appium, providing visual
inspection of the application under test. It can show the application
page screenshot along with its page source, and includes various
features for interacting with the app.

-   Element Identification

-   Automation Script Creation

-   Finding Element Attributes

-   Xpath Expression Generation

-   Cross-Platform Testing

-   Record and Playback

-   Debugging and Troubleshooting

**CONFIGURATION:**

Enter following details:

Host -- 127.0.0.1

Port - 4723

app -
C://Users//SUMAHALI//eclipse-workspace//Appium//src//test//java//Resource//ApiDemos-debug.apk

deviceName -- SundarrajMobile

platformName -- android

automationName -- UIAutomator2

Note:\-- Run the Appium server before start the Appium Inspector
session.

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**UI AUTOMATOR SET UP: (for Android)**

> //Capabilities \-- set the device informations

***UiAutomator2Options options = new UiAutomator2Options();***

// SundarrajMobile \-- device name in Android Studio

***options.setDeviceName(\"SundarrajMobile\");***

// give the path of the APP you want to test

> ***options.setApp(\"C://Users//SUMAHALI//eclipseworkspace//Appium//src//test//java//Resource//ApiDemos-debug.apk\");***

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**ANDROID DRIVER:**

> // Appium driver setup

//\"http://192.168.1.101:4723\" \-- Appium Server Url

***AndroidDriver driver = new AndroidDriver(new
URI(\"http://192.168.1.101:4723\").toURL(),options );***

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**CLOSE THE APP:**

***driver.quite();***

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**START AND STOP THE APPIUM SERVER:**

> // set up to start the Appium Server Programmatically
>
> ***AppiumDriverLocalService service = new AppiumServiceBuilder()***
>
> ***.withAppiumJS(new File
> (\"C://Users//SUMAHALI//AppData//Roaming//npm//node_modules//appium//build//lib//main.js\"))***
>
> ***.withIPAddress(\"192.168.1.101\")***
>
> ***.usingPort(4723).build();***
>
> //start the server
>
> ***service.start();***

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**LOCATORS:**

-   ID

-   Accessibility ID

-   Class Name

-   XPath

-   Android UI Automator

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**FINDELEMENT:**

// this is used for ID, Classname and XPath locators

***driver.findElement(By.className("Preference")).click();***

// this is used for accessibilityId and androidUiAutomator locators

***driver.findElement(AppiumBy. accessibilityId
("Preference")).click();***

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**XPATH:**

//tagname\[@attribute='value'\] \-- use this format if locator have
attribute and value

***Eg:-//android.widget.TextView\[@content-desc=\'3. Preference
dependencies\'\]***

//tagname \-- use this format if locator don't have attribute and value

***Eg:- //android.widget.RelativeLayout***

(//tagname)\[index\] \-- use this format if more than one tag present at
seme name

***Eg:- (//android.widget.RelativeLayout)\[2\]***

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**BASE CLASS CONFIGURATIONS (Before and After Class):**

public class **AppiumConfiguration** {

public AndroidDriver driver;

public AppiumDriverLocalService service;

***\@BeforeClass***

public void **appiumSetUp()** throws MalformedURLException,
URISyntaxException {

// set up to start the Appium Server Programmatically

> service = new AppiumServiceBuilder().withAppiumJS(new File
> (\"C://Users//SUMAHALI//AppData//Roaming//npm//node_modules//appium//build//lib//main.js\"))

.withIPAddress(\"127.0.0.1\").usingPort(4723).build();

//start the server

service.start();

//Capabilities \-- set the device informations

UiAutomator2Options options = new UiAutomator2Options();

// SundarrajMobile \-- device name in Android Studio

options.setDeviceName(\"SundarrajMobile\");

// give the path of the APP you want to test

> options.setApp(\"C://Users//SUMAHALI//eclipse
> workspace//Appium//src//test//java//Resource//ApiDemos-debug.apk\");

// Appium driver setup

//\"http://192.168.1.101:4723\" \-- Appium Server Url

driver = new AndroidDriver(new
URI(\"http://127.0.0.1:4723\").toURL(),options );

}

***\@AfterClass***

public void **tearDown()** {

driver.quit();

service.stop();

}

}

\>\>\>\>\>\>\>\> Test Class \<\<\<\<\<\<\<\<

public class Basics extends AppiumConfiguration {

\@Test

public void wifiSettings() throws URISyntaxException,
MalformedURLException {

// By (used in selenium) \-- ID, Classname and XPath locators

// AppiumBy \-- for accessibilityId and androidUiAutomator locators

driver.findElement(AppiumBy.accessibilityId(\"Preference\")).click();

}

}

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**WAIT:**

**Implicit Wait:**

***driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));***

or

***driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);***

**Explicit Wait:**

***WebDriverWait wait = new WebDriverWait(driver, 20);***

***WebElement Login_Icon = driver.findElement(By.Name(\"login\"));***

***wait.until(ExpectedConditions.elementToBeClickable(Login_Icon));***

Login_Icon.click();

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**GET TEXT:**

String popupText =
driver.findElement(By.id(\"android:id/alertTitle\")).***getText();***

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**ASSERTION:**

**Hard Assertion:**

***Assert.assertEquals(popupText, expectedText);***

***Assert.assertTrue(5\>3);***

**Soft Assertion:**

***Assertion softAssert = new SoftAssert();***

***softAssert.assertEquals(Expected, Actual);***

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**MOBILE GESTURES:**

**Long Press:**

> ((JavascriptExecutor) driver).executeScript(***\"mobile:
> longClickGesture\",*** ImmutableMap.of( \"elementId\",
> ((RemoteWebElement) element).getId()));
>
> Eg:-
>
> WebElement longPress =
> driver.findElement(By.xpath(\"//android.widget.TextView\[@text=\'People
> Names\'\]\"));
>
> //long press
>
> ***((JavascriptExecutor)driver).executeScript(\"mobile:
> longClickGesture\",
> ImmutableMap.of(\"elementId\",((RemoteWebElement)longPress).getId(),\"duration\",
> 2000));***

**Double Click:**

> ((JavascriptExecutor) driver).executeScript(***\"mobile:
> doubleClickGesture\",*** ImmutableMap.of(\"elementId\",
> ((RemoteWebElement) element).getId()));

**Click Gesture:**

> driver.executeScript(***\"mobile: clickGesture\",***
> ImmutableMap.of(\"elementId\", ((RemoteWebElement) element).getId()));

**Drag Gesture:**

> ((JavascriptExecutor) driver).executeScript(***\"mobile:
> dragGesture\",*** ImmutableMap.of(\"elementId\", ((RemoteWebElement)
> element).getId(),
>
> \"endX\", 100,

\"endY\", 100

));

Eg:\--

//drag and drop

***((JavascriptExecutor)driver).executeScript(\"mobile:
dragGesture\",***

***ImmutableMap.of(\"elementId\", ((RemoteWebElement)drag). getId(),***

***\"endX\", 621,***

***\"endY\", 545***

***));***

**Swipe Gesture:**

((JavascriptExecutor) driver).executeScript(***\"mobile:
swipeGesture\",*** ImmutableMap.of(

\"left\", 100, \"top\", 100, \"width\", 200, \"height\", 200,

\"direction\", \"left\",

\"percent\", 0.75

));

Or

//swipe

//direction:left \-- which direction you want to swipe

***((JavascriptExecutor) driver).executeScript(\"mobile:
swipeGesture\",***

***ImmutableMap.of(\"elementId\", ((RemoteWebElement)image).getId(),***

***\"direction\", \"left\",***

***\"percent\", 0.75***

***));***

**Scroll Gesture:**

> boolean canScrollMore = (Boolean) ((JavascriptExecutor)
> driver).executeScript(***\"mobile: scrollGesture\",***
> ImmutableMap.of( \"left\", 100, \"top\", 100, \"width\", 200,
> \"height\", 200,

\"direction\", \"down\",

\"percent\", 3.0

));

or

// new UiScrollable \-- create object for the class UiScrollable

// new UiSelector() \-- call the selector

// scrollIntoView() \-- method of UiScrollable class

// text(\\\"WebView\\\")\-- the text i want to locate

***driver.findElement(AppiumBy.androidUIAutomator***

***(\"new UiScrollable(new
UiSelector()).scrollIntoView(text(\\\"WebView\\\"));\"));***

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**ORIENTATION:**

//rotate the device to landscape (90 degree)

***DeviceRotation landscape = new DeviceRotation(0,0,90);***

***driver.rotate(landscape);***

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**CLIPBOARD:**

//text copied in clipboard

***driver.setClipboardText(\"Sundarraj\'s Wifi\");***

//paste the text copied in clipboard as sendkeys text

driver.findElement(By.xpath(\"//android.widget.EditText\[@resource-id=\\\"android:id/edit\\\"\]\"))

.sendKeys(***driver.getClipboardText()***);

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**MOBILE KEY EVENTS:**

//press back button in mobile

***driver.pressKey(new KeyEvent(AndroidKey.BACK));***

//press home button in mobile

***driver.pressKey(new KeyEvent(AndroidKey.HOME));***

//press enter button in keyboard

***driver.pressKey(new KeyEvent(AndroidKey.ENTER));***

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**APP PACKAGE AND ACTIVITY:**

To know the app package and activity:

1.  Open the page you want to directly navigate in AVD

2.  Verify device is connected or not using **adb devices**

3.  Run **adb shell** command

4.  Run **dumpsys window displays \| grep -E "mCurrentFocus"** to know
    the package and activity

5.  Package -- before /

> Activity -- after /
>
> io.appium.android.apis/io.appium.android.apis.preference.FragmentPreferences

//intent \-- package + activity

//io.appium.android.apis/io.appium.android.apis.preference.DefaultValues
\-- package/activity

((JavascriptExecutor)driver).executeScript(***\"mobile:
startActivity\",***

ImmutableMap.of***(\"intent\",
\"io.appium.android.apis/io.appium.android.apis.preference.DefaultValues\"));***

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**INSTALL APPS ON AVD:**

1.  AVD should be opened.

2.  **adb install (apk location)** enter this command in cmd

**adb install
C:\\Users\\SUMAHALI\\Downloads\\Appium\\resources\\General-Store.apk**

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**HIDE KEYBOARD:**

***driver.hideKeyboard();***

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**TOAST MESSAGES:**

//get text for toast popup

String toastMessage =
driver.findElement(By.xpath(\"(//android.widget.Toast)\[1\]\")).getText();

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**\>\>\>\>\>\>\>\>\>\>\>\>\>\>\>\>\>\>\>\>\> Error Handling
\<\<\<\<\<\<\<\<\<\<\<\<\<\<\<\<\<\<\<\<**

org.openqa.selenium.WebDriverException: An unknown server-side error
occurred while processing the command.

Original error: Could not proxy command to remote server. Original
error: Error: socket hang up (WARNING: The server did not provide any
stacktrace information)

**Resolution:**

1.  Run **adb uninstall io.appium.uiautomator2.server.test** this
    command in cmd.

2.  Restart the appium server.

**\>\>\>\>\>\>\>\>\>\>\>\>\>\>\>\>\>\>\>\>\>\>\>\>\<\<\<\<\<\<\<\<\<\<\<\<\<\<\<\<\<\<\<\<\<\<\<**

**CONTEXT HANDLES:**

//Get the contexts

Set\<String\> context = driver.getContextHandles();

for(String contexts:context) {

System.out.println(contexts);

}

//Navigate to the handles

Iterator\<String\> it = context.iterator();

String nativeApp = it.next();

String webApp = it.next();

//Switch to context

driver.context(webApp);

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**CHROME DRIVER SETUP: (Used to launch the browser inside the native
app)**

1.  Download chrome webdriver

2.  Copy the path of chrome driver. And set up this under
    UiAutomator2Options in base class.

//chrome driver set up

> ***options.setChromedriverExecutable(\"C://Users//SUMAHALI//eclipse-workspace//Appium//src//test//java//Resource//chromedriver.exe\");***

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**MOBILE CHROME BROWSER SET UP:**

-   All configurations are same as native android app.

-   Use **options.setCapabilities()** instead of **options.setApp()**
    under UiAutomator2

// set up to start the Appium Server Programmatically

> service = new AppiumServiceBuilder().withAppiumJS(new File
> (\"C://Users//SUMAHALI//AppData//Roaming//npm//node_modules//appium//build//lib//main.js\"))

.withIPAddress(\"127.0.0.1\").usingPort(4723).build();

//start the server

service.start();

//Capabilities \-- set the device informations

UiAutomator2Options options = new UiAutomator2Options();

// SundarrajMobile \-- device name in Android Studio

options.setDeviceName(\"SundarrajMobile\");

//chrome driver set up

> ***options.setChromedriverExecutable(\"C://Users//SUMAHALI//eclipse-workspace//Appium//src//test//java//Resource//chromedriver.exe\");***

//set up to use chrome browser in mobile

***options.setCapability(\"browserName\", \"Chrome\");***

// Appium driver setup

//\"http://192.168.1.101:4723\" \-- Appium Server Url

driver = new AndroidDriver(new
URI(\"http://127.0.0.1:4723\").toURL(),options );

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**TESTING ON REAL ANDROID DEVICE:**

1.  Use this instead of emulators name.

***options.setDeviceName("Android Device");***

2.  Turn on USB debugging under developer option in mobile.

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**PAGE OBJECT MODEL:**

public class **FormPageObject** {

AndroidDriver driver;

public FormPageObject(AndroidDriver driver) {

this.driver=driver;

***PageFactory.initElements(new AppiumFieldDecorator(driver), this);***

}

***\@AndroidFindBy(id=\"com.androidsample.generalstore:id/spinnerCountry\")***

***private WebElement countryDropDown;***

> \@AndroidFindBy(xpath=\"//android.widget.EditText\[@resourceid=\\\"com.androidsample.generalstore:id/
> nameFie ld\\\"\]\")

private WebElement nameField;

\@AndroidFindBy(id=\"com.androidsample.generalstore:id/radioMale\")

private WebElement gender;

\@AndroidFindBy(id=\"com.androidsample.generalstore:id/btnLetsShop\")

private WebElement shopNowButton;

***public void countrySetUp(String country) {***

***countryDropDown.click();***

***driver.findElement(AppiumBy.androidUIAutomator***

***(\"new UiScrollable(new
UiSelector()).scrollIntoView(text(\\\"\"+country+\"\\\"));\")).click();***

***}***

public void setName(String name) {

nameField.sendKeys(name);

}

public void setGender() {

if(!gender.isSelected()) {

gender.click();

}

}

public void shopNow() {

shopNowButton.click();

}

}

public class **Form extends Configurations**{

\@Test

public void **formPage**() {

***FormPageObject fpo = new FormPageObject(driver);***

***fpo.countrySetUp(\"India\");***

***fpo.setName(\"Sundarraj\");***

***fpo.setGender();***

***fpo.shopNow();***

}

}

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**RUN ALL TESTS TOGETHER (TestNG.xml):**

1.  Right click on project.

2.  TestNG \>\> Convert to TestNG.

3.  Open and edit TestNG.xml file is created.

> \<?xml version=\"1.0\" encoding=\"UTF-8\"?\>
>
> \<!DOCTYPE suite SYSTEM \"https://testng.org/testng-1.0.dtd\"\>
>
> \<suite name=\"Suite\"\>
>
> \<test thread-count=\"5\" **name=\"Login Form\"\>**
>
> \<classes\>
>
> **\<class name=\"com.appiumtesting.Form\" /\>**
>
> \</classes\>
>
> \</test\>
>
> \<test thread-count=\"5\" **name=\"Add to Cart\"\>**
>
> \<classes\>
>
> **\<class name=\"com.appiumtesting.AddToCart\" /\>**
>
> \</classes\>
>
> \</test\>
>
> \<test thread-count=\"5\" **name=\"Validation\"\>**
>
> \<classes\>
>
> **\<class name=\"com.appiumtesting.ValidatePrice\" /\>**
>
> \</classes\>
>
> \</test\>
>
> \</suite\>

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**DATA PROVIDER:**

> ***\@DataProvider***
>
> public Object\[\]\[\] getData() {
>
> return new Object\[\]\[\] {
>
> ***{\"India\", \"Sundar\"}***
>
> };
>
> }
>
> Eg:\--
>
> public class DataProviderDemo extends Configurations{
>
> ***\@Test(dataProvider=\"getData\")***
>
> public void formPageUsingDataProvider(String country, String name) {
>
> FormPageObject fpo = new FormPageObject(driver);
>
> fpo.countrySetUp(country);
>
> fpo.setName(name);
>
> fpo.setGender();
>
> fpo.shopNow();
>
> }
>
> ***\@DataProvider***
>
> public Object\[\]\[\] getData() {
>
> return new Object\[\]\[\] {
>
> ***{\"India\", \"Sundar\"}***
>
> };
>
> }
>
> }

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**READ DATA FROM JSON FILE:**

1.  Add common.io and Jackson databind dependencies in pom.xml

> \<!\-- https://mvnrepository.com/artifact/commons-io/commons-io \--\>
>
> \<dependency\>
>
> \<groupId\>commons-io\</groupId\>
>
> \<artifactId\>commons-io\</artifactId\>
>
> \<version\>2.16.1\</version\>
>
> \</dependency\>
>
> \<!\--
> https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind
> \--\>
>
> \<dependency\>
>
> \<groupId\>com.fasterxml.jackson.core\</groupId\>
>
> \<artifactId\>jackson-databind\</artifactId\>
>
> \<version\>2.17.0\</version\>
>
> \</dependency\>
>
> Common.io \-\-- convert json file to json string
>
> Jackson Databind \-\-- convert json string to HashMap

\[

{ \"name\":\"Sundarraj\",

\"country\":\"Benin\"

},

{ \"name\":\"Karthik\",

\"country\":\"India\"

}

\]

public class AppiumUtils {

public List\<HashMap\<String, String\>\> getJsonData(String
jsonFilePath) throws IOException{

***String jsonContent = FileUtils.readFileToString(new
File(jsonFilePath),StandardCharsets.UTF_8);***

***ObjectMapper mapper = new ObjectMapper();***

***List\<HashMap\<String, String\>\> data = mapper***

***.readValue(jsonContent, new TypeReference\<List\<HashMap\<String,
String\>\>\>(){***

***});***

return data;

}

}

public class DataFromJson extends Configurations{

AndroidDriver driver;

***\@Test(dataProvider=\"getData\")***

public void formPageUsingDataProvider(***HashMap\<String,String\>
input***) {

FormPageObject fpo = new FormPageObject(driver);

fpo.countrySetUp(***input.get(\"country\"***));

fpo.setName(***input.get(\"name\")***);

fpo.setGender();

fpo.shopNow();

driver.pressKey(new KeyEvent(AndroidKey.BACK));

}

***\@DataProvider***

public Object\[\]\[\] getData() throws IOException {

***List\<HashMap\<String, String\>\> data =
getJsonData(\"C://Users//SUMAHALI//eclipse-workspace//AppiumFramework//src//main//java//Resources//datafromjson.json\");***

***return new Object\[\]\[\] { {data.get(0)},{data.get(1)} };***

}

}

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**GLOBAL PROPERTIES AND BASE CLASS OPTIMISATION:**

**Properties file:\--**

> **ipAddress = 127.0.0.1**
>
> **port =4723**
>
> **browser = chrome**
>
> **AndroidDeviceName = SundarrajMobile**

**AppiumUtils Class:\--**

public class AppiumUtils {

public AppiumDriverLocalService service;

public AppiumDriverLocalService startAppiumServer(String
***ipAddress***, int ***port***) {

//get ipAddress and port as a parameter from configuration class

> service = new AppiumServiceBuilder().withAppiumJS(new
> File(\"C://Users//SUMAHALI//AppData//Roaming//npm//node_modules//appium//build//lib//main.js\"))

.withIPAddress(***ipAddress***).usingPort(***port***).build();

service.start();

return service;

}

public List\<HashMap\<String, String\>\> getJsonData(String
jsonFilePath) throws IOException{

String jsonContent = FileUtils.readFileToString(new
File(jsonFilePath),StandardCharsets.UTF_8);

ObjectMapper mapper = new ObjectMapper();

List\<HashMap\<String, String\>\> data = mapper

.readValue(jsonContent, new TypeReference\<List\<HashMap\<String,
String\>\>\>(){

});

return data;

}

}

**Configurations Class:\--**

> public class Configurations extends AppiumUtils {
>
> public AndroidDriver driver;
>
> public AppiumDriverLocalService service;
>
> \@BeforeClass
>
> public void appiumSetUp() throws URISyntaxException, IOException {
>
> //give the path of properties file
>
> ***FileInputStream fis = new
> FileInputStream(\"C://Users//SUMAHALI//eclipse-workspace//AppiumFramework//src//main//java//com//appiumtesting//resources//data.properties\");***
>
> //create object for properties class to use the global properties we
> created
>
> ***Properties prop = new Properties();***
>
> //pass the object of file input stream
>
> ***prop.load(fis);***
>
> //prop.getProperty(\"ipAddress\") \-- get ipAddress from global
> properties file
>
> ***String ipAddress = prop.getProperty(\"ipAddress\");***
>
> //prop.getProperty(\"port\") \-- get port from global properties file
>
> ***String port = prop.getProperty(\"port\");***
>
> //call the startAppiumServer method from AppiumUtils class and pass
> the ipAddress and port as a parameter
>
> //Integer.parseInt(port) \-- convert string into integer
>
> ***service=startAppiumServer(ipAddress, Integer.parseInt(port));***
>
> //Capabilities \-- set the device informations
>
> UiAutomator2Options options = new UiAutomator2Options();
>
> // prop.getProperty(\"AndroidDeviceName\") \-- get device name from
> properties file
>
> options.setDeviceName(prop.getProperty(\"AndroidDeviceName\"));
>
> // give the path of the APP you want to test
>
> options.setApp(\"C://Users//SUMAHALI//eclipse-workspace//Appium//src//test//java//Resource//General-Store.apk\");
>
> //chrome driver set up
>
> options.setChromedriverExecutable(\"C://Users//SUMAHALI//eclipse-workspace//Appium//src//test//java//Resource//chromedriver.exe\");
>
> options.setCapability(\"ADB_EXEC_TIMEOUT_OPTION\", 60000);
>
> // Appium driver setup
>
> //\"http://192.168.1.101:4723\" \-- Appium Server Url
>
> driver = new AndroidDriver(service.getUrl(),options );
>
> driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
>
> }
>
> \@AfterClass
>
> public void tearDown() throws InterruptedException {
>
> //closs the app
>
> driver.quit();
>
> // stop the appium server
>
> service.stop();
>
> }
>
> }

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**EXTEND REPORTS:**

1.  Add extent reports dependency

2.  Create separate class for extent reports

3.  Create listener class

4.  Add listener in testNG.xml file

5.  Run the testNG.xml file

> \<!\-- https://mvnrepository.com/artifact/com.aventstack/extentreports
> \--\>
>
> \<dependency\>
>
> \<groupId\>com.aventstack\</groupId\>
>
> \<artifactId\>extentreports\</artifactId\>
>
> \<version\>5.1.1\</version\>
>
> \</dependency\>

**Extent reports class:\--**

> public class ExtentReporter {
>
> static ExtentReports extent;
>
> public static ExtentReports getExtentReport() {
>
> //path of extent report to generate
>
> ***String path =
> \"C://Users//SUMAHALI//eclipse-workspace//AppiumFramework//Reports//index.html\";***
>
> //ExtentSparkReporter \-- helping class to generate extent report
>
> ***ExtentSparkReporter reporter = new ExtentSparkReporter(path);***
>
> //set repoet name
>
> ***reporter.config().setReportName(\"Appium Automation Report\");***
>
> //set title name
>
> ***reporter.config().setDocumentTitle(\"Test Report\");***
>
> //object of extent report
>
> ***extent = new ExtentReports();***
>
> ***extent.attachReporter(reporter);***
>
> //set tester info
>
> ***extent.setSystemInfo(\"Tester\", \"Sundarraj\");***
>
> return extent;
>
> }
>
> }

**Listener class:\--**

> public class **Listeners** implements **ITestListener**{
>
> //call the getExtentReport() from ExtentReporter class
>
> ***ExtentReports extent = ExtentReporter.getExtentReport();***
>
> ***ExtentTest test;***
>
> //before start the test
>
> public void **onTestStart**(ITestResult result) {
>
> //create the test report
>
> //result.getMethod().getMethodName() \-- test name is same as method
> name
>
> ***test = extent.createTest(result.getMethod().getMethodName());***
>
> }
>
> //if test passes
>
> public void **onTestSuccess**(ITestResult result) {
>
> //log with status:Test Passed
>
> ***test.log(Status.PASS, \"Test Passed\");***
>
> }
>
> //if test failed
>
> public void **onTestFailure**(ITestResult result) {
>
> //log the reason for test fail
>
> ***test.fail(result.getThrowable());***
>
> }
>
> public void **onFinish**(ITestContext context) {
>
> //erase any previous data on the report and create a new report
>
> ***extent.flush();***
>
> }
>
> }

**testng.xml:\--**

> \<?xml version=\"1.0\" encoding=\"UTF-8\"?\>
>
> \<!DOCTYPE suite SYSTEM \"https://testng.org/testng-1.0.dtd\"\>
>
> \<suite name=\"Suite\"\>
>
> ***\<listeners\>***
>
> ***\<listener class-name=\"com.appiumtesting.baseclass.Listeners\"
> /\>***
>
> ***\</listeners\>***
>
> \<test thread-count=\"5\" name=\"Login Form\"\>
>
> \<classes\>
>
> \<class name=\"com.appiumtesting.Form\" /\>
>
> \</classes\>
>
> \</test\>
>
> \<test thread-count=\"5\" name=\"Add to Cart\"\>
>
> \<classes\>
>
> \<class name=\"com.appiumtesting.AddToCart\" /\>
>
> \</classes\>
>
> \</test\>
>
> \<test thread-count=\"5\" name=\"Validation\"\>
>
> \<classes\>
>
> \<class name=\"com.appiumtesting.ValidatePrice\" /\>
>
> \</classes\>
>
> \</test\>
>

**­­­­­­­­­­­­­­­­­­­­\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**SCREENSHOT:**

1.  Add screenshot method in AppiumUtils class.

2.  Call the created method in Listeners class under onTestFailure
    method.

> //pass test name and driver as a argument
>
> public String **getScreenshot**(String testCaseName, AndroidDriver
> driver) throws IOException {
>
> ***File src = driver.getScreenshotAs(OutputType.FILE);***
>
> ***String destination = \"C://Users//SUMAHALI//eclipse-
> workspace//AppiumFramework//Screenshots//\"+ testCaseName +
> \".png\";***
>
> ***FileUtils.copyFile(src, new File(destination));***
>
> return destination;
>
> }
>
> \@Override
>
> public void **onTestFailure**(ITestResult result) {
>
> //log the reason for test fail
>
> test.fail(result.getThrowable());
>
> try {
>
> ***driver = (AndroidDriver)
> result.getTestClass().getRealClass().getField(\"driver\")***
>
> ***.get(result.getInstance());***
>
> } catch (Exception e1) {
>
> e1.printStackTrace();
>
> }
>
> try {
>
> //call the screenshot method
>
> //getScreenshot(result.getMethod().getMethodName() \-- test case name
>
> ***test.addScreenCaptureFromPath(getScreenshot(result.getMethod().getMethodName(),
> driver), result.getMethod().getMethodName());***
>
> } catch (IOException e) {
>
> e.printStackTrace();
>
> }
>
> }

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**GROUPING OF TESTS (Run selected test only):**

1.  Add group tag in testNg annotation.

2.  Include \<groups\> tag in testing.xml file.

3.  Make before and after class annotations in configuration class to
    (alwaysRun = true).

public class Form extends Configurations{

***\@Test(groups= {\"Smoke\"})***

public void formPage() {

FormPageObject fpo = new FormPageObject(driver);

fpo.countrySetUp(\"India\");

fpo.setName(\"Sundarraj\");

fpo.setGender();

fpo.shopNow();

}

}

> **\<groups\>**
>
> **\<run\>**
>
> **\<include name=\"Smoke\"\>\</include\>**
>
> **\</run\>**
>
> **\</groups\>**

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**RUN TEST IN CLI:**

1.  Configure the pom.xml, Add profiles in it.

2.  Give the suite name correctly
    \<suiteXmlFile\>testng.xml\</suiteXmlFile\>

3.  Download and install maven

4.  Add maven environmental variables

> MAVEN_HOME \-- \> C:\\Users\\SUMAHALI\\apache-maven-3.9.6
>
> Path \-- \> C:\\Users\\SUMAHALI\\apache-maven-3.9.6\\bin

5.  Navigate to project location and open cmd.

6.  Run the following command.

**mvn test -PSmoke** -P denotes profile

-   Smoke -- profile name

7.  If facing any error while running

    a.  Update the project

    b.  Right click on project name and run as Maven Install

    c.  Right click on project name and run as Maven Test

    d.  Then run the test in cmd

**\<profiles\>**

**\<profile\>**

**\<id\>Regression\</id\>**

\<build\>

\<pluginManagement\>

\<plugins\>

\<plugin\>

\<groupId\>org.apache.maven.plugins\</groupId\>

\<artifactId\>maven-surefire-plugin\</artifactId\>

\<version\>3.2.5\</version\>

\<configuration\>

\<suiteXmlFiles\>

**\<suiteXmlFile\>testng.xml\</suiteXmlFile\>**

\</suiteXmlFiles\>

\</configuration\>

\</plugin\>

\</plugins\>

\</pluginManagement\>

\</build\>

**\</profile\>**

**\<profile\>**

**\<id\>Smoke\</id\>**

\<build\>

\<pluginManagement\>

\<plugins\>

\<plugin\>

\<groupId\>org.apache.maven.plugins\</groupId\>

\<artifactId\>maven-surefire-plugin\</artifactId\>

\<version\>3.2.5\</version\>

\<configuration\>

\<suiteXmlFiles\>

\<suiteXmlFile\>testngSmoke.xml\</suiteXmlFile\>

\</suiteXmlFiles\>

\</configuration\>

\</plugin\>

\</plugins\>

\</pluginManagement\>

\</build\>

**\</profile\>**

**\</profiles\>**

**Give the parameters while running:**

**mvn test -PSmoke -DipAddress=127.0.0.1** -D denotes parameter

ipAddress=127.0.0.1 \-- parameter

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**INTEGRATION WITH JENKINS:**

1.  Create one job in Jenkins

2.  Select "**Use custom workspace**" in advance section under General.

3.  Give the path of the project.

4.  Select "**Invoke top-level Maven targets**" under Build Steps.

5.  Type "**test -PSmoke**" and save.

6.  Click on BuildNow to run the test.

**Parameterization:**

1.  Select "**This project is parameterized**" option.

2.  Add "**choice parameter**".

3.  Give Name and Choices Name -- profile, Choices -- Smoke, Regression

4.  Replace the hard coded test -PSmoke into variable test
    **-P\"\$Profile\".**

5.  Click on save. Now you can see Build Button is changed into Build
    with parameter.


\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-

**GITHUB PROJECT:**

Appium Basics: <https://github.com/Sundarraj9641/Appium>

Appium Framework: <https://github.com/Sundarraj9641/Appium-Framework>

\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-
