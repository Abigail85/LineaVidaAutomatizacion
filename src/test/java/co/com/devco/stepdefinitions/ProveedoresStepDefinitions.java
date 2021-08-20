package co.com.devco.stepdefinitions;

import co.com.devco.tasks.*;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.userinterfaces.LineaDeVidaHomeResultadosPage.RESULTADOS_BUSQUEDA_HOME;
import static co.com.devco.userinterfaces.LineaDeVidaProveedoresResultadosPage.RESULTADOS_BUSQUEDA_PROVEEDORES;
import static co.com.devco.userinterfaces.LineaDeVidaCrearProveedoresResultadosPage.RESULTADO_CREAR_PROVEEDOR;
import static co.com.devco.userinterfaces.LineaDeVidaEditarProveedoresResultadosPage.RESULTADO_EDITAR_PROVEEDOR;
import static co.com.devco.userinterfaces.LineaDeVidaVerDetallesProveedoresResultadosPage.RESULTADOS_VER_DETALLES;
import static co.com.devco.userinterfaces.LineaDeVidaEliminarProveedoresResultadosPage.RESULTADO_ELIMINAR_PROVEEDOR;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ProveedoresStepDefinitions {


    @Cuando("un usuario {string} crea {string} en linea-de-vida")
    public void unUsuarioCreaEnLineaDeVida(String actor, String string) {
        theActorCalled(actor).attemptsTo(
                BuscarIngresarElLogin.laPalabra(),
                IngresarProveedores.laPalabra(),
                CrearProveedores.laPalabra()

        );
    }

    @Entonces("debe ver como resultado un mensaje {string} ")
    public void debeVerComoResultadoMensaje(String mensaje) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).hasSize(1),
                Ensure.that(RESULTADOS_BUSQUEDA_PROVEEDORES).hasSize(1),
                Ensure.that(RESULTADO_CREAR_PROVEEDOR).containsElements(mensaje)


        );
    }

    @Cuando("un usuario {string} edita {string} en linea-de-vida")
    public void unUsuarioEditaEnLineaDeVida(String actor, String string) {
        theActorCalled(actor).attemptsTo(
                BuscarIngresarElLogin.laPalabra(),
                IngresarProveedores.laPalabra(),
                EditarProveedores.laPalabra()

        );
    }

    @Entonces("debe ver como resultado un mensaje1 {string} ")
    public void debeVerComoResultadoMensaje1(String mensaje1) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).hasSize(1),
                Ensure.that(RESULTADOS_BUSQUEDA_PROVEEDORES).hasSize(1),
                Ensure.that(RESULTADO_EDITAR_PROVEEDOR).containsElements(mensaje1)


        );
    }
    @Cuando("un usuario {string} ve los detalles {string} en linea-de-vida")
    public void unUsuarioVeLosDetallesEnLineaDeVida(String actor, String string) {
        theActorCalled(actor).attemptsTo(
                BuscarIngresarElLogin.laPalabra(),
                IngresarProveedores.laPalabra(),
                VerDatalleProveedores.laPalabra()

        );
    }


    @Entonces("debe ver como resultado una pantalla {string} ")
    public void debeVerComoResultadoUna(String mensaje2) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).hasSize(1),
                Ensure.that(RESULTADOS_BUSQUEDA_PROVEEDORES).hasSize(1),
                Ensure.that(RESULTADOS_VER_DETALLES).containsElements(mensaje2)


        );
    }

    @Cuando("un usuario {string} elimina {string} en linea-de-vida")
    public void unUsuarioEliminaEnLineaDeVida(String actor, String string) {
        theActorCalled(actor).attemptsTo(
                BuscarIngresarElLogin.laPalabra(),
                IngresarProveedores.laPalabra(),
                EliminarProveedores.laPalabra()
        );
    }

    @Entonces("debe ver como resultado un mensaje3 {string} ")
    public void debeVerComoResultadoMensaje3(String mensaje3) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).hasSize(1),
                Ensure.that(RESULTADOS_BUSQUEDA_PROVEEDORES).hasSize(1),
                Ensure.that(RESULTADO_ELIMINAR_PROVEEDOR).containsElements(mensaje3)

        );
    }
}