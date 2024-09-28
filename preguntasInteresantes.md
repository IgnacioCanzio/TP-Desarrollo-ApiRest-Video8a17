## Estructura del proyecto

### 1. config: 
auditoría

### 2. controllers: 
Los controladores son responsables de manejar las solicitudes HTTP (GET, POST, PUT, DELETE) y dirigirlas a los servicios adecuados para que se realicen las operaciones necesarias. Un controlador usualmente tiene mapeos de rutas para definir qué acciones ejecutar cuando se recibe una petición en una URL específica.

### 3. entities:
Las entidades dentro de esta paquete representan las tablas en la base de datos

### 4. services:
Se utilizan para implementar las operaciones de negocio que los controladores llaman. Estos servicios interactúan con los repositorios para acceder a los datos. El BaseService podría ser una clase genérica que contiene lógica común para varios servicios (como manejo de transacciones, validaciones, etc.).

-----
## Controladores 

font: deepseek //asked person code.

__@Autowired__: Indica a Spring que debe inyectar automáticamente una instancia de PersonaService en esta clase. Esto permite que el controlador interactúe con el servicio para realizar operaciones CRUD

__@RestController__: Indica que esta clase es un controlador REST en Spring, lo que significa que manejará solicitudes HTTP y devolverá respuestas en formato JSON.

__@CrossOrigin(origins ="*")__: Permite que este controlador acepte solicitudes desde cualquier origen (CORS).

__@RequestMapping(path ="api/v1/personas")__: Define la URL base para todas las rutas manejadas por este controlador. En este caso, todas las rutas comenzarán con api/v1/personas

__@GetMapping("")__: Maneja solicitudes GET a la ruta base (api/v1/personas).

__ResponseEntity<?> getAll()__: Retorna una lista de todas las personas en la base de datos. Si ocurre un error, devuelve un mensaje de error con el estado NOT_FOUND.

__@GetMapping("/{id}")__: Maneja solicitudes GET a la ruta api/v1/personas/{id}, donde {id} es el ID de la persona.

__ResponseEntity<?> getOne(@PathVariable Long id)__: Retorna una persona específica por su ID. Si ocurre un error, devuelve un mensaje de error con el estado NOT_FOUND.

__@PostMapping("")__: Maneja solicitudes POST a la ruta base (api/v1/personas).

__ResponseEntity<?> save(@RequestBody Persona entity)__: Guarda una nueva persona en la base de datos. Si ocurre un error, devuelve un mensaje de error con el estado BAD_REQUEST.

__@PutMapping("/{id}")__: Maneja solicitudes PUT a la ruta api/v1/personas/{id}, donde {id} es el ID de la persona.

__ResponseEntity<?> update(@PathVariable Long id, @RequestBody Persona entity)__: Actualiza una persona existente en la base de datos. Si ocurre un error, devuelve un mensaje de error con el estado BAD_REQUEST.

__@DeleteMapping("/{id}")__: Maneja solicitudes DELETE a la ruta api/v1/personas/{id}, donde {id} es el ID de la persona.

__ResponseEntity<?> delete(@PathVariable Long id)__: Elimina una persona de la base de datos. Si ocurre un error, devuelve un mensaje de error con el estado BAD_REQUEST.

_**¿Que es @PathVariable y @RequestBody?**_

__@PathVariable Long id__: Indica que el valor de {id} en la URL debe ser mapeado al parámetro id del método getOne

_si la URL es api/v1/personas/123, entonces id será 123._

__@RequestBody Persona entity__: Indica que el cuerpo de la solicitud HTTP debe ser convertido a un objeto de tipo Persona y mapeado al parámetro entity del método save

`{
"nombre": "Juan",
"edad": 30
}` 
json
2
2