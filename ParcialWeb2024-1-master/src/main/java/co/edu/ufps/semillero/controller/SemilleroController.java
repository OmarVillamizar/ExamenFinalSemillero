package co.edu.ufps.semillero.controller;

import co.edu.ufps.semillero.model.Semillero;
import co.edu.ufps.semillero.service.SemilleroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/semilleros")
public class SemilleroController {

    @Autowired
    private SemilleroService semilleroService;

    @PostMapping("/crear_semillero")
    public Semillero crearSemillero(@RequestBody Semillero semillero) {
        return semilleroService.crearSemillero(semillero);
    }
}
