package com.bigeyedata.morttest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

/**
 * Created by yingzhang on 06/05/2017.
 */
public class Hook {

    @Before
    public void setup(){

        WebDriverManager.getDriver().manage().deleteAllCookies();
    }

    @After
    public void teardown(){

        WebDriverManager.getDriver().quit();
        WebDriverManager.deleteWebDriver();
    }
}
