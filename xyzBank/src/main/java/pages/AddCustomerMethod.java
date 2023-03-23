package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class AddCustomerMethod {
    private WebDriver driver;
    private By username=By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input");
    private By lastname=By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input");
    private By postcode=By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input");
    private By addButton=By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button");
    public AddCustomerMethod(WebDriver driver) {
       this.driver=driver;
    }
    public void setCustomerusername(){
        driver.findElement(username).sendKeys("mohamed2");
    }
    public void setCustomerlastname(){
        driver.findElement(lastname).sendKeys("ahmed2");
    }
    public void setCustomerpastcode(){
        driver.findElement(postcode).sendKeys("4568755");
    }
    public void ClickAddButton(){
        driver.findElement(addButton).click();

    }

    public String getaAlertText()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.switchTo().alert().getText();

    }
    public void acceptAlert()  {

        driver.switchTo().alert().accept();

    }

}
