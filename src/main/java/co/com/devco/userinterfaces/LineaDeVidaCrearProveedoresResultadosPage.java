package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaCrearProveedoresResultadosPage {
    public static final String RESULTADOS_CREAR_ = "http://localhost:8888/proyecto-linea-de-vida/proyecto-linea-de-vida/public/proveedores";
    public static final Target RESULTADO_CREAR_PROVEEDOR = Target.the("mensaje ' ha sido creado exitosamente' ").located(By.xpath("//p[text()='Proveedor creado exitosamente.']"));
}
