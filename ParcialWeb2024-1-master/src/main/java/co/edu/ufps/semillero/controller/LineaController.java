package co.edu.ufps.semillero.controller;

import co.edu.ufps.semillero.model.Linea;
import co.edu.ufps.semillero.model.Proyecto;
import co.edu.ufps.semillero.service.LineaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class LineaController {

    @Autowired
    private LineaService lineaService;

    @GetMapping("lineas/obtener_linea_por_id/{id}")
    public Optional<Linea> obtenerLineaPorId(@PathVariable int id) {
        return lineaService.obtenerLineaPorId(id);
    }

    @GetMapping("lineas/ObtenerProyectosDeUnaLinea/{id}/proyectos")
    public ResponseEntity<?> obtenerProyectosPorLineaId(@PathVariable int id) {
        try {
            List<Proyecto> proyectos = lineaService.obtenerProyectosPorLineaId(id);
            return ResponseEntity.ok(proyectos);
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }
}