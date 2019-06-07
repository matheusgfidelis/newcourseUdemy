package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage extends BasePage{

    public LoginFormPage(WebDriver nav){
        super(nav);
    }

    public LoginFormPage typeLogin(String login){
        nav.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys(login);

        return this;
    }

    public LoginFormPage typePassword(String passaword){
        nav.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys(passaword);

        return this;
    }

    public SecretPage clickSignIn(){
        nav.findElement(By.linkText("SIGN IN")).click();

        return new SecretPage(nav);
    }

    public SecretPage login(String login, String password){
        typeLogin(login);
        typePassword(password);
        clickSignIn();

        return new SecretPage(nav);

    }
}
