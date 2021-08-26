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


    @Cuando("un usuario {string} crea  un  Proveedor en linea-de-vida")
    public void unUsuarioCreaUnProveedorEnLineaDeVida(String actor) {
        theActorCalled(actor).attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Proveedores"),
                NavegarPorElSubMenu.hacia("Gestionar Proveedores"),
                CrearProveedores.laPalabra()

        );
    }

    @Entonces("debe ver como resultado un mensaje {string}")
    public void debeVerComoResultadoUnMensaje(String mensaje) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).hasSize(1),
                Ensure.that(RESULTADOS_BUSQUEDA_PROVEEDORES).hasSize(1),
                Ensure.that(RESULTADO_CREAR_PROVEEDOR).containsElements(mensaje)


        );
    }

    @Cuando("un usuario {string} edita  un  Proveedor en linea-de-vida")
    public void unUsuarioEditaUnProveedorEnLineaDeVida(String actor) {
        theActorCalled(actor).attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Proveedores"),
                NavegarPorElSubMenu.hacia("Gestionar Proveedores"),
                EditarProveedores.laPalabra()

        );
    }

    @Entonces("debe ver como resultado un mensaje1 {string}")
    public void debeVerComoResultadoUnMensaje1(String mensajeEsperado) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).hasSize(1),
                Ensure.that(RESULTADOS_BUSQUEDA_PROVEEDORES).hasSize(1),
                Ensure.that(RESULTADO_EDITAR_PROVEEDOR).containsElements(mensajeEsperado)


        );
    }
    @Cuando("un usuario {string} ve los detalles de un Proveedor en linea-de-vida")
    public void unUsuarioVeLosDetallesDeUnProveedorEnLineaDeVida(String actor) {
        theActorCalled(actor).attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Proveedores"),
                NavegarPorElSubMenu.hacia("Gestionar Proveedores"),
                VerDatalleProveedores.laPalabra()

        );
    }


    @Entonces("debe ver como resultado una Pantalla con {string}")
    public void debeVerComoResultadoUnaPantallaCon(String string) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).hasSize(1),
                Ensure.that(RESULTADOS_BUSQUEDA_PROVEEDORES).hasSize(1),
                Ensure.that(RESULTADOS_VER_DETALLES).containsElements(string)


        );
    }

    @Cuando("un usuario {string} elimina un  Proveedor en linea-de-vida")
    public void unUsuarioEliminaUnProveedorEnLineaDeVida(String actor) {
        theActorCalled(actor).attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Proveedores"),
                NavegarPorElSubMenu.hacia("Gestionar Proveedores"),
                EliminarProveedores.laPalabra()
        );
    }

    @Entonces("debe ver como resultado un mensaje2 {string}")
    public void debeVerComoResultadoUnMensaje2(String mensaje2) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).hasSize(1),
                Ensure.that(RESULTADOS_BUSQUEDA_PROVEEDORES).hasSize(1),
                Ensure.that(RESULTADO_ELIMINAR_PROVEEDOR).containsElements(mensaje2)

        );
    }
}