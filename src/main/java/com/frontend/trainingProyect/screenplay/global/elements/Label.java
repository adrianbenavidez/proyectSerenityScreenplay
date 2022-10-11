package com.frontend.trainingProyect.screenplay.global.elements;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Label {

    public static Target AUTHENTICATION = Target.the("Título AUTHENTICATION").located(By.xpath("//h1[contains(text(),'Authentication')]"));


}
