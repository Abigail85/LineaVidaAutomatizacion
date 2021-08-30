package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaEditarEspecificacionPage {
	public static final Target EDITAR_ESPECIFICACION = Target.the("le da click a la opción de editar").located(By.xpath("//a[@data-id='1']//i[contains(@class, 'fas fa-edit')]"));
	public static final Target TALLA_A_MODIFICAR = Target.the("le da click a la talla que se desea modificar").located(By.xpath("//input[@id='cantidadMtxt']"));
	public static final String DIGITAR_NUEVA_CANTIDAD = "25";
	public static final Target GUARDAR = Target.the("le da click a la opción de GUARDAR").located(By.xpath("//div[@id='crearEditarModal']//button[@id='btnguardar']"));

}
