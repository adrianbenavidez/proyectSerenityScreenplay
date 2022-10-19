package com.frontend.trainingProyect.screenplay.global.elements;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Label {

    public static Target AUTHENTICATION = Target.the("Título AUTHENTICATION").located(By.xpath("//h1[contains(text(),'Authentication')]"));
    public static Target CREATE_AN_ACCOUNT = Target.the("Título CREATE AN ACCCOUNT").located(By.xpath("//h3[contains(text(),'Create an account')]"));
    public static Target ALREADY_REGISTERED = Target.the("Título ALREADY REGISTERED").located(By.xpath("//h3[contains(text(),'Already registered?')]"));
    public static Target PLEASE_ENTER_YOUR_EMAIL = Target.the("Texto: Please enter your email address to create an account").located(By.xpath("//p[contains(text(),'Please enter your')]"));
    public static Target AR_EMAIL_ADDRESS = Target.the("EMAIL ADDRESS en la sección CREATE AN ACCOUNT").located(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/label[1]"));
    public static Target CA_EMAIL_ADDRESS = Target.the("EMAIL ADDRESS en la sección ALREADY REGISTERED").located(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/label[1]"));
    public static Target PASSWORD = Target.the("Título PASSWORD en la sección ALREADY REGISTERED").located(By.xpath("//label[contains(text(),'Password')]"));

    public static Target ERROR_LOGIN = Target.the("Mensaje de error en el login").located(By.xpath("//*[@id='center_column']/div[1]/ol/li"));


}
