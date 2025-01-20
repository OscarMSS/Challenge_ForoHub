# ForoHub System

ForoHub es una aplicación desarrollada con Spring Boot que permite la creación, administración y participación en foros educativos. Este sistema está diseñado para ofrecer una experiencia robusta y segura en la gestión de usuarios, temas, cursos y respuestas.

## Características

Gestión de Usuarios: Autenticación y autorización mediante JWT.

Gestión de Foros: Creación, visualización y gestión de temas y respuestas.

Gestión de Cursos: Relación entre cursos, temas y categorías.

Documentación API: Generada automáticamente con Swagger.

Seguridad: Uso de roles y permisos implementados con Spring Security.

## Arquitectura del Sistema

El proyecto sigue una arquitectura por capas claramente definida:

Capa API: Contiene los controladores REST y las configuraciones de seguridad.

Capa de Dominio: Define las entidades, repositorios y objetos de transferencia de datos (DTOs).

Capa de Infraestructura: Gestiona la configuración de la base de datos, el manejo de errores y la documentación de la API.



