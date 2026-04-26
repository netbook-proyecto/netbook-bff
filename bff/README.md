# netBOOK - BFF (Backend For Frontend)

Este repositorio contiene el Backend For Frontend (BFF) del proyecto netBOOK para el Colegio Bernardo O'Higgins, desarrollado bajo una arquitectura de microservicios con Spring Boot.

## Requisitos Previos
* Java 21
* Maven
* MySQL

## Instrucciones de Instalación y Ejecución

1. **Clonar el repositorio:**
   ```bash
   git clone [https://github.com/netbook-proyecto/netbook-bff.git](https://github.com/netbook-proyecto/netbook-bff.git)
Configuración de Base de Datos: Abre el archivo src/main/resources/application.properties y verifica que las credenciales (spring.datasource.username y spring.datasource.password) coincidan con tu servidor MySQL local.

Ejecutar el Proyecto: Abre el proyecto en Visual Studio Code y ejecuta la aplicación dándole "Play" a la clase principal, o utiliza este comando de Maven en tu terminal:

Bash
mvn spring-boot:run
Probar Endpoints: El servidor se levantará por defecto en el puerto 8080. Puedes probar la ruta principal enviando peticiones a:
http://localhost:8080/usuarios