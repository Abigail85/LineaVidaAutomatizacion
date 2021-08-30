package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.devco.userinterfaces.LineaDeVidaCrearProveedoresPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearNuevosProveedores implements Task {


    public CrearNuevosProveedores( ) {  }

    public static Performable enLaPagina() {
        return instrumented(CrearNuevosProveedores.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NUEVO_PROVEEDOR),
                Click.on(INGRESAR_NIT),
                Enter.theValue(DIGITAR_NIT).into(INGRESAR_NIT),
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
