package com.frontend.trainingProyect.screenplay.global.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navegar implements Task {
    private final Class<? extends PageObject> page;

    public Navegar(Class<? extends PageObject> page) {
        this.page = page;
    }

    public static Navegar hacia(Class<? extends PageObject> page){
        return instrumented(Navegar.class, page);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {

        theActor.attemptsTo(Open.browserOn().the(page));
    }
}
