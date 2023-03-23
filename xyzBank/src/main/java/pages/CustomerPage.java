package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CustomerPage extends custmerAccountMethod{
    private WebDriver driver;
    private By customerNameDrobDown= By.xpath("//*[@id=\"userSelect\"]");
    private By loginButton=By.xpath("/html/body/div/div/div[2]/div/form/button");
    public CustomerPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public Select findCustomerDrobdown(){
        return new Select(driver.findElement(customerNameDrobDown));
    }
    public void selectFromDrobdown(String option){
        findCustomerDrobdown().selectByVisibleText(option);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }
    public custmerAccountMethod clickLogin(){
        driver.findElement(loginButton).click();
        return new custmerAccountMethod(driver);
    }


}
