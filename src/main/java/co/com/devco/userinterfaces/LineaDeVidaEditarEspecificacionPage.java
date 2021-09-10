package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaEditarEspecificacionPage {
	public static final Target A_EDITAR_ESPECIFICACION = Target.the("CAMPO editar").located(By.xpath("//a[@data-id='1']//i[contains(@class, 'fas fa-edit')]"));
	public static final Target INPUT_MODIFICAR_TALLA = Target.the("campo modificar talla").located(By.id("cantidadMtxt"));//input[@id='cantidadMtxt']"));
	public static final Target GUARDAR = Target.the("le da click a la opción de GUARDAR").located(By.xpath("//div[@id='crearEditarModal']//button[@id='btnguardar']"));

}
