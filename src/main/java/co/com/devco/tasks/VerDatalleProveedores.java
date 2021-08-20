package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static co.com.devco.userinterfaces.LineaDeVidaVerDetallesProveedoresPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerDatalleProveedores implements Task {


    public VerDatalleProveedores( ) {  }

    public static Performable laPalabra() {
        return instrumented(VerDatalleProveedores.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(VER_DETALLES_PROVEEDOR),
                Click.on(CERRAR_DETALLES)




        );
    }
}
