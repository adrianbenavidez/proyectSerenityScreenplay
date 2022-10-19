package com.frontend.trainingProyect.screenplay.global.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class HacerClick implements Task {
    private final Target campo;

    public HacerClick(Target campo) {
        this.campo = campo;
    }

    public static HacerClick en(Target campo){
        return instrumented(HacerClick.class, campo);
    }

    @Step("El {0} hace click en el campo #campo")
    @Override
    public <T extends Actor> void performAs(T theActor) {

        theActor.attemptsTo(WaitUntil.the(campo,isClickable()).forNoMoreThan(30).seconds());
        theActor.attemptsTo(Click.on(campo));
    }
}
