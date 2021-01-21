package lesson4avto;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.*;

public class BMICalcTest {
    @Test
    public void calcTest(){
        open("https://healthunify.com/bmicalculator/");
    $(By.name("wg")).sendKeys("85");
    $(By.name("ht")).sendKeys("185");
    $(By.name("cc")).click();
    String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Normal");
    }
    @Test
    public void calcTest1(){
        open("https://healthunify.com/bmicalculator/");
        $(By.name("wg")).sendKeys("200");
        $(By.name("ht")).sendKeys("150");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Obese");
    }
    @Test
    public void calcTest2(){
        open("https://healthunify.com/bmicalculator/");
        $(By.name("wg")).sendKeys("11");
        $(By.name("ht")).sendKeys("150");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Starvation");
    }
    @Test
    public void calcTest3(){
        open("https://healthunify.com/bmicalculator/");
        $(By.name("wg")).sendKeys("80");
        $(By.name("ht")).sendKeys("170");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Overweight");
    }
    @Test
    public void calcTest4(){
        open("https://healthunify.com/bmicalculator/");
        $(By.name("wg")).sendKeys("50");
        $(By.name("ht")).sendKeys("170");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");
        Assert.assertEquals(result, "Your category is Underweight");
    }

}
