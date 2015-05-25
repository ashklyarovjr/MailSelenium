import org.testng.annotations.*;

public class TestScenarios {

    @Parameters("browser")
    @BeforeMethod
    public void setUp() throws Exception {


    }

    @Test
    public void testName() throws Exception {
        // goToLoginPage(String url)
        // logIn(String username, String password)
        // createNewLetter();
        // saveToDrafts();
        // sendLetterFromDrafts();
        // goToSentMail();
        // checkThatMailHasBeenSent();
        // logOut();

    }

    @AfterMethod
    public void tearDown() throws Exception {


    }
}
