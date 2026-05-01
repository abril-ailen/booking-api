# API de Gestión de Reservas y Turnos

##  Estado del Proyecto
Este proyecto se encuentra actualmente en **fase de desarrollo activo**. 
Se está trabajando en la implementación de la capa de persistencia y la lógica de negocio para la validación de colisiones horarias.

##  Descripción
Una API REST desarrollada en Java con Spring Boot diseñada para gestionar la reserva de turnos entre profesionales y clientes. El objetivo principal es resolver la problemática de la superposición de horarios y optimizar la agenda de servicios.

## Tecnologías Planificadas / En uso
*   **Lenguaje:** Java 17+
*   **Framework:** Spring Boot 3
*   **Persistencia:** Spring Data JPA / Hibernate
*   **Base de Datos:** MySQL
*   **Documentación:** Swagger / OpenAPI (Próximamente)

##  Funcionalidades a implementar
- [ ] CRUD completo de Profesionales y Clientes.
- [ ] Sistema de reserva de turnos con validación de disponibilidad en tiempo real.
- [ ] Prevención de colisiones: El sistema no permitirá dos turnos en la misma franja horaria para el mismo profesional.
- [ ] Gestión de estados (Pendiente, Confirmado, Cancelado, Completado).
- [ ] Filtrado de agenda por fecha y prestador.

## Modelo de Datos (Resumen)
El sistema se basa en tres entidades principales:
1. **Professional**: Datos del prestador y rango de horario laboral.
2. **Client**: Información de contacto del usuario.
3. **Appointment**: La reserva que vincula a ambos, con fecha, hora y estado.

