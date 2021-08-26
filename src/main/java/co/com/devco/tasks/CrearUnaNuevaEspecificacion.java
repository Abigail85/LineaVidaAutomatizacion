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
                Click.on(NUEVA_ESPECIFICACION),
                Click.on(INGRESAR_ID_ESPECIFICACION),
                Enter.theValue(DIGITAR_ID_ESPECIFICACION).into(INGRESAR_ID_ESPECIFICACION),
                Click.on(INGRESAR_ID_LOTE),
                Click.on(INGRESAR_COLOR),
                Click.on(INGRESAR_CANTIDAD_TALLA_XS),
                Enter.theValue(DIGITAR_CANTIDAD_TALLA_XS).into(INGRESAR_CANTIDAD_TALLA_XS),
                Click.on(INGRESAR_CANTIDAD_TALLA_S),
                Enter.theValue(DIGITAR_CANTIDAD_TALLA_S).into(INGRESAR_CANTIDAD_TALLA_S),
                Click.on(GUARDAR)



        );
    }
}
