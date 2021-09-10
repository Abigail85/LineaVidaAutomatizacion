package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaEliminarEspecificacionesLotePage {
	public static final Target A_ELIMINAR_ESPECIFICACION = Target.the("CAMPO eliminar").located(By.xpath("//a[@data-id='1']//i[contains(@class, 'fas fa-trash')]"));
	public static final Target BUTTON_CONFIRMAR_ELIMINAR = Target.the("CAMPO confirmar eliminar").located(By.id("botoneliminar"));//button[@id='botoneliminar']"));

}
