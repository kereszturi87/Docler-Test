package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REQUI07 {
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
  public void testREQUI07() throws Exception {
    driver.get("http://uitest.duodecadits.com/");
    driver.findElement(By.id("site")).click();
    driver.findElement(By.id("error")).click();
    try {
      assertEquals("http://uitest.duodecadits.com/error", driver.getCurrentUrl());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertTrue(driver.findElement(By.cssSelector("h1")).getText().matches("^[\\s\\S]*404[\\s\\S]*$"));
    assertTrue(driver.getTitle().matches("^[\\s\\S]*404[\\s\\S]*$"));
    driver.get("http://uitest.duodecadits.com/");
    driver.findElement(By.id("home")).click();
    driver.findElement(By.id("error")).click();
    try {
      assertEquals("http://uitest.duodecadits.com/error", driver.getCurrentUrl());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertTrue(driver.findElement(By.cssSelector("h1")).getText().matches("^[\\s\\S]*404[\\s\\S]*$"));
    assertTrue(driver.getTitle().matches("^[\\s\\S]*404[\\s\\S]*$"));
    driver.get("http://uitest.duodecadits.com/");
    driver.findElement(By.id("form")).click();
    driver.findElement(By.id("error")).click();
    try {
      assertEquals("http://uitest.duodecadits.com/error", driver.getCurrentUrl());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertTrue(driver.findElement(By.cssSelector("h1")).getText().matches("^[\\s\\S]*404[\\s\\S]*$"));
    assertTrue(driver.getTitle().matches("^[\\s\\S]*404[\\s\\S]*$"));
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
