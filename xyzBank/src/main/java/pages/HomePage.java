package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    String managerlogin=("/html/body/div/div/div[2]/div/div[1]/div[2]/button");
    String CustomerLogin=("/html/body/div/div/div[2]/div/div[1]/div[1]/button");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public  Managerpage maneger(){
        clickpage(managerlogin);

        return new Managerpage(driver);
    }
    public CustomerPage customer(){
        clickpage(CustomerLogin);
        return new CustomerPage(driver);
    }
    public void clickpage(String xpath){
    driver.findElement(By.xpath(xpath)).click();

    }


}
