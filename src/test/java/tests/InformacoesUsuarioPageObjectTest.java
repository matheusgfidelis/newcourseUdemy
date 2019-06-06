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
            .typeLogin("julio0001")
            .typePassword("123456");

    }

    @After
    public void tearDown(){
        nav.quit();
    }
}
