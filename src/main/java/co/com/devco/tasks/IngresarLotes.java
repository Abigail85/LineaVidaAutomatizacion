package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterfaces.LineaDeVidaLotesPage.MENU_LOTES;
import static co.com.devco.userinterfaces.LineaDeVidaLotesPage.SUB_MENU_GESTIONAR_ESPECIFICACIONES;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarLotes implements Task {


    public IngresarLotes( ) {  }

    public static Performable laPalabra() {
        return instrumented(IngresarLotes.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_LOTES),
                Click.on(SUB_MENU_GESTIONAR_ESPECIFICACIONES)




        );
    }
}
