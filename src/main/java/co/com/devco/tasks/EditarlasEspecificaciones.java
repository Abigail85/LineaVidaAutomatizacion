package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.devco.userinterfaces.LineaDeVidaEditarEspecificacionPage.*;
import static co.com.devco.userinterfaces.LineaDeVidaEditarPage.A_EDITAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditarlasEspecificaciones implements Task {
    final String string;

    public EditarlasEspecificaciones(String string ) { this.string=string; }
    public static Performable delLote(String string) {
        return instrumented(EditarlasEspecificaciones.class,string );
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(A_EDITAR.of(string)),
                Click.on(INPUT_MODIFICAR_TALLA),
                Enter.theValue("15").into(INPUT_MODIFICAR_TALLA),
                Click.on(BUTTON_GUARDAR)




        );
    }
}
