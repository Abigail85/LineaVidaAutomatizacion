package co.com.devco.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;


import java.time.Duration;

import static co.com.devco.userinterfaces.LineaDeVidaVerDetallesProveedoresPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerEnElDetalleDeLosProveedores implements Task {


    public VerEnElDetalleDeLosProveedores( ) {  }

    public static Performable suInformacion() {return instrumented(VerEnElDetalleDeLosProveedores.class); }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(VER_DETALLES_PROVEEDOR),
                MoveMouse.to(RESULTADO.waitingForNoMoreThan(Duration.ofSeconds(30)))







        );
    }
}
