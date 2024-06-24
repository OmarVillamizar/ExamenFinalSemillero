# Examen Final Semillero

**Omar Jesús Villamizar Isaza - 1152239**

## Servicios Implementados

### Capacitación
- **Listar**: Obtener todas las capacitaciones.

### Línea
- **Obtener**: Obtener una línea por su ID.

### Semillero
- **Crear**: Crear un nuevo semillero.

### Estudiante
- **Actualizar**: Actualizar un estudiante por su ID.

### Proyecto
- **Eliminar**: Eliminar un proyecto por su ID.

## Departamento
- **Listar**: Obtener todos los departamentos.
- **Obtener**: Obtener un departamento por su ID.
- **Crear**: Crear un nuevo departamento.
- **Actualizar**: Actualizar un departamento por su ID.
- **Eliminar**: Eliminar un departamento (eliminado en cascada).

## Proyectos de una Línea
- **Obtener**: Obtener todos los proyectos que pertenecen a una línea por el ID de la línea.

## Ejemplo de Request Body para Crear Semillero

```json
{
    "estrategiaTrabajo": "Fomentar la investigación a través de talleres y proyectos colaborativos",
    "mision": "Desarrollar competencias investigativas en estudiantes de pregrado",
    "nombre": "SEMILLERO DE OMAR VILLAMIZAR 2",
    "objetivoEspecifico": "Implementar proyectos de investigación en el área de tecnología",
    "objetivoGeneral": "Fortalecer las capacidades investigativas de los estudiantes",
    "sigla": "SIT",
    "vision": "Ser un semillero líder en innovación tecnológica",
    "capacitacions": [],
    "integrantes": [],
    "lineas": [],
    "area": {
        "id": 1
    },
    "director": {
        "id": 1
    },
    "grupo": {
        "id": 1
    }
}
