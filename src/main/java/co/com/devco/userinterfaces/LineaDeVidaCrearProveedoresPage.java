package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaCrearProveedoresPage {
	public static final Target A_NUEVO_PROVEEDOR = Target.the("campo Nuevo Proveedor").located(By.id("nuevoproveedor"));//a[@id='nuevoproveedor']"));
	public static final Target INPUT_NIT = Target.the("campo nit").located(By.xpath("//div[@id='crearModal']//input[@id='txtnit']"));
	public static final Target INPUT_NOMBRE_PROVEEDOR = Target.the("campo nombre").located(By.xpath("//div[@id='crearModal']//input[@id='txtNombre']"));
	public static final Target INPUT_DIRECCION = Target.the("campo dirección").located(By.xpath("//div[@id='crearModal']//input[@id='txtDireccion']"));
	public static final Target INPUT_TELEFONO = Target.the("campo teléfono").located(By.xpath("//div[@id='crearModal']//input[@id='txtTelefono']"));
	public static final Target INPUT_NOMBRE_ENCARGADA_PRODUCCION = Target.the("CAMPO NOMBRE ENCARGADA DE PRODUCCION").located(By.xpath("//div[@id='crearModal']//input[@id='txtNombrePersonaCargo']"));
	public static final Target GUARDAR = Target.the("le da click al primer elemento").located(By.xpath("//div[@id='crearModal']//button[@id='btnguardar']"));
}
