package Base;

import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.*;

public class custmerAccountMethodTest extends SetUp{
 @Test
    public void custmerAccountMethodTest(){
     var customertest=homepage.customer();
     customertest .selectFromDrobdown("Harry Potter");
     customertest.clickLogin();
     customertest.Deposit("150");

     customertest.withdraw("100");
     customertest.getBalance();
     //assertEquals(customertest.getBalance(),"0");
 }
}
