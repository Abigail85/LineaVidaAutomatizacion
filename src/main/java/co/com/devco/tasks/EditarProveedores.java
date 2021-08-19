package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.devco.userinterfaces.LineaDeVidaEditarProveedoresPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditarProveedores implements Task {


    public EditarProveedores( ) {  }

    public static Performable laPalabra() {
        return instrumented(EditarProveedores.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EDITAR_PROVEEDOR),
                Click.on(EDITAR_NOMBRE_ENCARGADA_PRODUCCION),
                Enter.theValue(DIGITAR_NUEVO_NOMBRE_ENCARGADA_PRODUCCION).into(EDITAR_NOMBRE_ENCARGADA_PRODUCCION),
                Click.on(ACTUALIZAR)




        );
    }
}
