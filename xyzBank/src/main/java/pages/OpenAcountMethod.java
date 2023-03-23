package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class OpenAcountMethod {
    private WebDriver driver;
    private By CustomerdrobDown=By.xpath("//*[@id=\"userSelect\"]");
    private By CurrencydrobDown=By.xpath("//*[@id=\"currency\"]");
    private By prosessbutton= By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button");

    public OpenAcountMethod(WebDriver driver) {
        this.driver=driver;
    }
    private Select findCustomerDrobdown(){
        return new Select(driver.findElement(CustomerdrobDown));
    }
    private Select findcurrencyDrobDDown(){
        return new Select(driver.findElement(CurrencydrobDown));
    }
    public void selectFromDrobdown(String option1,String option2){
        findCustomerDrobdown().selectByVisibleText(option1);
        findcurrencyDrobDDown().selectByVisibleText(option2);
    }
    public void ClickProssorButtont(){

        driver.findElement(prosessbutton).click();
    }
    public String  getAlertText(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.switchTo().alert().getText();

    }


}
