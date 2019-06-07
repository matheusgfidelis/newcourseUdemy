package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver nav){
        super(nav);
    }

    public LoginFormPage clickSignIn(){
        //Clicando no link "Sign in"
        nav.findElement(By.linkText("Sign in")).click();

        return new LoginFormPage(nav);
    }

}
