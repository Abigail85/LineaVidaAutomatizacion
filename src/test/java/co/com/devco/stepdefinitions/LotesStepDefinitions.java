package co.com.devco.stepdefinitions;

import co.com.devco.tasks.*;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;


import static co.com.devco.userinterfaces.LineaDeVidaCrearEspecificacionResultadosPage.RESULTADO_CREAR_ESPECIFICACION;
import static co.com.devco.userinterfaces.LineaDeVidaEliminarEspecificacionesLoteResultadosPage.RESULTADO_ELIMINAR_ESPECIFICACION;
import static co.com.devco.userinterfaces.LineaDeVidaHomeResultadosPage.RESULTADOS_BUSQUEDA_HOME;
import static co.com.devco.userinterfaces.LineaDeVidaLotesResultadosPage.RESULTADOS_BUSQUEDA_LOTES;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LotesStepDefinitions {


    @Cuando("un usuario {string} crea  una especificacion de un lote en linea-de-vida")
    public void unUsuarioCreaUnaEspecificacionDeUnLoteEnLineaDeVida(String actor) {
        theActorCalled(actor).attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Lotes"),
                NavegarPorElSubMenu.hacia("Gestionar Especificaciónes"),
                CrearUnaNuevaEspecificacion.delLote()

        );
    }

    @Entonces("debe ver como resultado un mensaje Especificación creada {string}")
    public void debeVerComoResultadoUnMensajeEspecificacionCreada(String mensaje) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).hasSize(1),
                Ensure.that(RESULTADOS_BUSQUEDA_LOTES).hasSize(1),
                Ensure.that(RESULTADO_CREAR_ESPECIFICACION).containsElements(mensaje)


        );
    }



    @Cuando("un usuario {string} elimina una especificacion en linea-de-vida")
    public void unUsuarioEliminaUnaEspecificacionEnLineaDeVida(String actor) {
        theActorCalled(actor).attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Lotes"),
                NavegarPorElSubMenu.hacia("Gestionar Especificaciónes"),
                EliminarUnaEspecificacion.delLote()
        );
    }

    @Entonces("debe ver como resultado un mensaje Especificacion eliminada {string}")
    public void debeVerComoResultadoUnMensajeEspecificacionEliminada(String mensaje) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).contains(mensaje),
                Ensure.that(RESULTADOS_BUSQUEDA_LOTES).contains(mensaje),
                Ensure.that(RESULTADO_ELIMINAR_ESPECIFICACION).containsElements(mensaje)

        );
    }
}