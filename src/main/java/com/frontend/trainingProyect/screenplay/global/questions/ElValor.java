package com.frontend.trainingProyect.screenplay.global.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;


public class ElValor implements Question<String> {
    private final Target campo;

    public ElValor(Target campo) {
        this.campo = campo;
    }

    public static ElValor de(Target campo) {
        return Instrumented.instanceOf(ElValor.class).withProperties(campo);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(campo).viewedBy(actor).asString();
    }
}
