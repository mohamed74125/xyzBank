package Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

import java.time.Duration;

public class SetUp {
   private WebDriver driver;
   protected HomePage homepage;
 @BeforeClass
  public void setUp()throws InterruptedException{
     WebDriverManager.edgedriver().setup();
     driver=new EdgeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     homepage=new HomePage(driver);

    goHome();

  }
  public void goHome(){
     driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
  }

}
