package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REQUI12 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://uitest.duodecadits.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testREQUI12() throws Exception {
    driver.get("http://uitest.duodecadits.com/form.html");
    driver.findElement(By.id("hello-input")).clear();
    driver.findElement(By.id("hello-input")).sendKeys("John");
    driver.findElement(By.id("hello-submit")).click();
    try {
      assertTrue(driver.getCurrentUrl().matches("^[\\s\\S]*http://uitest\\.duodecadits\\.com/hello\\.html[\\s\\S]myName=[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("Hello John!", driver.findElement(By.id("hello-text")).getText());
    driver.get("http://uitest.duodecadits.com/form.html");
    driver.findElement(By.id("hello-input")).clear();
    driver.findElement(By.id("hello-input")).sendKeys("Sophia");
    driver.findElement(By.id("hello-submit")).click();
    try {
      assertTrue(driver.getCurrentUrl().matches("^[\\s\\S]*http://uitest\\.duodecadits\\.com/hello\\.html[\\s\\S]myName=[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("Hello Sophia!", driver.findElement(By.id("hello-text")).getText());
    driver.get("http://uitest.duodecadits.com/form.html");
    driver.findElement(By.id("hello-input")).clear();
    driver.findElement(By.id("hello-input")).sendKeys("Charlie");
    driver.findElement(By.id("hello-submit")).click();
    try {
      assertTrue(driver.getCurrentUrl().matches("^[\\s\\S]*http://uitest\\.duodecadits\\.com/hello\\.html[\\s\\S]myName=[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("Hello Charlie!", driver.findElement(By.id("hello-text")).getText());
    driver.get("http://uitest.duodecadits.com/form.html");
    driver.findElement(By.id("hello-input")).clear();
    driver.findElement(By.id("hello-input")).sendKeys("Emily");
    driver.findElement(By.id("hello-submit")).click();
    try {
      assertTrue(driver.getCurrentUrl().matches("^[\\s\\S]*http://uitest\\.duodecadits\\.com/hello\\.html[\\s\\S]myName=[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("Hello Emily!", driver.findElement(By.id("hello-text")).getText());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
