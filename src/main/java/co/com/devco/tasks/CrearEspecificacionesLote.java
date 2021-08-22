package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.devco.userinterfaces.LineaDeVidaCrearProveedoresPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearEspecificacionesLote implements Task {


    public CrearEspecificacionesLote( ) {  }

    public static Performable laPalabra() {
        return instrumented(CrearEspecificacionesLote.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NUEVA_ESPECIFICACION),
                Click.on(INGRESAR_ID_ESPECIFICACION),
                Enter.theValue(DIGITAR_ID_ESPECIFICACION).into(INGRESAR_ID_ESPECIFICACION),
                Click.on(INGRESAR_NOMBRE_PROVEEDOR),
                Enter.theValue(DIGITAR_NOMBRE_PROVEEDOR).into(INGRESAR_NOMBRE_PROVEEDOR),
                Click.on(INGRESAR_DIRECCION),
                Enter.theValue(DIGITAR_DIRECCION).into(INGRESAR_DIRECCION),
                Click.on(INGRESAR_TELEFONO),
                Enter.theValue(DIGITAR_TELEFONO).into(INGRESAR_TELEFONO),
                Click.on(INGRESAR_NOMBRE_ENCARGADA_PRODUCCION),
                Enter.theValue(DIGITAR_NOMBRE_ENCARGADA_PRODUCCION).into(INGRESAR_NOMBRE_ENCARGADA_PRODUCCION),
                Click.on(GUARDAR)



        );
    }
}
