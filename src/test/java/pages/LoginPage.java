package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver nav;

    public LoginPage(WebDriver nav){
        this.nav = nav;
    }

    public LoginFormPage clickSignIn(){
        //Clicando no link "Sign in"
        nav.findElement(By.linkText("Sign in")).click();

        return new LoginFormPage(nav);
    }

}
