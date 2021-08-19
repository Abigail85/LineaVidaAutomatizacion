package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.LineaDeVidaProveedoresPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarProveedores implements Task {


    public IngresarProveedores( ) {  }

    public static Performable laPalabra() {
        return instrumented(IngresarProveedores.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_PROVEEDORES),
                Click.on(SUB_MENU_GESTIONAR_PROVEEDORES),
                Click.on(NUEVO_PROVEEDOR)




        );
    }
}
