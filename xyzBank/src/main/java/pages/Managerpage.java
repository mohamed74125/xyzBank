package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Managerpage {
   private WebDriver driver;


   private By addCustomer= By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]");
   private By oppenAccount=By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]");
   private By customersAccount =By.xpath("/html/body/div/div/div[2]/div/div[1]/button[3]");

    public Managerpage(WebDriver driver) {
        this.driver=driver;
    }



    public AddCustomerMethod clickAddCustomer(){
        driver.findElement(addCustomer).click();
        return new AddCustomerMethod(driver);
    }
    public OpenAcountMethod clickopenAcount(){
        driver.findElement(oppenAccount).click();
        return new OpenAcountMethod(driver);
    }
    public CustomerAccount CstomersAccount(){
        driver.findElement(customersAccount).click();
        return new CustomerAccount(driver);
    }






}
