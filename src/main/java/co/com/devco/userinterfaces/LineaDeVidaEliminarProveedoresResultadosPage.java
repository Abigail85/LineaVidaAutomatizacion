package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaEliminarProveedoresResultadosPage {

    public static final Target RESULTADO_ELIMINAR_PROVEEDOR = Target.the("Mensaje 'Proveedor eliminado exitosamente'").located(By.xpath("//p[text()='Proveedor eliminado exitosamente']"));
}
