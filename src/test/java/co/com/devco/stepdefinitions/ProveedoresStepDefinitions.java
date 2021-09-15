package co.com.devco.stepdefinitions;

import co.com.devco.tasks.*;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.devco.userinterfaces.LineaDeVidaAccionesDeTodosLosMenusResultadosPage.P_MENSAJE;
import static co.com.devco.userinterfaces.LineaDeVidaHomeResultadosPage.RESULTADOS_BUSQUEDA_HOME;
import static co.com.devco.userinterfaces.LineaDeVidaProveedoresResultadosPage.RESULTADOS_BUSQUEDA_PROVEEDORES;
import static co.com.devco.userinterfaces.LineaDeVidaVerDetallesResultadosPage.RESULTADO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ProveedoresStepDefinitions {


    @Cuando("se crea un proveedor")
    public void seCreaUnProveedor() {
        theActorCalled("admin").attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Proveedores", "Gestionar Proveedores"),
                CrearNuevosProveedores.enLaPagina()

        );
    }

    @Entonces("debe ver como resultado el mensaje {string}")
    public void debeVerComoResultadoElMensaje(String string) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).contains(string),
                Ensure.that(RESULTADOS_BUSQUEDA_PROVEEDORES).contains(string),
                Ensure.that(P_MENSAJE).hasValue("Provedor creado exitosamente.")


        );
    }

    @Cuando("se edita el proveedor con nit {string}")
    public void seEditaUnProveedor(String string) {
        theActorCalled("admin").attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Proveedores", "Gestionar Proveedores"),
                EditarElProveedor.enLaPagina("56778")

        );
    }

    @Entonces("debe ver como resultado el anuncio {string}")
    public void debeVerComoResultadoElAnuncio(String string) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).contains(string),
                Ensure.that(RESULTADOS_BUSQUEDA_PROVEEDORES).contains(string),
                Ensure.that(P_MENSAJE).hasValue("Proveedor editado exitosamente.")
        );
    }

    @Cuando("se ven los detalles del Proveedor con nit {string}")
    public void seVenLosDetallesDelProveedorConNit(String string) {
        theActorCalled("admin").attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Proveedores", "Gestionar Proveedores"),
                VerLosDetallesDe.laInformacionDe("12")

        );
    }

    @Entonces("debe ver como como resultado los datos del proveedor")
    public void debeVerComoComoResultadoLosDatosDelProveedor() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).contains(),
                Ensure.that(RESULTADOS_BUSQUEDA_PROVEEDORES).contains(),
                Ensure.that(RESULTADO).containsElements(toString())

        );
    }

    @Cuando("se elimina un proveedor con nit {string}")
    public void seEliminaUnProveedorConNit(String string) {
      theActorCalled("admin").attemptsTo(
                LoguearseEn.laPagina(),
                NavegarPorElMenu.hacia("Proveedores", "Gestionar Proveedores"),
                EliminarUnProveedor.enLaPagina("811031385")
        );
    }

    @Entonces("debe ver como resultado el aviso {string}")
    public void debeVerComoResultadoElAviso(String string) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTADOS_BUSQUEDA_HOME).contains(string),
                Ensure.that(RESULTADOS_BUSQUEDA_PROVEEDORES).contains(string),
                Ensure.that(P_MENSAJE).hasValue("Proveedor eliminado exitosamente.")

        );
    }


}
