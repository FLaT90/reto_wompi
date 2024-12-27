#author: Luis Carlos Mora Vargas
#language: es


Característica: Consumo POST con serenity-rest

  Yo como cliente
  Quiero realizar el consumo a un servicio de wompi de tipo post
  Para realizar una transaccion mediante nequi

  Antecedentes:
    Dado "Cliente" obtiene la baseurl de la api

  @Successful
  Escenario: Enviar(post) los datos que arroje el consumo de la api
    Cuando configura la solicitud a consumir
    Entonces valida los datos consultados
