package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver nav;

    public BasePage(WebDriver nav){
        this.nav = nav;
    }

    public String catchTextToast(){
        return nav.findElement(By.id("toast-container")).getText();
    }
}
