package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaCrearProveedoresPage {
	public static final Target INGRESAR_NIT = Target.the("le da click a la opción del nit").located(By.xpath("//div[@id='crearModal']//input[@id='txtnit']"));
	public static final String DIGITAR_NIT= "811031385" ;
	public static final Target INGRESAR_NOMBRE_PROVEEDOR = Target.the("le da click a la opción nombre").located(By.xpath("//div[@id='crearModal']//input[@id='txtNombre']"));
	public static final String DIGITAR_NOMBRE_PROVEEDOR = "MODA AVANZADA S.A";
	public static final Target INGRESAR_DIRECCION = Target.the("le da click a la opción dirección").located(By.xpath("//div[@id='crearModal']//input[@id='txtDireccion']"));
	public static final String DIGITAR_DIRECCION = "Centro de la moda del centro";
	public static final Target INGRESAR_TELEFONO = Target.the("le da click a la opción teléfono").located(By.xpath("//div[@id='crearModal']//input[@id='txtTelefono']"));
	public static final String DIGITAR_TELEFONO = "3228138";
	public static final Target INGRESAR_NOMBRE_ENCARGADA_PRODUCCION = Target.the("le da click a la opción NOMBRE ENCARGADA DE PRODUCCION").located(By.xpath("//div[@id='crearModal']//input[@id='txtNombrePersonaCargo']"));
	public static final String DIGITAR_NOMBRE_ENCARGADA_PRODUCCION = "isabel";
	public static final Target GUARDAR = Target.the("le da click al primer elemento").located(By.xpath("//div[@id='crearModal']//button[@id='btnguardar']"));
}
