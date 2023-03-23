package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerAccount {
    private  WebDriver driver;

    private By SeachButton= By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input");
    private By deletButton=By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[1]/td[5]/button");

    public CustomerAccount(WebDriver driver) {
        this.driver=driver;
    }
    public void CustomerAcount(){
        driver.findElement(SeachButton).sendKeys("Harry");
    }
    public void deletaCustomer(){
        driver.findElement(deletButton).click();
    }
    public boolean CkechDeleted(){
        return  driver.findElements( deletButton ).size() == 0;
    }


}
