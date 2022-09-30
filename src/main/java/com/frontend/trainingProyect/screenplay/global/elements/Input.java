package com.frontend.trainingProyect.screenplay.global.elements;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Input {

    public static Target AR_EMAIL = Target.the("Input del email").located(By.id("email"));
    public static Target AR_PASSWORD = Target.the("Input del password ").located(By.id("passwd"));

}
