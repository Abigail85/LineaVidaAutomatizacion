package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterfaces.LineaDeVidaEliminarProveedoresPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EliminarUnProveedor implements Task {


    public EliminarUnProveedor( ) {  }

    public static Performable enLaPagina() {
        return instrumented(EliminarUnProveedor.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ELIMINAR_PROVEEDOR),
                Click.on(CONFIRMAR)



        );
    }
}
