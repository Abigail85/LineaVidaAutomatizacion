package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaEliminarEspecificacionesLotePage {
	public static final Target ELIMINAR_PROVEEDOR = Target.the("le da click a la opción de eliminar").located(By.xpath("//a[@data-id='811031385']//i[contains(@class, 'fas fa-trash')]"));
	public static final Target CONFIRMAR = Target.the("le da click a la opción confirmar eliminar").located(By.xpath("//button[@id='botoneliminar']"));

}
