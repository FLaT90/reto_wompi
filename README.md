# Autor: Luis Carlos Mora Vargas
#### https://www.linkedin.com/in/luis-mora-a17b91227/
##### ------------------------------------------------------------------------------------------------------
# Automation API -REST 
##### ------------------------------------------------------------------------------------------------------

#### URL BASE a consumir: https://api.co.uat.wompi.dev/v1
#### URI - GET: https://api.co.uat.wompi.dev/v1/merchants/
#### URI - POST: https://api.co.uat.wompi.dev/v1/transactions
#### LLAVES: pub_stagtest_g2u0HQd3ZMh05hsSgTS2lUV8t3s4mOt7,
prv_stagtest_5i0ZGIGiFcDQifYsXxvsny7Y37tKqFWg,
stagtest_events_2PDUmhMywUkvb1LvxYnayFbmofT7w39N,
stagtest_integrity_nAIBuqayW70XpUqJS4qf4STYiISd89Fp

#### Funciones automatizadas: GET, POST
#### Patron de diseño: Screenplay
#### Framework: gherkin, cucumber, Junit, Serenity-Rest, API-REST
#### Framework adicionales: SonarLink, cucumber for java
#### Lenguaje programacion: Java
#### version gradle: gradle-8.4
#### OPEN_JDK Version 17.0.9
#### ID: Intellij IDEA community Edition 2023.1
##### ------------------------------------------------------------------------------------------------------


# PASOS PARA LA EJECUCIÓN

## Opcion 1
### PASO A PASO PARA LA EJECUCIÓN POR CONSOLA

### Comando para limpiar el proyecto y luego ejecuta TODOS los escenarios uno por uno
#### ./gradlew clean test

### Comando para ejecutar por feature
#### ./gradlew test --tests "co.com.screenplay.project.runners.GetRunner"
#### ./gradlew test --tests "co.com.screenplay.project.runners" --- TODO LOS FEATURES

### Comando para generar reporte despues que haya terminado un test (Por consola arrojara la ruta .html )
#### ./gradlew reports

### Comando para limpiar la carpeta Target (Reportes)
#### ./gradlew clearReports
