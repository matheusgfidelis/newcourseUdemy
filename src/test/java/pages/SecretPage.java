package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecretPage extends BasePage {

    public SecretPage(WebDriver nav){
        super(nav);
    }

    public MePage clickMe(){
        nav.findElement(By.className("me")).click();

        return new MePage(nav);
    }


}
