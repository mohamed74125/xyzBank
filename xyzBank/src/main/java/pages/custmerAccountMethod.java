package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class custmerAccountMethod {

    private WebDriver driver;

    private By amountfielddepsit=By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input");
    private By depositbutton = By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]");
    private By depositbutton2 = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button");
    private By withdrawbutton=By.xpath("/html/body/div/div/div[2]/div/div[3]/button[3]");
    private By amountfieldwithdraw = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input");
    private By withdrawbutton2 = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button");
    private By balance =By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]");
    public custmerAccountMethod(WebDriver driver) {
        this.driver=driver;
    }

    public void Deposit(String amount){
        driver.findElement(depositbutton).click();
        driver.findElement(amountfielddepsit).sendKeys(amount);
        driver.findElement(depositbutton2).click();
    }
    public void withdraw(String amount){
        driver.findElement(withdrawbutton).click();
        driver.findElement(amountfieldwithdraw).sendKeys(amount);
        driver.findElement(withdrawbutton2).click();
    }
    public String getBalance(){
        return driver.findElement(balance).getText();
    }

}
