package co.edu.ufps.semillero.controller;

import co.edu.ufps.semillero.model.Proyecto;
import co.edu.ufps.semillero.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/proyectos")
public class ProyectoController {

    @Autowired
    private ProyectoService proyectoService;

    @DeleteMapping("/eliminar_proyecto/{id}")
    public ResponseEntity<?> deleteProyecto(@PathVariable int id) {
        try {
            Proyecto deletedProyecto = proyectoService.deleteProyecto(id);
            return ResponseEntity.ok(deletedProyecto);
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }
}
