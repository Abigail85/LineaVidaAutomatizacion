package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaVerDetallesEspecificacionLotePage {
	public static final Target VER_DETALLES_PROVEEDOR = Target.the("le da click a la opción de ver detales").located(By.xpath("//a[@data-id='811031385']//i[contains(@class, 'fas fa-search')]"));
	public static final Target CERRAR_DETALLES = Target.the("le da click a la opción de cerrar detalles").located(By.xpath("//button[@id='btncerrar']"));

}
