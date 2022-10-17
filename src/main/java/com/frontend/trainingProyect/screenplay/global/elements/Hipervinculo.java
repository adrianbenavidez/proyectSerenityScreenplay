package com.frontend.trainingProyect.screenplay.global.elements;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Hipervinculo {

    public static Target FORGOT_YOUR_PASSWORD = Target.the("Hipervinculo Forgot your password").located(By.xpath("//a[contains(text(),'Forgot your password?')]"));

}
