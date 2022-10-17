package com.frontend.trainingProyect.screenplay.global.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;


public class ElTexto implements Question<String> {
    private final Target campo;

    public ElTexto(Target campo) {
        this.campo = campo;
    }

    public static ElTexto de(Target campo) {
        return Instrumented.instanceOf(ElTexto.class).withProperties(campo);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(campo).viewedBy(actor).asString();
    }
}
