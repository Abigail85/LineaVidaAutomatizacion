package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterfaces.LineaDeVidaEliminarProveedoresPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EliminarProveedores implements Task {


    public EliminarProveedores( ) {  }

    public static Performable laPalabra() {
        return instrumented(EliminarProveedores.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ELIMINAR_PROVEEDOR),
                Click.on(CONFIRMAR)



        );
    }
}
