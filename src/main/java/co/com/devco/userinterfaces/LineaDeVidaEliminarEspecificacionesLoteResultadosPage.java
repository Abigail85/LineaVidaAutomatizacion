package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaEliminarEspecificacionesLoteResultadosPage {
    public static final String RESULTADOS_BUSQUEDA_PROVEEDORES = "http://localhost:8888/proyecto-linea-de-vida/proyecto-linea-de-vida/public/proveedores";
    public static final Target RESULTADO_ELIMINAR_PROVEEDOR = Target.the("Mensaje 'Proveedor eliminado exitosamente'").located(By.xpath("//p[text()='Proveedor eliminado exitosamente']"));
}
