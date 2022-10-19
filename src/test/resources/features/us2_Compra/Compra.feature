#language: es
@Epica: 1-GestionDeUsuariosDeAcceso @US:1
Característica: US2_Compras

  @TC:1
  Escenario: US1_Compras - Realizar la compra de un articulo y validar el precio del mismo
    Dado que el usuario "autorizado" se encuentra conectado al sitio
    Cuando el usuario selecciona blusa de mujer en el menú
    Entonces el usuario visualiza la sección blusas
    Y el usuario visualiza que hay 1 blusa
    Cuando el usuario selecciona comprar 1 blusa
    Entonces el usuario visualiza que el precio de cada una es de U$D 27.00
    Y que el precio del envío es de U$D 2.00
    Y que el precio total es de U$D 29.00
    Cuando el usuario continua con la compra
    Entonces observa que los precios se corresponden
    Cuando continua con la compra y acepta los términos del servicio
    Y selecciona realizar el pago por transferencia bancaria
    Y el usuario confirma la compra
    Entonces visualiza que debe transferir el monto total de la compra