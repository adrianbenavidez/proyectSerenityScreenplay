package com.frontend.trainingProyect.screenplay.global.elements;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Boton {

    public static Target SIGN_IN = Target.the("Botón de inciar sesión").located(By.id("SubmitLogin"));

}
