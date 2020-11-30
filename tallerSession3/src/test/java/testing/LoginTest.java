package testing;

import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;
import pages.MainPage;

import session.Session;

public class LoginTest {

    MainPage mainPage= new MainPage();
    LoginPage loginPage = new LoginPage();

    @Before
    public void setup(){
        Session.getInstance().getDriver().get("https://todoist.com/es");
    }

    @Test
    @DisplayName("Don´t login with a non exist account")
    @Description("This test case is to verify that i can't login with non exist account")
    @Epic("Login")
    @Feature("Security Authetication")
    @Link("www.jira.com/SFSF3333")
    @Severity(SeverityLevel.BLOCKER)
    @Issue("SFTT888")
    public void createUserToSingup(){

        mainPage.singUpFreeLabel.click();

        loginPage.email.type("zarelarojas@gmail.com");
        loginPage.contrasena.type("123456");
        loginPage.IniciaSesion.click();

    }

    @After
    public void cleanUp(){
        Session.getInstance().closeSession();
    }

}
