package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaEditarProveedoresPage {
	public static final Target INPUT_NOMBRE_ENCARGADA_PRODUCCION = Target.the("campo NOMBRE ENCARGADA DE PRODUCCION").located(By.id("txtNombrepersonaCargo"));//div[@id='editModal']//input[@id='txtNombrePersonaCargo']"));
	public static final Target BUTTON_ACTUALIZAR = Target.the("campo actualizar").located(By.xpath("//button[@id='btnguardar']"));

}
