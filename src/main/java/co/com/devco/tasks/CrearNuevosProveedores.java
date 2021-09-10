package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.devco.userinterfaces.LineaDeVidaCrearProveedoresPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearNuevosProveedores implements Task {


    public CrearNuevosProveedores() {
    }

    public static Performable enLaPagina() {
        return instrumented(CrearNuevosProveedores.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(A_NUEVO_PROVEEDOR),
                Enter.theValue("811031385").into(INPUT_NIT),
                Enter.theValue("MODA AVANZADA S.A").into(INPUT_NOMBRE_PROVEEDOR),
                Enter.theValue("Centro de la moda del centro").into(INPUT_DIRECCION),
                Enter.theValue("3228138").into(INPUT_TELEFONO),
                Enter.theValue("Isabel").into(INPUT_NOMBRE_ENCARGADA_PRODUCCION),
                Click.on(GUARDAR)
        );
    }
}
