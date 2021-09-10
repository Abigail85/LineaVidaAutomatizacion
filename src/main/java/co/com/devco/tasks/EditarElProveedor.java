package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.devco.userinterfaces.LineaDeVidaEditarProveedoresPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditarElProveedor implements Task {


    public EditarElProveedor( ) { }

    public static Performable enLaPagina() {
        return instrumented(EditarElProveedor.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(A_EDITAR_PROVEEDOR),
                Enter.theValue("Isabel").into(INPUT_NOMBRE_ENCARGADA_PRODUCCION),
                Click.on(BUTTON_ACTUALIZAR)




        );
    }
}
