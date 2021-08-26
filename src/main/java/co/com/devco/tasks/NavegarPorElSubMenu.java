package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.devco.userinterfaces.LineaDeVidaMenuPage.LBL_NAME_MENU;
import static co.com.devco.userinterfaces.LineaDeVidaSubMenuPage.LBL_NAME_SUB_MENU;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavegarPorElSubMenu implements Task {
    private String string;

    public NavegarPorElSubMenu(String string) { this.string = string; }

    public static Performable hacia(String string) {
        return instrumented(NavegarPorElSubMenu.class, string);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LBL_NAME_SUB_MENU.of(string)),
                Click.on(LBL_NAME_SUB_MENU.of(string))

        );
    }



}
