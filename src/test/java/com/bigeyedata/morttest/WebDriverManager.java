package com.bigeyedata.morttest;

import com.bigeyedata.morttest.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by yingzhang on 06/05/2017.
 */
public class WebDriverManager {

    private static WebDriver webDriver;

    public static WebDriver getDriver(){

        if(webDriver==null){

            WebDriver webDriver = new ChromeDriver();
            webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        return webDriver;
    }

    public static void deleteWebDriver(){

        if (webDriver != null){

            webDriver = null;
        }
    }

}
