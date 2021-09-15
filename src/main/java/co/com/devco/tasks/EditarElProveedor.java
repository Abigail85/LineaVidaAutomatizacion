package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.devco.userinterfaces.LineaDeVidaEditarProveedoresPage.*;
import static co.com.devco.userinterfaces.LineaDeVidaEditarPage.A_EDITAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditarElProveedor implements Task {
final String string;

    public EditarElProveedor(String string ) {
        this.string=string;
    }

    public static Performable enLaPagina(String string) {

        return instrumented(EditarElProveedor.class,string);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(A_EDITAR.of(string)),
                Enter.theValue("Isabel").into(INPUT_NOMBRE_ENCARGADA_PRODUCCION),
                Click.on(BUTTON_ACTUALIZAR)




        );
    }
}
