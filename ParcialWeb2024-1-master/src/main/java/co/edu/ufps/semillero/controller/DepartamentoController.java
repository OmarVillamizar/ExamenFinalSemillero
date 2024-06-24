package co.edu.ufps.semillero.controller;

import co.edu.ufps.semillero.model.Departamento;
import co.edu.ufps.semillero.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;

    @GetMapping
    public ResponseEntity<List<Departamento>> getAllDepartamentos() {
        List<Departamento> departamentos = departamentoService.getAllDepartamentos();
        return ResponseEntity.ok(departamentos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Departamento> getDepartamentoById(@PathVariable int id) {
        Optional<Departamento> departamento = departamentoService.getDepartamentoById(id);
        return departamento.map(ResponseEntity::ok)
                           .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Departamento> createDepartamento(@RequestBody Departamento departamento) {
        Departamento createdDepartamento = departamentoService.createDepartamento(departamento);
        return ResponseEntity.ok(createdDepartamento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Departamento> updateDepartamento(@PathVariable int id, @RequestBody Departamento updatedDepartamento) {
        Optional<Departamento> updated = departamentoService.updateDepartamento(id, updatedDepartamento);
        return updated.map(ResponseEntity::ok)
                      .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDepartamento(@PathVariable int id) {
        boolean deleted = departamentoService.deleteDepartamento(id);
        if (deleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
