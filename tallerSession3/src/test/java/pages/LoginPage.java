package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public TextBox email= new TextBox(By.id("email"),"[email] TextBox in Login Modal Page");
    public TextBox contrasena= new TextBox(By.id("password"),"[password] TextBox in Login Modal Page");
    public Button IniciaSesion= new Button(By.xpath("//*[@id=\"login_form\"]/button"),"[Login] Button in Login Modal Page");

    public  LoginPage(){

    }
}
