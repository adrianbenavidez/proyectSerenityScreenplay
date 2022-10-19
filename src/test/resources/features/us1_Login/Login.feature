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
      Y selecciona el botón para iniciar sesión
      Entonces el usuario se loguea correctamente
      Y visualiza la pantalla de inicio con su nombre
      Y visualiza el botón Sign out

    @TC:2
    Escenario: US1_Login - Login con datos incompletos
      Dado que el usuario tiene la habilidad de loguearse como "Autorizado"
      Y que el usuario se encuentra en la pantalla inicial
      Cuando el usuario selecciona el menu iniciar sesión
      Y el usuario completa el campo email con su email
      Y selecciona el botón para iniciar sesión
      Entonces el usuario visualiza el mensaje de error en el login "Password is required."
      Cuando el usuario completa el campo contraseña con su contraseña
      Y el usuario borra el contenido del campo email
      Y selecciona el botón para iniciar sesión
      Entonces el usuario visualiza el mensaje de error en el login "An email address required."

    @TC:3
    Escenario: US1_Login - Login con datos invalidos
      Dado que el usuario tiene la habilidad de loguearse como "No Autorizado"
      Y que el usuario se encuentra en la pantalla inicial
      Cuando el usuario selecciona el menu iniciar sesión
      Y el usuario completa los campos email y contraseña
      Y selecciona el botón para iniciar sesión
      Entonces el usuario visualiza el mensaje de error en el login "Authentication failed."



