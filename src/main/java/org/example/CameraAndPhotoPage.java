package org.example;

import org.openqa.selenium.By;

public class CameraAndPhotoPage extends Utils {
    public void clickOnCameraAndPhoto(){
        //click on show product camara and photo
        clickOnElement(By.xpath("(//a[@title='Show products in category Camera & photo'])[1]"));
    }
}
