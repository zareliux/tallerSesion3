package session;

import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

public class Session {

    private static Session session = null;
    private WebDriver driver;

    private Session(){
        driver= FactoryBrowser.make("owasp").create();
    }

    public static Session getInstance(){
        if (session==null)
            session= new Session();

        return session;
    }

    public void closeSession(){
        driver.close();
        session=null;
    }

    public WebDriver getDriver() {
        return driver;
    }

}

