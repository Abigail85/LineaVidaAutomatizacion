package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaCrearEspecificacionPage {
	public static final Target NUEVA_ESPECIFICACION= Target.the("le da click a la opcion Nueva especificación").located(By.xpath("//a[@id='nuevaespecificacionlote']"));
	public static final Target INGRESAR_ID_ESPECIFICACION = Target.the("le da click a la opción de la id especificación").located(By.xpath("//div[@id='crearEditarModal']//input[@id='idEspecificacionLotetxt']"));
	public static final String DIGITAR_ID_ESPECIFICACION= "1" ;
	public static final Target INGRESAR_ID_LOTE = Target.the("le da click a la opción nombre").located(By.xpath("//select[@id='idLoteselect']/option[@value= '99']"));
	public static final Target INGRESAR_COLOR = Target.the("le da click a la opción color").located(By.xpath("//select[@id='Colorselect']/option[text()='Azul oscuro']"));
	public static final Target INGRESAR_CANTIDAD_TALLA_XS = Target.the("le da click a la opción TALLA XS").located(By.xpath("//input[@id='cantidadXXStxt']"));
	public static final String DIGITAR_CANTIDAD_TALLA_XS = "3O";
	public static final Target INGRESAR_CANTIDAD_TALLA_S= Target.the("le da click a la opción TALLA S").located(By.xpath("//input[@id='cantidadStxt']"));
	public static final String DIGITAR_CANTIDAD_TALLA_S= "12";
	public static final Target GUARDAR = Target.the("le da click para guardar").located(By.xpath("//div[@id='crearEditarModal']//button[@id='btnguardar']"));
}
