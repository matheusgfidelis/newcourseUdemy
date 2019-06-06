package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage {
    private WebDriver nav;

    public LoginFormPage(WebDriver nav){
        this.nav = nav;
    }

    public ? typeLogin(String login){
        nav.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys("julio001");
    }
}