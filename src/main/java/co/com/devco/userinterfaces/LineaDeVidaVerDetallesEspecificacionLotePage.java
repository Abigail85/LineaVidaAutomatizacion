package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaVerDetallesEspecificacionLotePage {
	public static final Target A_VER_DETALLES_ESPECIFICACIONES = Target.the("campo ver detales").located(By.xpath("//a[@data-id='1']//i[contains(@class, 'fas fa-search')]"));
	public static final Target DIV_VER_DETALLES = Target.the("le da click a la opción de ver detales").located(By.id("detallesModal"));//div[@id='detallesModal']"));

}
