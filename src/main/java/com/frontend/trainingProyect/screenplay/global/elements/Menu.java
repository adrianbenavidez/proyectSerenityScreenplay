package com.frontend.trainingProyect.screenplay.global.elements;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Menu {

    public static Target SIGN_IN = Target.the("Botón del menú Sign In").located(By.xpath("//a[contains(text(),'Sign in')]"));


}
