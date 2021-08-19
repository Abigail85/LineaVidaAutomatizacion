package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LineaDeVidaProveedoresResultadosPage {
    public static final String RESULTADOS_BUSQUEDA_PROVEEDORES = "http://localhost:8888/proyecto-linea-de-vida/proyecto-linea-de-vida/public/proveedores";
    public static final Target PRIMER_RESULTADO = Target.the("Primer resultado de busqueda").located(By.xpath("//div[@id='search']//div[@class='g' and position()=1]//link"));
}
