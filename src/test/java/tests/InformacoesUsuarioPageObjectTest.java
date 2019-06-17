package tests;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suport.Web;

import static org.junit.Assert.*;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "InformacoesUsuarioPageObjectTest.csv")
public class InformacoesUsuarioPageObjectTest {

    private WebDriver nav;

    @Before
    public void setUp(){

        nav = Web.createBrowserStack();

    }

    @Test
    public void testAdicionaUmaInformacaoAdicionalDoUsuario
            (@Param(name="login")String login,
             @Param(name="password")String password,
             @Param(name="type")String type,
             @Param(name="contact")String contact,
             @Param(name="msg")String msg)
    {
        String toastText = new LoginPage(nav)
                .clickSignIn()
                .login(login, password)
                .clickMe()
                .clickMoreDataAboutYou()
                .clickButtonMoreDataAboutYou()
                .addContact(type,contact)
                .catchTextToast();

        assertEquals(msg, toastText);

    }

    @After
    public void tearDown(){
        nav.quit();
    }
}
