#language: es
  @Epica: 1-GestionDeUsuariosDeAcceso @US:1
  Característica: US1_Login

    @TC:1
    Escenario: US1_Login - Login exitoso
      Dado que el usuario tiene la habilidad de loguearse como "Autorizado"
      Y que el usuario se encuentra en la pantalla inicial
      Cuando el usuario selecciona el menu iniciar sesión
      Entonces se encuentra en la pagina de login y visualiza los campos de Authenticacion, crear cuenta, e iniciar sesión
      Cuando el usuario completa los campos email y contraseña
      Y selecciona el botón para inciar sesión
      Entonces el usuario se loguea correctamente
      Y visualiza la pantalla de inicio con su nombre
      Y visualiza el botón Sign out