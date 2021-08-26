package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaCrearEspecificacionResultadosPage {
    public static final Target RESULTADO_CREAR_ESPECIFICACION = Target.the("mensaje ' ha sido creado exitosamente' ").located(By.xpath("//p[text()='Especificación creada exitosamente.']"));
}
