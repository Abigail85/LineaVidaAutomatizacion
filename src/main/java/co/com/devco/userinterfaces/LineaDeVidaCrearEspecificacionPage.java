package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaCrearEspecificacionPage {
	public static final Target A_NUEVA_ESPECIFICACION = Target.the("campo Nueva especificación").located(By.id("nuevaespecificacionlote"));//a[@id='nuevaespecificacionlote']"));
	public static final Target INPUT_ID_ESPECIFICACION = Target.the("le da click a la opción de la id especificación").located(By.id("idEspecificacionLotetxt"));//div[@id='crearEditarModal']//input[@id='idEspecificacionLotetxt']"));
	public static final Target SELECT_ID_LOTE = Target.the("campo lote").located(By.xpath("//select[@id='idLoteselect']/option[@value= '987']"));
	public static final Target SELECT_COLOR = Target.the("campo color").located(By.xpath("//select[@id='Colorselect']/option[text()='Vinotinto']"));
	public static final Target INPUT_CANTIDAD_TALLA_XXS = Target.the("campo TALLA XXS").located(By.id("cantidadXXStxt"));//input[@id='cantidadXXStxt']"));
	public static final Target INPUT_CANTIDAD_TALLA_S = Target.the("CAMPO TALLA S").located(By.id("cantidadStxt"));//input[@id='cantidadStxt']"));
	public static final Target GUARDAR = Target.the("le da click para guardar").located(By.xpath("//div[@id='crearEditarModal']//button[@id='btnguardar']"));
}
