package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaEliminarEspecificacionesLoteResultadosPage {

    public static final Target RESULTADO_ELIMINAR_ESPECIFICACION = Target.the("Mensaje 'especificacion eliminada exitosamente'").located(By.xpath("//p[text()='Especificación eliminada exitosamente.']"));
}
