package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaLotesPage {
	public static final Target MENU_LOTES = Target.the("abre la opcion Proveedores").located(By.xpath("//span[text()='Lotes']"));
	public static final Target SUB_MENU_GESTIONAR_ESPECIFICACIONES= Target.the("abre el submenu Gestionar Proveedores").located(By.xpath("//div[@id='collapseTwo']//a[text()='Gestionar Especificaciónes']"));


}
