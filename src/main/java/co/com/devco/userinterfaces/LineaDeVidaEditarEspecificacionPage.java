package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaEditarEspecificacionPage {
	public static final Target INPUT_MODIFICAR_TALLA = Target.the("campo modificar talla").located(By.xpath("//input[@id='cantidadMtxt']"));
	public static final Target BUTTON_GUARDAR = Target.the("le da click a la opción de GUARDAR").located(By.xpath("//div[@id='crearEditarModal']//button[@id='btnguardar']"));

}
