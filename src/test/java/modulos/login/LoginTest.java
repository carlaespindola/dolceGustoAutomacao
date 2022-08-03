package modulos.login;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Teste Web do Módulo de Login")

public class LoginTest {
    @Test
    @DisplayName("Login realizado com sucesso")
    public void testLoginRealizadoComSucesso() {
        //abrir o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Carla Lacroix\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        //maximizar a tela
        navegador.manage().window().maximize();
        //navegar até a url do site
        navegador.get("https://www.nescafe-dolcegusto.com.br/");
        //navegar até o ícone do login
        navegador.findElement((By.cssSelector("a[class='my-account my-account-logged-out']"))).click();
        //inserir sleep

        //preencher os campos do login
        navegador.findElement(By.id("email")).sendKeys("carlaespindola00@gmail.com");
        navegador.findElement(By.id("pass")).sendKeys("C@rla06011933");
        //fazer o login
        navegador.findElement(By.id("send2")).click();
   }
}


