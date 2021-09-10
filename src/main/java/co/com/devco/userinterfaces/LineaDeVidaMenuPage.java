package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class LineaDeVidaMenuPage {
	public static final Target SPAM_NOMBRE_MENU = Target.the(" menu '{0}'").locatedBy("//span[text()='{0}']");
	public static final Target A_NOMBRE_SUB_MENU = Target.the(" submenu '{0}'").locatedBy("//a[text()='{0}']");


}
