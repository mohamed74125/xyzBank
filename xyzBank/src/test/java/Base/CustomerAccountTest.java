package Base;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CustomerAccountTest extends SetUp{
   @Test
    public void customerAccountTest(){
        var custmers=homepage.maneger().CstomersAccount();
        custmers.CustomerAcount();
        custmers.deletaCustomer();
        assertTrue(custmers.CkechDeleted(),"the customer is not deleted");
    }
}
