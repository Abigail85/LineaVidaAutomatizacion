package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterfaces.LineaDeVidaEliminarPage.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EliminarUnaEspecificacion implements Task {
final String string;

    public EliminarUnaEspecificacion( String string) {
        this.string=string;
    }

    public static Performable delLote(String string) {
        return instrumented(EliminarUnaEspecificacion.class,string);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(A_ELIMINAR.of(string)),
                Click.on(BUTTON_CONFIRMAR)



        );
    }
}
