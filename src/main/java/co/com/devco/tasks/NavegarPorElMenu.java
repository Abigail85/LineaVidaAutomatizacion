package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterfaces.LineaDeVidaMenuPage.A_NOMBRE_SUB_MENU;
import static co.com.devco.userinterfaces.LineaDeVidaMenuPage.SPAM_NOMBRE_MENU;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavegarPorElMenu implements Task {
     String menu;
     String submenu;

    public NavegarPorElMenu( String menu, String submenu) {
        this.menu = menu;
        this.submenu = submenu;

    }

    public static Performable hacia(String menu,String submenu) {
        return instrumented(NavegarPorElMenu.class, menu,submenu);

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SPAM_NOMBRE_MENU.of(menu)),
                Click.on(A_NOMBRE_SUB_MENU.of(submenu))

        );
    }



}
