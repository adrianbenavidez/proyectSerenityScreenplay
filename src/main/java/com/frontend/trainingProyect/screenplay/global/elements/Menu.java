package com.frontend.trainingProyect.screenplay.global.elements;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Menu {

    public static Target SIGN_IN = Target.the("Botón del menú Sign In").located(By.xpath("//a[contains(text(),'Sign in')]"));
    public static Target NOMBRE = Target.the("Nombre en el menú").located(By.xpath("//span[contains(text(),'testing incluit')]"));
    public static Target SIGN_OUT = Target.the("Botón del menú Sign OUT").located(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a"));



}
