package com.cybertek.tests.office_hours4;

import com.cybertek.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTablesPractice extends TestBase {

    @BeforeMethod
    public void setUpTests(){
        driver.get("https://www.mockaroo.com/");
        driver.findElement(By.id("num_rows")).clear();
        driver.findElement(By.id("num_rows")).sendKeys("10");
        driver.findElement(By.id("preview")).click();

    }

    @Test
    public void testHeaderCount(){
        driver.switchTo().frame("preview_iframe");

        WebElement table = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-condensed']"));
        System.out.println(table.getText());
    }

}
