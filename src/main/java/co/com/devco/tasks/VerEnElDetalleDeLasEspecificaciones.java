package co.com.devco.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import java.time.Duration;

import static co.com.devco.userinterfaces.LineaDeVidaVerDetallesEspecificacionLotePage.DIV_VER_DETALLES;
import static co.com.devco.userinterfaces.LineaDeVidaVerDetallesEspecificacionLotePage.A_VER_DETALLES_ESPECIFICACIONES;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerEnElDetalleDeLasEspecificaciones implements Task {


    public VerEnElDetalleDeLasEspecificaciones( ) {  }

    public static Performable suInformacion() {return instrumented(VerEnElDetalleDeLasEspecificaciones.class); }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(A_VER_DETALLES_ESPECIFICACIONES),
                MoveMouse.to(DIV_VER_DETALLES.waitingForNoMoreThan(Duration.ofSeconds(30)))







        );
    }
}
