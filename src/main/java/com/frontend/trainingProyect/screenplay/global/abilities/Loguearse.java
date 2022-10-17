package com.frontend.trainingProyect.screenplay.global.abilities;

import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;

public class Loguearse implements Ability {

    private String usuario;
    private String nombre;
    private String nombreUsuario;
    private String contraseniaUsuario;

    public Loguearse(String usuario) {
        this.usuario = usuario;
        switch (usuario) {
            case "Autorizado":
                this.nombre = tipoDeUsuarios.AUTORIZADO.nombre;
                this.nombreUsuario = tipoDeUsuarios.AUTORIZADO.nombreUsuario;
                this.contraseniaUsuario = tipoDeUsuarios.AUTORIZADO.contraseniaUsuario;
                break;

            case "No Autorizado":
                this.nombre = tipoDeUsuarios.NO_AUTORIZADO.nombre;
                this.nombreUsuario = tipoDeUsuarios.NO_AUTORIZADO.nombreUsuario;
                this.contraseniaUsuario = tipoDeUsuarios.NO_AUTORIZADO.contraseniaUsuario;
                break;
        }
    }

    public static Loguearse conCredencialesDe(String usuario) {
        return new Loguearse(usuario);
    }

    public static Loguearse como(Actor actor) {
        if (actor.abilityTo(Loguearse.class) == null) {
            throw new NoSePuedeLoguearException(actor.getName());
        }
        return actor.abilityTo(Loguearse.class);
    }

    public String getNombre(){
        return nombre;
    }

    public String getNombreUsuario(){
        return nombreUsuario;
    }

    public String getContraseniaUsuario(){
        return contraseniaUsuario;
    }

    public enum tipoDeUsuarios{
        AUTORIZADO("testing incluit","testing@incluit.com","testing"),
        NO_AUTORIZADO("NO_AUTORIZADO","email@invalido.com","passwordInvalida");

        String nombre;
        String nombreUsuario;
        String contraseniaUsuario;

        tipoDeUsuarios(String nombre, String nombreUsuario, String contraseniaUsuario){
            this.nombre = nombre;
            this.nombreUsuario = nombreUsuario;
            this.contraseniaUsuario = contraseniaUsuario;
        }
    }

    private static class NoSePuedeLoguearException extends RuntimeException {
        public NoSePuedeLoguearException(String nombreActor){
            super("El actor " + nombreActor + "no tiene la habilidad de loguearse de esa forma");
        }
    }



}
