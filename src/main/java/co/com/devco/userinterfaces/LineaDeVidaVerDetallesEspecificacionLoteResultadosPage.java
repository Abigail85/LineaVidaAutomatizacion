package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaVerDetallesEspecificacionLoteResultadosPage {

    public static final Target RESULTADOS_VER_DETALLES  = Target.the("se ve la pantalla con los datos del provvedor").located(By.xpath("//div[@id='detallesModal']"));
}
