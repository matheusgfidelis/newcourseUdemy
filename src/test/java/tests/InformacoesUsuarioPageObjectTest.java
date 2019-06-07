package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suport.Web;

public class InformacoesUsuarioPageObjectTest {

    private WebDriver nav;

    @Before
    public void setUp(){

        nav = Web.createChrome();

    }

    @Test
    public void testAdicionaUmaInformacaoAdicionalDoUsuario(){
        new LoginPage(nav)
                .clickSignIn()
                .login("julio0001", "123456")
                .clickMe()
                .clickMoreDataAboutYou()
                .clickButtonMoreDataAboutYou();

    }

    @After
    public void tearDown(){
        nav.quit();
    }
}
