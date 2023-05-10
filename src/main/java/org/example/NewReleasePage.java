package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class NewReleasePage extends Utils {

    public void fillDetailsOnthePage() {


        String expectedResult1 = "News comment is successfully added.";
        //type title
        typeText(By.xpath("//input[contains(@class,'enter-comment-title')]"), "Miss");
        typeText(By.xpath("//textarea[@id=\"AddNewComment_CommentText\"]"),"Good Product");
        clickOnElement(By.xpath("//*[text()='New comment']"));

        String actualResul1=getTextFromElement(By.xpath("//button[text()='New comment']"));
        String actualResult= getTextFromElement(By.xpath("//*[text()='Good Product']"));
        //comparing expected and actual result
        Assert.assertEquals(actualResul1,expectedResult1,"");
        String actualResult1 = getTextFromElement(By.xpath("//div[text()='News comment is successfully added.']"));
        Assert.assertEquals(actualResult1, expectedResult1);
        List<WebElement> productlist = driver.findElements(By.cssSelector("p.comment-text"));
        String lastElementCommnet = productlist.get(productlist.size()-1).getText();
        Assert.assertEquals(lastElementCommnet,expectedResult1);
    }
}
