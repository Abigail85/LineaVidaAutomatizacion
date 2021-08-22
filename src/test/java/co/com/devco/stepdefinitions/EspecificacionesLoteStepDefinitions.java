package co.com.devco.stepdefinitions;

import co.com.devco.tasks.*;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EspecificacionesLoteStepDefinitions {


    @Cuando("un usuario {string} crea {string} en linea-de-vida")
    public void unUsuarioCreaEnLineaDeVida(String actor, String string) {
        theActorCalled(actor).attemptsTo(
                //BuscarIngresarElLogin.laPalabra(),
                //IngresarLotes.laPalabra(),
                //CrearEspecificacionesLote.laPalabra()

        );
    }

    @Entonces("debe ver como resultado un mensaje {string} ")
    public void debeVerComoResultadoMensaje(String mensaje) {
        theActorInTheSpotlight().attemptsTo(
                //Ensure.that(RESULTADOS_BUSQUEDA_HOME).hasSize(1),
                //Ensure.that(RESULTADOS_BUSQUEDA_LOTES).hasSize(1),
                //Ensure.that(RESULTADO_CREAR_ESPECIFICACIONES).containsElements(mensaje)


        );
    }

    @Cuando("un usuario {string} edita {string} en linea-de-vida")
    public void unUsuarioEditaEnLineaDeVida(String actor, String string) {
        theActorCalled(actor).attemptsTo(
                //BuscarIngresarElLogin.laPalabra(),
                //IngresarLotes.laPalabra(),
                //EditarEspecificacionLote.laPalabra()

        );
    }

    @Entonces("debe ver como resultado un mensaje1 {string} ")
    public void debeVerComoResultadoMensaje1(String mensaje1) {
        theActorInTheSpotlight().attemptsTo(
                //Ensure.that(RESULTADOS_BUSQUEDA_HOME).hasSize(1),
                //Ensure.that(RESULTADOS_BUSQUEDA_LOTES).hasSize(1),
                //Ensure.that(RESULTADO_EDITAR_ESPECIFICACIONES).containsElements(mensaje1)


        );
    }
    @Cuando("un usuario {string} ve los detalles {string} en linea-de-vida")
    public void unUsuarioVeLosDetallesEnLineaDeVida(String actor, String string) {
        theActorCalled(actor).attemptsTo(
                //BuscarIngresarElLogin.laPalabra(),
                //IngresarLotes.laPalabra(),
                //VerDetalleEspecificacionLote.laPalabra()

        );
    }


    @Entonces("debe ver como resultado una pantalla {string} ")
    public void debeVerComoResultadoUna(String mensaje2) {
        theActorInTheSpotlight().attemptsTo(
                //Ensure.that(RESULTADOS_BUSQUEDA_HOME).hasSize(1),
                //Ensure.that(RESULTADOS_BUSQUEDA_LOTES).hasSize(1),
                //Ensure.that(RESULTADOS_VER_DETALLES_ESPECIFICACIONES).containsElements(mensaje2)


        );
    }

    @Cuando("un usuario {string} elimina {string} en linea-de-vida")
    public void unUsuarioEliminaEnLineaDeVida(String actor, String string) {
        theActorCalled(actor).attemptsTo(
                //BuscarIngresarElLogin.laPalabra(),
                //IngresarLotes.laPalabra(),
                //EliminarEspecificaciones.laPalabra()
        );
    }

    @Entonces("debe ver como resultado un mensaje3 {string} ")
    public void debeVerComoResultadoMensaje3(String mensaje3) {
        theActorInTheSpotlight().attemptsTo(
                //Ensure.that(RESULTADOS_BUSQUEDA_HOME).hasSize(1),
                //Ensure.that(RESULTADOS_BUSQUEDA_LOTES).hasSize(1),
                //Ensure.that(RESULTADO_ELIMINAR_ESPECIFICACIONES).containsElements(mensaje3)

        );
    }
}