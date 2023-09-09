# CRUD con Spring Boot y Mongodb

Este proyecto ejemplifica un CRUD (Crear, Leer, Actualizar y Eliminar) fundamental, desarrollada con Java 17, Spring Boot 3 y MongoDB. 

## Tecnologías Utilizadas

- Java jdk-17
- Spring Boot 3
- Maven
- MongoDB
- Docker

## Configuración del Entorno y Prerrequisitos

Asegúrate de tener instalados los siguientes componentes en tu entorno de desarrollo antes de comenzar:

- [Git](https://git-scm.com/downloads)
- [Maven](https://maven.apache.org/download.cgi)
- [Java jdk-17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Docker](https://docs.docker.com/)

## Instrucciones de Uso

Sigue estos pasos para ejecutar la aplicación en tu entorno local:

#### Clonar el repositorio en tu máquina local
```
git clone https://github.com/Angel-Raa/CRUD-spring-boot-mongodb.git
```
#### Navegar al directorio del proyecto
```
cd CRUD-spring-boot-mongodb
```
#### Limpia y empaqueta el proyecto utilizando Maven
```
mvn clean package
```
#### inicia la aplicación Spring Boot
```
mvn spring:run

```
## Base URL

- [http://localhost:2023](http://localhost:2023)

## API Endpoints 
Mis disculpas por omitir esos dos endpoints en la tabla anterior. Aquí tienes la tabla actualizada que incluye todos los endpoints relacionados con productos:

| Método   | Endpoint                               | Descripción                                |
|----------|----------------------------------------|--------------------------------------------|
| GET      | `/product/list`                        | Obtiene una lista de todos los productos en la tienda.  |
| GET      | `/product/{id}`                        | Obtiene información detallada de un solo producto por su ID.        |
| POST     | `/product/add`                         | Crea y guarda un nuevo producto en la tienda.     |
| PUT      | `/product/update/{id}`                 | Actualiza un producto existente por su ID. |
| DELETE   | `/product/delete/{id}`                 | Elimina un producto por su ID.             |
| GET      | `/product/search/{query}`              | Busca productos en la tienda basándose en un término de búsqueda. |
| DELETE   | `/product/delete-by-name/{name}`       | Elimina productos de la tienda por su nombre.  |

Esta tabla incluye todos los endpoints relacionados con productos y sus respectivas descripciones.

| Campo           | Descripción                                     |
|-----------------|-------------------------------------------------|
| `id`            | Identificador único del producto.               |
| `name`          | Nombre del producto.                            |
| `description`   | Descripción detallada del producto.             |
| `price`         | Precio del producto en unidades monetarias.     |


- **Obtener todos los Product:** `Endpoint: GET /product/all`
  
  - Respuesta Exitosa (200 OK)
    ```json
    {
    [
      {
          "id": "64fbdb822d4bb819ba62ac98",
          "name": "Poción de la invisibilidad",
          "description": "Una poción mágica que hace que el usuario sea invisible.",
          "price": 100000
      },
      {
          "id": "64fbdbaa2d4bb819ba62ac99",
          "name": "Capa de invisibilidad",
          "description": "Una capa que hace que el usuario sea invisible.",
          "price": 50000
      },
      {
          "id": "64fbdbb42d4bb819ba62ac9a",
          "name": "Escoba voladora",
          "description": "Una escoba que permite al usuario volar.",
          "price": 10000
      },
      {
          "id": "64fbdbbe2d4bb819ba62ac9b",
          "name": "Piedra filosofal",
          "description": "Una piedra que permite al usuario convertir cualquier metal en oro y otorgar la vida eterna.",
          "price": 1000000000
      },
      {
          "id": "64fbdbe02d4bb819ba62ac9c",
          "name": "Teletransportador",
          "description": "Un dispositivo que permite al usuario viajar de un lugar a otro instantáneamente.",
          "price": 100000
      },
      {
          "id": "64fbdbef2d4bb819ba62ac9d",
          "name": "Clonador",
          "description": "Un dispositivo que permite al usuario crear un clon exacto de sí mismo.",
          "price": 500000
      },
      {
          "id": "64fbdc0d2d4bb819ba62ac9e",
          "name": "Máquina del tiempo",
          "description": "Un dispositivo que permite al usuario viajar en el tiempo.",
          "price": 1000000
      },
      {
          "id": "64fbdc402d4bb819ba62ac9f",
          "name": "Súper traje",
          "description": "Un traje que otorga al usuario superpoderes, como la fuerza, la velocidad y la invulnerabilidad.",
          "price": 100000
      },
      {
          "id": "64fbdc642d4bb819ba62aca0",
          "name": "Poción de amor",
          "description": "Una poción que hace que el usuario sea irresistible para el objeto de su afecto.",
          "price": 1000000
        }
    ]

    }
    ```
  

- **Obtener un Product por ID:** `Endpoint: GET /product/{productId}`
  - Respuesta Exitosa (200 OK)
    ```json
    {
      {
        "id": "64fbdbb42d4bb819ba62ac9a",
        "name": "Escoba voladora",
        "description": "Una escoba que permite al usuario volar.",
        "price": 10000
      }
    }
    ```

- **Crear un Nuevo Product:** `Endpoint: POST /product/create`
  - Cuerpo de la solicitud:
    ```json
    {
      {
        "name": "Poción de amor",
        "description": "Una poción que hace que el usuario sea irresistible para el objeto de su afecto.",
        "price": 1000000

      }
    }
    ```
  - Respuesta Exitosa (201 Created)
    ```json
    {
      {
        "message": "product saved successfully",
        "code": 201,
        "status": "CREATED",
        "timestamp": "2023-09-08 22:45:56"
      }
    }
    ```
- **Actualizar un Product:** `Endpoint: PUT /product/update/{productId}`
  - Respuesta Exitosa (200 OK)
    ```json
    {
      {
        "message": "product updated successfully",
        "code": 209,
        "status": "OK",
        "timestamp": "2023-09-08 22:24:43"
      }
    }
    ```
- **Buscar Product por Término:** `Endpoint: GET /product/search/{query}`
  - Ejemplo de Solicitud: `GET /product/search/Piedra%20filosofal`
  - Respuesta Exitosa (200 OK)
    ```json
    {
      [
        {
          "id": "64fbdbbe2d4bb819ba62ac9b",
          "name": "Piedra filosofal",
          "description": "Una piedra que permite al usuario convertir cualquier metal en oro y otorgar la vida eterna.",
          "price": 1000000000
        }
      ]
    }
    ```

- **Eliminar Product por Nombre:** `Endpoint: DELETE /product/delete-by-name/{productName}`
  - Respuesta Exitosa (204 No Content)
    ```json
    {
      {
        "message": "product deleted successfully",
        "code": 204,
        "status": "NO_CONTENT",
        "timestamp": "2023-09-08 22:46:13"
      }
    }
    ```
- **Eliminar Product por ID:** `Endpoint: DELETE /product/delete/{productId}`
  - Respuesta Exitosa (204 No Content)
    ```json
    {
      {
        "message": "product deleted successfully",
        "code": 204,
        "status": "NO_CONTENT",
        "timestamp": "2023-09-08 23:55:49"
      }
    }
    ```




## Recursos Adicionales

Aquí hay algunos recursos adicionales que podrían ser útiles:


- [Documentacion de open jdk 17](https://docs.oracle.com/en/java/javase/17/docs/api/)
- [Documentacion de Spring boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
- [Documentacion de Spring Data MongoDB](https://spring.io/projects/spring-data-mongodb)
- [Documentacion de Maven](https://maven.apache.org/guides/getting-started/)

