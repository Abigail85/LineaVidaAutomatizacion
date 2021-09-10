package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.LineaDeVidaHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoguearseEn implements Task {


    public LoguearseEn() {  }

    public static Performable laPagina() { return instrumented(LoguearseEn.class); }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(LINEA_VIDA_HOME_PAGE),
                Click.on(A_INGRESAR_LOGIN),
                Enter.theValue("Admin@lineadevida.com").into(INPUT_USUARIO),
                Enter.theValue("123456").into(INPUT_PASSWORD),
                Click.on(BUTTON_INGRESAR)


        );
    }
}
