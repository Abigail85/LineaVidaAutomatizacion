package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterfaces.LineaDeVidaVerDetallesProveedoresPage.CERRAR_DETALLES;
import static co.com.devco.userinterfaces.LineaDeVidaVerDetallesProveedoresPage.VER_DETALLES_PROVEEDOR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerDetalleEspecificacionLote implements Task {


    public VerDetalleEspecificacionLote( ) {  }

    public static Performable laPalabra() {
        return instrumented(VerDetalleEspecificacionLote.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(VER_DETALLES_PROVEEDOR),
                Click.on(CERRAR_DETALLES)




        );
    }
}
