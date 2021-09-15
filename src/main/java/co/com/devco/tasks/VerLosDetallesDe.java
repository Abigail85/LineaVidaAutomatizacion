package co.com.devco.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;



import static co.com.devco.userinterfaces.LineaDeVidaVerDetallesPage.*;
import static co.com.devco.userinterfaces.LineaDeVidaVerDetallesResultadosPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerLosDetallesDe implements Task {
    final String string;

    public VerLosDetallesDe(String string) {
        this.string = string;
    }

    public static Performable laInformacionDe(String string) {
        return instrumented(VerLosDetallesDe.class, string);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(A_VER_DETALLES.of(string)),
                WaitUntil.the(RESULTADO,isVisible()).forNoMoreThan(30).seconds()

        );
    }


}
