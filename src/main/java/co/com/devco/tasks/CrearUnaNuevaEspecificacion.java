package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.devco.userinterfaces.LineaDeVidaCrearEspecificacionPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearUnaNuevaEspecificacion implements Task {


    public CrearUnaNuevaEspecificacion( ) {  }

    public static Performable delLote() {
        return instrumented(CrearUnaNuevaEspecificacion.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(A_NUEVA_ESPECIFICACION),
                Enter.theValue("1").into(INPUT_ID_ESPECIFICACION),
                Click.on(SELECT_OPTION_ID_LOTE),
                Click.on(SELECT_OPTION_COLOR),
                Enter.theValue("30").into(INPUT_CANTIDAD_TALLA_XXS),
                Click.on(INPUT_CANTIDAD_TALLA_S),
                Enter.theValue("12").into(INPUT_CANTIDAD_TALLA_S),
                Click.on(GUARDAR)



        );
    }
}
