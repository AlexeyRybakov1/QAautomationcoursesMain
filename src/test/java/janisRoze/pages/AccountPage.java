package janisRoze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AccountPage {
    WebDriver driver;
    String accountBlockXpath = "//div[@class='block block-account']";
    String editProfileInfoLinkXpath = "//a[contains(text(), 'Mainit profila iestatijumus')]";
    String firstnameInputFieldId = "firstname";
    String lastnameInputFieldId = "lastname";
    String phoneInputFieldId = "phone_number";
    String currentPswFieldId = "current_password";
    String saveButtonXpath = "//button[@class='button update-info-submit']";
    String successMsgXpath = "//li[@class='success-msg']";


    public AccountPage(WebDriver driver){

        this.driver = driver;
    }

    public void openEditAccountInfoForm(){
        WebElement editProfileInfoLink = driver.findElement(By.xpath(editProfileInfoLinkXpath));
        editProfileInfoLink.click();
    }

    
    public void updateAccountInfo(){

        WebElement firstnameInputField = driver.findElement(By.id(firstnameInputFieldId));
        WebElement lastnameInputField = driver.findElement(By.id(lastnameInputFieldId));
        WebElement phoneInputField = driver.findElement(By.id(phoneInputFieldId));

        firstnameInputField.clear();
        lastnameInputField.clear();
        phoneInputField.clear();

        firstnameInputField.sendKeys("Aleksejstest1");
        lastnameInputField.sendKeys("RibakovsTest");
        phoneInputField.sendKeys("+3711234567");

        WebElement currentPswField = driver.findElement(By.id(currentPswFieldId));
        WebElement saveButton = driver.findElement(By.xpath(saveButtonXpath));

        currentPswField.sendKeys("k4ry!GHU9cv!t.c");
        saveButton.click();

    }
    public Boolean isOpen(){
        WebElement accountBlock = driver.findElement(By.xpath(accountBlockXpath));
        if (accountBlock.isDisplayed()) return true;
        else return false;
    }

    public Boolean isUpdated(){
        WebElement successMsg = driver.findElement(By.xpath(successMsgXpath));
        if (successMsg.isDisplayed()) return true;
        else return false;
    }
}