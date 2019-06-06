package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import suport.Web;

public class InformacoesUsuarioPageObjectTest {

    private WebDriver nav;

    @Before
    public void setUp(){

        nav = Web.createChrome();

    }

    @Test
    public void testAdicionaUmaInformacaoAdicionalDoUsuario(){

    }

    @After
    public void tearDown(){
        nav.quit();
    }
}
