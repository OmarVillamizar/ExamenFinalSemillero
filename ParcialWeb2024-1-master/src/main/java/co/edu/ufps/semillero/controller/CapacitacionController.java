package co.edu.ufps.semillero.controller;
import co.edu.ufps.semillero.model.Capacitacion;
import co.edu.ufps.semillero.service.CapacitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/capacitaciones/")
public class CapacitacionController {

    @Autowired
    private CapacitacionService capacitacionService;

    @GetMapping("/listar_capacitaciones")
    public List<Capacitacion> listarCapacitaciones() {
        return capacitacionService.listarCapacitaciones();
    }
}