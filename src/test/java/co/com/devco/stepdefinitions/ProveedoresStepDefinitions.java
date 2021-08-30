package co.com.devco.stepdefinitions;

import co.com.devco.tasks.*;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;



import static co.com.devco.userinterfaces.LineaDeVidaAccionesProveedoresResultadosPage.RESULTADOS_DIFERENTES_ACCIONES_PROVEEDORES;
import static co.com.devco.userinterfaces.LineaDeVidaHomeResultadosPage.RESULTADOS_BUSQUEDA_HOME;
import static co.com.devco.userinterfaces.LineaDeVidaProveedoresResultadosPage.RESULTADOS_BUSQUEDA_PROVEEDORES;




import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ProveedoresStepDefinitions {


    @Cuando("un usuario {string} crea un Proveedor en linea-de-vida")
    public void unUsuarioCreaUnProveedorEnLineaDeVida(String actor) {
        theActorCalled(actor).attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Proveedores"),
                NavegarPorElSubMenu.hacia("Gestionar Proveedores"),
                CrearNuevosProveedores.enLaPagina()

        );
    }

    @Entonces("debe ver como resultado un mensaje dentro de {string}")
    public void debeVerComoResultadoUnMensajeDentroDe(String string) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).contains(string),
                Ensure.that(RESULTADOS_BUSQUEDA_PROVEEDORES).contains(string),
                Ensure.that(RESULTADOS_DIFERENTES_ACCIONES_PROVEEDORES).contains(string)


        );
    }

    @Cuando("un usuario {string} edita  un  Proveedor en linea-de-vida")
    public void unUsuarioEditaUnProveedorEnLineaDeVida(String actor) {
        theActorCalled(actor).attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Proveedores"),
                NavegarPorElSubMenu.hacia("Gestionar Proveedores"),
                EditarElProveedor.enLaPagina()

        );
    }

    @Entonces("debe ver como resultado1 un mensaje1 dentro de {string}")
    public void debeVerComoResultado1UnMensaje1DentroDe(String string) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).contains(string),
                Ensure.that(RESULTADOS_BUSQUEDA_PROVEEDORES).contains(string),
                Ensure.that(RESULTADOS_DIFERENTES_ACCIONES_PROVEEDORES).contains(string)


        );
    }
    @Cuando("un usuario {string} ve los detalles de un Proveedor en linea-de-vida")
    public void unUsuarioVeLosDetallesDeUnProveedorEnLineaDeVida(String actor) {
        theActorCalled(actor).attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Proveedores"),
                NavegarPorElSubMenu.hacia("Gestionar Proveedores"),
                VerEnElDetalleDeLosProveedores.suInformacion()

        );
    }


    @Entonces("debe ver como como resultado2 una pantalla con los datos del proveedor dentro de {string}")
    public void debeVerComoComoResultado2UnaPantallaConLosDatosDelProveedorDentroDe(String string) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).contains(string),
                Ensure.that(RESULTADOS_BUSQUEDA_PROVEEDORES).contains(string),
                Ensure.that(RESULTADOS_DIFERENTES_ACCIONES_PROVEEDORES).contains(string)

        );
    }



    @Cuando("un usuario {string} elimina un  Proveedor en linea-de-vida")
    public void unUsuarioEliminaUnProveedorEnLineaDeVida(String actor) {
        theActorCalled(actor).attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Proveedores"),
                NavegarPorElSubMenu.hacia("Gestionar Proveedores"),
                EliminarUnProveedor.enLaPagina()
        );
    }

    @Entonces("debe ver como resultado3 un mensaje3 dentro de {string}")
    public void debeVerComoResultado3UnMensaje3DentroDe(String string) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).contains(string),
                Ensure.that(RESULTADOS_BUSQUEDA_PROVEEDORES).contains(string),
                Ensure.that(RESULTADOS_DIFERENTES_ACCIONES_PROVEEDORES).contains(string)

        );
    }


    }
