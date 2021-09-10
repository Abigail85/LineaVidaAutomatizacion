package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LineaDeVidaEliminarProveedoresPage {
	public static final Target A_ELIMINAR_PROVEEDOR = Target.the("CAMPO eliminar '{0}'").locatedBy("//a[@data-id='{0}']//i[contains(@class, 'trash')]");
	public static final Target BUTTON_CONFIRMAR = Target.the("CAMPO confirmar eliminar ").located(By.xpath("//button[@id='botoneliminar']"));//a[@value='{0}' and contains(@class,' eliminar')]"//input[@value='{0}']//button[@id='botoneliminar']

}
