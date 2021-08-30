package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.devco.userinterfaces.LineaDeVidaEditarEspecificacionPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditarlasEspecificaciones implements Task {


    public EditarlasEspecificaciones( ) {  }

    public static Performable delLote() {
        return instrumented(EditarlasEspecificaciones.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EDITAR_ESPECIFICACION),
                Click.on(TALLA_A_MODIFICAR),
                Enter.theValue(DIGITAR_NUEVA_CANTIDAD).into(TALLA_A_MODIFICAR),
                Click.on(GUARDAR)




        );
    }
}
