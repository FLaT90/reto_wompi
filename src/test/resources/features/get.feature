#author: Luis Carlos Mora Vargas
#language: es

Característica: Consumo GET con serenity-rest

  Yo como cliente
  Quiero realizar el consumo a un servicio de wompi de tipo get
  Para obtener el token de aceptacion necesario para realizar una transaccion

  Antecedentes:
    Dado "Cliente" obtiene la baseurl de la api

  @Successful
  Escenario: Obtener(get) los datos que arroje el consumo de la api
    Cuando configura la peticion a consumir
    Entonces valida estado de la peticion
