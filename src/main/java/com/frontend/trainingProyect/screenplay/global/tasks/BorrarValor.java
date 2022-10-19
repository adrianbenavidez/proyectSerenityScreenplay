package com.frontend.trainingProyect.screenplay.global.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BorrarValor implements Task {
    private final Target campo;

    public BorrarValor(Target campo) {
        this.campo = campo;
    }

    public static BorrarValor de(Target campo) {
        return instrumented(BorrarValor.class, campo);
    }

    @Step("El {0} borra el valor del campo #campo")
    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Clear.field(campo));
    }
}
