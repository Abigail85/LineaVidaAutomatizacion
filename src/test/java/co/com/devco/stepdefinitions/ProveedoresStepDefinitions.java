package co.com.devco.stepdefinitions;

import co.com.devco.tasks.*;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.devco.userinterfaces.LineaDeVidaHomeResultadosPage.RESULTADOS_BUSQUEDA_HOME;
import static co.com.devco.userinterfaces.LineaDeVidaProveedoresResultadosPage.RESULTADOS_BUSQUEDA_PROVEEDORES;
import static co.com.devco.userinterfaces.LineaDeVidaCrearProveedoresResultadosPage.RESULTADO_CREAR_PROVEEDOR;
import static co.com.devco.userinterfaces.LineaDeVidaEditarProveedoresResultadosPage.RESULTADO_EDITAR_PROVEEDOR;
import static co.com.devco.userinterfaces.LineaDeVidaVerDetallesProveedoresResultadosPage.RESULTADOS_VER_DETALLES;
import static co.com.devco.userinterfaces.LineaDeVidaEliminarProveedoresResultadosPage.RESULTADO_ELIMINAR_PROVEEDOR;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ProveedoresStepDefinitions {

    @Cuando("un usuario {string} ingresa {string} en linea-de-vida")
    public void unUsuarioIngresaEnLineaDeVida(String actor, String string) {
        theActorCalled(actor).attemptsTo(
                BuscarIngresarElLogin.laPalabra(),
                IngresarProveedores.laPalabra(),
                CrearProveedores.laPalabra(),
                EditarProveedores.laPalabra(),
                EliminarProveedores.laPalabra()
        );
    }

    @Entonces("debe ver como resultado  {int} tabla proveedores")
    public void debeVerComoResultadoMensaje(Integer int1) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).hasSize(1),
                Ensure.that(RESULTADOS_BUSQUEDA_PROVEEDORES).hasSize(1),
                Ensure.that(RESULTADO_CREAR_PROVEEDOR).containsElements("mensaje ' Provvedor creado exitosamente' "),
                Ensure.that(RESULTADO_EDITAR_PROVEEDOR).containsElements("mensaje ' Proveedor editado exitosamente' "),
                Ensure.that(RESULTADOS_VER_DETALLES).hasSize(1),
                Ensure.that(RESULTADO_ELIMINAR_PROVEEDOR).containsElements("mensaje ' Proveedor eliminar exitosamente' ")

        );
    }
}
