package pages;

import controls.Label;
import org.openqa.selenium.By;

public class MainPage {

    public Label singUpFreeLabel = new Label(By.xpath("//ul[@class='_3XsmI']//a[@href='/users/showlogin']")," [Login] Label in Main Page");

    public MainPage(){}

}
