package com.frontend.trainingProyect.steps.global;

import com.frontend.trainingProyect.screenplay.ScreenplaySetup;
import com.frontend.trainingProyect.screenplay.global.abilities.Loguearse;
import com.frontend.trainingProyect.screenplay.global.elements.pages.Home;
import com.frontend.trainingProyect.screenplay.global.tasks.Navegar;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.Actor;



public class InicializacionStepsDef {

    private Actor elUsuario;

    @Before
    public void setTheStage() {
        elUsuario = ScreenplaySetup.montarElEscenario("usuarioAutorizado").obtenerActor();
    }

    @Dado("que el usuario tiene la habilidad de loguearse como {string}")
    public void queElUsuarioTieneLaHabilidadDeLoguearseComo(String usuario) {
        elUsuario.can(Loguearse.conCredencialesDe(usuario));
    }

    @Dado("que el usuario se encuentra en la pantalla inicial")
    public void queElUsuarioSeEncuentraEnLaPantallaInicial() {
        elUsuario.wasAbleTo(Navegar.hacia(Home.class));
    }

}
