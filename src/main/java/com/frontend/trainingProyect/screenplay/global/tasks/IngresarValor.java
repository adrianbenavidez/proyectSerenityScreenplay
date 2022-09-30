package com.frontend.trainingProyect.screenplay.global.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarValor implements Task {
    private final String valor;
    private final Target campo;

    public IngresarValor(String valor, Target campo) {
        this.valor = valor;
        this.campo = campo;
    }

    public static IngresarValor en(String valor, Target campo){
        return instrumented(IngresarValor.class, valor, campo);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {

        theActor.attemptsTo(WaitUntil.the(campo,isVisible()).forNoMoreThan(30).seconds());
        theActor.attemptsTo(Enter.theValue(valor).into(campo));
    }
}
