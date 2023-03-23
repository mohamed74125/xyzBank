package Base;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class OpenAccoutTest extends SetUp{
    @Test
    public void OpenAccoutTest(){
        var managerTest=homepage.maneger().clickopenAcount();
        managerTest.selectFromDrobdown("Hermoine Granger","Dollar");
        managerTest.ClickProssorButtont();
        assertTrue(managerTest.getAlertText().contains("Account created successfully with account Number"));
    }
}
