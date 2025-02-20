Autor: Juan Carlos Gonzalez Ortiz

www.linkedin.com/in/juan-carlos-gonzalez-3b566598

# Challenge Karate 
API Testeada: https://petstore.swagger.io/

Base url : petstore.swagger.io/v2

Metodos automatizados en testing : 4

Framework: karate-junit5:1.2.0

Plugins adicionales en Intellij: Karate, Gherkin

Lenguaje programacion: Java

version gradle: gradle-7.6.1

Cucumber: cucumber-reporting:5.7.0

JDK: OPEN_JDK Version 17.0.9

IDE: Intellij IDEA  2024.3.3

#### **_Escenario Propuesto:_**

La página https://petstore.swagger.io/ proporciona la documentación sobre apis de una “PetStore”. Utilizando un software para pruebas de servicios REST realizar las siguientes pruebas, identificando las entradas, capturando las salidas, test, variables, etc, en cada uno de los siguientes casos:

• Añadir una mascota a la tienda
• Consultar la mascota ingresada previamente (Búsqueda por ID)
• Actualizar el nombre de la mascota y el estatus de la mascota a “sold”
• Consultar la mascota modificada por estatus (Búsqueda por estatus)


## **PASOS PARA LA EJECUCIÓN**
1.Tener seteada la variable JAVA_HOME y Gradle(dentro del Path) como variables de sistema

2.Para compilar el proyecto y preparar todo para la ejecución con las respectivas dependencias necesarias, ejecuta el comando: gradle clean build.

3.El proyecto se debe ejecutar en la clase PetRunner.java

## **Reportes**
El proyecto utiliza Cucumber para la generación de reportes , una vez terminada la ejecución a nivel de logs se tendrá
el directorio donde se genera el mismo, que es en el "../build/karate-reports/karate-summary.html" . Este es un reporte gerencial sobre los resultados de la prueba