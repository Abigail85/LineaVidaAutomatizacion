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
                Click.on(A_EDITAR_ESPECIFICACION),
                Click.on(INPUT_MODIFICAR_TALLA),
                Enter.theValue("15").into(INPUT_MODIFICAR_TALLA),
                Click.on(GUARDAR)




        );
    }
}
