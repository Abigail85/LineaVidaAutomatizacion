package co.com.devco.stepdefinitions;

import co.com.devco.tasks.*;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;


import static co.com.devco.userinterfaces.LineaDeVidaAccionesDeTodosLosMenusResultadosPage.P_MENSAJE;
import static co.com.devco.userinterfaces.LineaDeVidaHomeResultadosPage.RESULTADOS_BUSQUEDA_HOME;
import static co.com.devco.userinterfaces.LineaDeVidaLotesResultadosPage.RESULTADOS_BUSQUEDA_LOTES;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LotesStepDefinitions {


    @Cuando("un usuario {string} crea una especificacion de un lote en linea-de-vida")
    public void unUsuarioCreaUnaEspecificacionDeUnLoteEnLineaDeVida(String actor) {
        theActorCalled(actor).attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Lotes","Gestionar Especificaciónes"),
                CrearUnaNuevaEspecificacion.delLote()

        );
    }

    @Entonces("debe ver como resultado4 un mensaje4 dentro de {string}")
    public void debeVerComoResultado4UnMensaje4DentroDe(String string) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).contains(string),
                Ensure.that(RESULTADOS_BUSQUEDA_LOTES).contains(string),
                Ensure.that(P_MENSAJE).hasTextContent("1234")


        );
    }

    @Cuando("un usuario {string} edita las especificaciones de un lote en linea-de-vida")
    public void unUsuarioEditaLasEspecificacionesDeUnLoteEnLineaDeVida(String actor) {
        theActorCalled(actor).attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Lotes","Gestionar Especificaciónes"),
                EditarlasEspecificaciones.delLote()

        );
    }


    @Entonces("debe ver como resultado5 un mensaje5 dentro de {string}")
    public void debeVerComoResultado5UnMensaje5DentroDe(String string) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).contains(string),
                Ensure.that(RESULTADOS_BUSQUEDA_LOTES).contains(string),
                Ensure.that(P_MENSAJE).hasTextContent("qwe")


        );
    }

    @Cuando("un usuario {string} ve los detalles de las especificaciones de un lote en linea-de-vida")
    public void unUsuarioVeLosDetallesDeLasEspecificacionesDeUnLoteEnLineaDeVida(String actor) {
        theActorCalled(actor).attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Lotes","Gestionar Especificaciónes"),
                VerEnElDetalleDeLasEspecificaciones.suInformacion()

        );
    }


    @Entonces("debe ver como como resultado6 una pantalla1 con los datos de las especificaciones dentro de {string}")
    public void debeVerComoComoResultado6UnaPantalla1ConLosDatosDeLasEspecificacionesDentroDe(String string) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).contains(string),
                Ensure.that(RESULTADOS_BUSQUEDA_LOTES).contains(string),
                Ensure.that(P_MENSAJE).hasTextContent("qwe")

        );
    }

    @Cuando("un usuario {string} elimina una especificacion en linea-de-vida")
    public void unUsuarioEliminaUnaEspecificacionEnLineaDeVida(String actor) {
        theActorCalled(actor).attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Lotes","Gestionar Especificaciónes"),
                EliminarUnaEspecificacion.delLote()
        );
    }

    @Entonces("debe ver como resultado7 un mensaje7 dentro de  {string}")
    public void debeVerComoResultado7UnMensaje7DentroDe(String string) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).contains(string),
                Ensure.that(RESULTADOS_BUSQUEDA_LOTES).contains(string),
                Ensure.that(P_MENSAJE).hasTextContent("wer")

        );
    }




}
