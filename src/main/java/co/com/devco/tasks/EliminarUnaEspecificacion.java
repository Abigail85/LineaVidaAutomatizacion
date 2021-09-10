package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterfaces.LineaDeVidaEliminarEspecificacionesLotePage.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EliminarUnaEspecificacion implements Task {


    public EliminarUnaEspecificacion( ) {  }

    public static Performable delLote() {
        return instrumented(EliminarUnaEspecificacion.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(A_ELIMINAR_ESPECIFICACION),
                Click.on(BUTTON_CONFIRMAR_ELIMINAR)



        );
    }
}
