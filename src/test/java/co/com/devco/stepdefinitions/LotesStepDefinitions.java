package co.com.devco.stepdefinitions;

import co.com.devco.tasks.*;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;


import static co.com.devco.userinterfaces.LineaDeVidaAccionesDeTodosLosMenusResultadosPage.P_MENSAJE;
import static co.com.devco.userinterfaces.LineaDeVidaVerDetallesResultadosPage.RESULTADO;
import static co.com.devco.userinterfaces.LineaDeVidaHomeResultadosPage.RESULTADOS_BUSQUEDA_HOME;
import static co.com.devco.userinterfaces.LineaDeVidaLotesResultadosPage.RESULTADOS_BUSQUEDA_LOTES;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LotesStepDefinitions {


    @Cuando("se crea una especificacion")
    public void seCreaUnaEspecificacion() {
        theActorCalled("admin").attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Lotes","Gestionar Especificaciónes"),
                CrearUnaNuevaEspecificacion.delLote()

        );
    }

    @Entonces("debe ver como resultado la nota {string}")
    public void debeVerComoResultadoLaNota(String string) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).contains(string),
                Ensure.that(RESULTADOS_BUSQUEDA_LOTES).contains(string),
                Ensure.that(P_MENSAJE).hasTextContent("Especificación creada exitosamente")


        );
    }

    @Cuando("se editan las especificaciones con ID {string}")
    public void seEditanLasEspecificacionesConId(String string) {
        theActorCalled("admin").attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Lotes","Gestionar Especificaciónes"),
                EditarlasEspecificaciones.delLote("6")

        );
    }


    @Entonces("debe ver como resultado el recado {string}")
    public void debeVerComoResultadoElRecado(String string) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).contains(string),
                Ensure.that(RESULTADOS_BUSQUEDA_LOTES).contains(string),
                Ensure.that(P_MENSAJE).hasTextContent("Especificación actualizada exitosamente")


        );
    }

    @Cuando("se ven los detalles de las especificaciones con ID {string}")
    public void seVenLosDetallesDeLasEspecificacionesConID(String string) {
        theActorCalled("admin").attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Lotes","Gestionar Especificaciónes"),
                VerLosDetallesDe.laInformacionDe("2")

        );
    }


    @Entonces("debe ver como resultado los datos de la Especificacion")
    public void debeVerComoResultadoLosDatosDeLaEspecificacion() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).contains(),
                Ensure.that(RESULTADOS_BUSQUEDA_LOTES).contains(),
                Ensure.that(RESULTADO).containsElements(toString())

        );
    }

    @Cuando("se elimina una especificacion con ID {string}")
    public void seEliminaUnaEspecificacionConId(String string) {
        theActorCalled("admin").attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Lotes","Gestionar Especificaciónes"),
                EliminarUnaEspecificacion.delLote("1")
        );
    }

    @Entonces("debe ver como resultado la comunicacion {string}")
    public void debeVerComoResultadoLaComunicacion(String string) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).contains(string),
                Ensure.that(RESULTADOS_BUSQUEDA_LOTES).contains(string),
                Ensure.that(P_MENSAJE).hasTextContent("Especificación eliminada exitosamente")

        );
    }




}
