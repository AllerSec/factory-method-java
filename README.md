# Factory Method en Java

> **Una implementación del patrón Factory Method en Java, desplegado con Swing, Maven, e integrado en GitHub.**

![Banner](https://via.placeholder.com/800x200?text=Factory+Method+en+Java)  
*Diseñado en Canva*

## Descripción

Este proyecto demuestra la implementación del patrón **Factory Method** en Java. El patrón permite crear objetos de forma flexible sin acoplar el código cliente a clases concretas. Se incluyen dos variantes:

- **HtmlDialog/HtmlButton:** Simula un botón HTML con salida en consola.
- **WindowsDialog/WindowsButton:** Utiliza Swing para desplegar una interfaz gráfica.

El proyecto se ha desarrollado en IntelliJ IDEA, se compila con Maven y se gestiona mediante Git.

## Estructura del Proyecto

```plaintext
src
└── main
    └── java
        ├── buttons
        │   ├── Button.java
        │   ├── HtmlButton.java
        │   └── WindowsButton.java
        ├── factory
        │   ├── Dialog.java
        │   ├── HtmlDialog.java
        │   └── WindowsDialog.java
        └── main
            └── Demo.java
```
## Requisitos

- **Java:** 11 o superior.
- **Maven:** 3.x.
- **Git:** Para clonar y gestionar el repositorio.
- **IntelliJ IDEA:** (Opcional) para el desarrollo y ejecución.

## Compilación y Ejecución

### Con Maven

**Compilar:**

```bash
mvn clean compile
```
## Empaquetar en JAR ejecutable

**Empaquetar en JAR ejecutable:**

```bash
mvn clean package
```


##Ejecutar:

```bash
java -jar target/factory-method-java1-1.0-SNAPSHOT.jar
```

##Licencia
Este proyecto está licenciado bajo la licencia Apache 2.0.


