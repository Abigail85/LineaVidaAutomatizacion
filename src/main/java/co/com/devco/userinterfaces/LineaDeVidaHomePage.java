package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaHomePage {
	public static final String LINEA_VIDA_HOME_PAGE = "http://localhost:8888/proyecto-linea-de-vida/proyecto-linea-de-vida/public/";//div[@id='content']
	public static final Target A_INGRESAR_LOGIN = Target.the("link que lleva al login").located(By.xpath("//a[text()='Ingresar']"));
	public static final Target INPUT_USUARIO = Target.the("campo de usuario").located(By.id("email"));
	public static final Target INPUT_PASSWORD = Target.the("campo de contraseña").located(By.id("password"));
	public static final Target BUTTON_INGRESAR = Target.the("boton ingresar").located(By.xpath("//button[normalize-space()='Ingresar']"));
}
