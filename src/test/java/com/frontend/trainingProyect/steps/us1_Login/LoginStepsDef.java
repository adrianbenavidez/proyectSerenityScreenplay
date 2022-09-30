package com.frontend.trainingProyect.steps.us1_Login;

import com.frontend.trainingProyect.screenplay.ScreenplaySetup;
import com.frontend.trainingProyect.screenplay.global.abilities.Loguearse;
import com.frontend.trainingProyect.screenplay.global.elements.Boton;
import com.frontend.trainingProyect.screenplay.global.elements.Input;
import com.frontend.trainingProyect.screenplay.global.elements.Menu;
import com.frontend.trainingProyect.screenplay.global.tasks.HacerClick;
import com.frontend.trainingProyect.screenplay.global.tasks.IngresarValor;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;


public class LoginStepsDef {

    private Actor elUsuario;

    @Before
    public void setTheStage() {
        elUsuario = ScreenplaySetup.montarElEscenario("usuarioAutorizado").obtenerActor();
    }

    @Cuando("el usuario selecciona el menu iniciar sesión")
    public void elUsuarioSeleccionaElMenuIniciarSesion() {
        elUsuario.attemptsTo(HacerClick.en(Menu.SIGN_IN));
    }

    @Cuando("el usuario completa los campos email y contraseña")
    public void elUsuarioCompletaLosCamposEmailYContrasena() {
        elUsuario.attemptsTo(IngresarValor.en(Loguearse.como(elUsuario).getNombreUsuario(), Input.AR_EMAIL));
        elUsuario.attemptsTo(IngresarValor.en(Loguearse.como(elUsuario).getContraseniaUsuario(), Input.AR_PASSWORD));
    }

    @Cuando("selecciona el botón para inciar sesión")
    public void seleccionaElBotonParaInciarSesion() {
        elUsuario.attemptsTo(HacerClick.en(Boton.SIGN_IN));
    }

    @Entonces("se encuentra en la pagina de login y visualiza los campos de Authenticacion, crear cuenta, e iniciar sesión")
    public void seEncuentraEnLaPaginaDeLoginYVisualizaLosCamposDeAuthenticacionCrearCuentaEIniciarSesion() {
    }

    @Entonces("el usuario se loguea correctamente")
    public void elUsuarioSeLogueaCorrectamente() {
    }

    @Entonces("visualiza la pantalla de inicio con su nombre")
    public void visualizaLaPantallaDeInicioConSuNombre() {
    }

    @Entonces("visualiza el botón Sign out")
    public void visualizaElBotonSignOut() {
    }


}
