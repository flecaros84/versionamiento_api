# Actividad Versionando Mi Código

📋 Descripción del Reto
Los estudiantes deberán construir, versionar y mantener un microservicio básico en Spring Boot. El proyecto debe estructurarse obligatoriamente mediante un repositorio de Git local y remoto, registrando exactamente tres commits principales, cada uno representando un hito dentro del versionado semántico.

🚀 Requisitos e Instrucciones Paso a Paso
1. Configuración Inicial y (Commit 1)
•	Acción: Crear la estructura base del microservicio. Debe incluir al menos un endpoint funcional (por ejemplo, un GET /api/status o un saludo) que devuelva una respuesta en formato JSON.
•	Git y Versionado:
o	Inicializar el repositorio Git.
o	Añadir los archivos (git add) y realizar el primer commit siguiendo la convención semántica correspondiente a un lanzamiento inicial estable.
o	Mensaje de commit esperado (ejemplo): feat(core): version 1.0.0: Creacion de microservicio

2. Incorporación de Nueva Funcionalidad  (Commit 2)
•	Acción: Agregar una nueva característica (feature) al microservicio. Esto implica crear un nuevo endpoint que aporte valor funcional al sistema (por ejemplo, un endpoint que reciba datos por POST, o que consulte una operación matemática/lógica específica).
•	Git y Versionado:
o	Añadir los cambios al área de preparación.
o	Realizar el segundo commit, utilizando el tipo de commit correspondiente a una nueva funcionalidad compatible hacia atrás (incremento de versión menor).
o	Mensaje de commit esperado (ejemplo): Version xxxx: Creacion de nuevo endpoint 

3. Corrección de Incidencia (Commit 3)
•	Acción: Simular la detección de un bug en alguno de los endpoints anteriores (por ejemplo, un fallo en la validación de parámetros, un error ortográfico en el JSON de respuesta o un manejo nulo) y corregirlo.
•	Git y Versionado:
o	Aplicar el parche o corrección en el código.
o	Realizar el tercer commit, utilizando el tipo de commit correspondiente a una corrección de errores (incremento de versión de parche).
o	Mensaje de commit esperado (ejemplo): Version xxx: Fix de bug encontrado


## Endpoints

### Estado del microservicio

GET /api/status

Ejemplo de respuesta:

```json
{
  "status": "OK",
  "mensaje": "Microservicio funcionando correctamente",
  "version": "1.1.0"
}
```

### Sumar dos números

POST /api/sumar

Ejemplo de solicitud:
```json
{
  "numero1": 10,
  "numero2": 5
}
```
Ejemplo de respuesta:
```json
{
  "resultado": 15.0
}
```