package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

      //  WebDriver driver = new FirefoxDriver();
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.dbuss.de");
    }
}
