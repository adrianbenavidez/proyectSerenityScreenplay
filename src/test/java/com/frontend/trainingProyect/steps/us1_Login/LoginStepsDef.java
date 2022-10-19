package com.frontend.trainingProyect.steps.us1_Login;

import com.frontend.trainingProyect.screenplay.ScreenplaySetup;
import com.frontend.trainingProyect.screenplay.global.abilities.Loguearse;
import com.frontend.trainingProyect.screenplay.global.elements.*;
import com.frontend.trainingProyect.screenplay.global.questions.ElTexto;
import com.frontend.trainingProyect.screenplay.global.tasks.BorrarValor;
import com.frontend.trainingProyect.screenplay.global.tasks.HacerClick;
import com.frontend.trainingProyect.screenplay.global.tasks.IngresarValor;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.core.IsEqual.equalTo;


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

    @Y("selecciona el botón para iniciar sesión")
    public void seleccionaElBotonParaIniciarSesion() {
        elUsuario.attemptsTo(HacerClick.en(Boton.SIGN_IN));
    }

    @Cuando("el usuario completa el campo email con su email")
    public void elUsuarioCompletaElCampoEmailConSuEmail() {
        elUsuario.attemptsTo(IngresarValor.en(Loguearse.como(elUsuario).getNombreUsuario(), Input.AR_EMAIL));
    }

    @Cuando("el usuario completa el campo contraseña con su contraseña")
    public void elUsuarioCompletaElCampoContraseniaConSuContrasenia() {
        elUsuario.attemptsTo(IngresarValor.en(Loguearse.como(elUsuario).getContraseniaUsuario(), Input.AR_PASSWORD));
    }

    @Y("el usuario borra el contenido del campo email")
    public void elUsuarioBorraElContenidoDelCampoEmail() {
        elUsuario.attemptsTo(BorrarValor.de(Input.AR_EMAIL));
    }

    @Entonces("se encuentra en la pagina de login y visualiza los campos de Authenticacion, crear cuenta, e iniciar sesión")
    public void seEncuentraEnLaPaginaDeLoginYVisualizaLosCamposDeAuthenticacionCrearCuentaEIniciarSesion() {

        // En caso de querer ver si es visible o no el elemento
/*  elUsuario.should(
               seeThat(the(Label.AUTHENTICATION), isVisible()),
               seeThat(the(Label.ALREADY_REGISTERED), isVisible()),
                seeThat(the(Label.AR_EMAIL_ADDRESS), isVisible()),
               seeThat(the(Label.CA_EMAIL_ADDRESS), isVisible()),
               seeThat(the(Label.PASSWORD), isVisible()),
               seeThat(the(Label.CREATE_AN_ACCOUNT), isVisible()),
               seeThat(the(Label.PLEASE_ENTER_YOUR_EMAIL), isVisible()),
               seeThat(the(Hipervinculo.FORGOT_YOUR_PASSWORD), isVisible()));*/

        elUsuario.should(
                seeThat(ElTexto.de(Label.AUTHENTICATION), equalTo("AUTHENTICATION")),
                seeThat(ElTexto.de(Label.ALREADY_REGISTERED), equalTo("ALREADY REGISTERED?")),
                seeThat(ElTexto.de(Label.AR_EMAIL_ADDRESS), equalTo("Email address")),
                seeThat(ElTexto.de(Label.CA_EMAIL_ADDRESS), equalTo("Email address")),
                seeThat(ElTexto.de(Label.PASSWORD), equalTo("Password")),
                seeThat(ElTexto.de(Label.CREATE_AN_ACCOUNT), equalTo("CREATE AN ACCOUNT")),
                seeThat(ElTexto.de(Label.PLEASE_ENTER_YOUR_EMAIL), equalTo("Please enter your email address to create an account.")),
                seeThat(ElTexto.de(Hipervinculo.FORGOT_YOUR_PASSWORD), equalTo("Forgot your password?"))
        );
    }

    @Entonces("el usuario se loguea correctamente")
    public void elUsuarioSeLogueaCorrectamente() {
    }

    @Entonces("visualiza la pantalla de inicio con su nombre")
    public void visualizaLaPantallaDeInicioConSuNombre() {
        elUsuario.should(seeThat(ElTexto.de(Menu.NOMBRE), equalTo(Loguearse.como(elUsuario).getNombre())));
    }

    @Entonces("visualiza el botón Sign out")
    public void visualizaElBotonSignOut() {
        elUsuario.should(seeThat(the(Menu.SIGN_OUT), isVisible()));
    }

    @Entonces("el usuario visualiza el mensaje de error en el login {string}")
    public void elUsuarioVisualizaElMensajeDeErrorEnElLogin(String mensaje) {
        elUsuario.should(seeThat(ElTexto.de(Label.ERROR_LOGIN), equalTo(mensaje)));
    }
}
