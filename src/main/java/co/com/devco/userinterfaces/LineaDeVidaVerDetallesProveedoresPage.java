package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaVerDetallesProveedoresPage {
	public static final Target VER_DETALLES_PROVEEDOR = Target.the("le da click a la opción de ver detales").located(By.xpath("//a[@data-id='811031385']//i[contains(@class, 'fas fa-search')]"));
    public static final Target RESULTADO  = Target.the("se ve la pantalla con los datos del proveedor").located(By.xpath("//div[@id='detallesModal']"));


}
