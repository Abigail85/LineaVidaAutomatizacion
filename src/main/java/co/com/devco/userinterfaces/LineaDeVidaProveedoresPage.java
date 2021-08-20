package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaProveedoresPage {
	public static final Target MENU_PROVEEDORES = Target.the("abre la opcion Proveedores").located(By.xpath("//span[text()='Proveedores']"));
	public static final Target SUB_MENU_GESTIONAR_PROVEEDORES= Target.the("abre el submenu Gestionar Proveedores").located(By.xpath("//div[@id='collapseUtilities']//a[text()='Gestionar Proveedores']"));


}
