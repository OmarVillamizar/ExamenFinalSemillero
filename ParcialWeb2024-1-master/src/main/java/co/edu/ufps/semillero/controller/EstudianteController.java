package co.edu.ufps.semillero.controller;

import co.edu.ufps.semillero.model.Estudiante;
import co.edu.ufps.semillero.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @PutMapping("/actualizar_esudiante/{id}")
    public ResponseEntity<Estudiante> updateEstudiante(@PathVariable int id, @RequestBody Estudiante updatedEstudiante) {
        Estudiante estudiante = estudianteService.updateEstudiante(id, updatedEstudiante);
        
        if (estudiante == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(estudiante);
        }
    }
}
