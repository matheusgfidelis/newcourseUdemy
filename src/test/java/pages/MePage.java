package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MePage extends BasePage{

    public MePage(WebDriver nav){
        super(nav);
    }

    public MePage clickMoreDataAboutYou(){
        nav.findElement(By.linkText("MORE DATA ABOUT YOU")).click();

        return this;
    }

    public AddContactPage clickButtonMoreDataAboutYou(){
        nav.findElement(By.xpath("//button[@data-target=\"addmoredata\"]")).click();

        return new AddContactPage(nav);
    }
}
