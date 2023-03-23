package Base;

import Base.SetUp;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class managerTest extends SetUp {
   @Test
    public void setManagertest() {
        var managertest=homepage.maneger().clickAddCustomer();

        managertest.setCustomerusername();
        managertest.setCustomerlastname();
        managertest.setCustomerpastcode();
        managertest.ClickAddButton();
        assertTrue(managertest.getaAlertText().contains("Customer added successfully with customer id :"));
        managertest.acceptAlert();

    }



}
