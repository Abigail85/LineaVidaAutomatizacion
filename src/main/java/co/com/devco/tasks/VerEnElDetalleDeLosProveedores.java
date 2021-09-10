package co.com.devco.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static co.com.devco.userinterfaces.LineaDeVidaVerDetallesProveedoresPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerEnElDetalleDeLosProveedores implements Task {
final String string;

    public VerEnElDetalleDeLosProveedores(String string ) {this.string=string;  }

    public static Performable suInformacion(String string) {return instrumented(VerEnElDetalleDeLosProveedores.class,string); }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(A_VER_DETALLES_PROVEEDOR.of(string))








        );
    }
}
