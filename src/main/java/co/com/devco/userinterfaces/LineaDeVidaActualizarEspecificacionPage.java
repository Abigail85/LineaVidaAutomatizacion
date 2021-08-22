package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaActualizarEspecificacionPage {
	public static final Target EDITAR_PROVEEDOR = Target.the("le da click a la opción de editar").located(By.xpath("//a[@data-id='811031385']//i[contains(@class, 'fas fa-edit')]"));
	public static final Target EDITAR_NOMBRE_ENCARGADA_PRODUCCION = Target.the("le da click a la opción NOMBRE ENCARGADA DE PRODUCCION").located(By.xpath("//div[@id='editModal']//input[@id='txtNombrePersonaCargo']"));
	public static final String DIGITAR_NUEVO_NOMBRE_ENCARGADA_PRODUCCION = " Isabel Lopez";
	public static final Target ACTUALIZAR = Target.the("le da click a la opción de actualizar").located(By.xpath("//button[@id='btnguardar']"));

}
