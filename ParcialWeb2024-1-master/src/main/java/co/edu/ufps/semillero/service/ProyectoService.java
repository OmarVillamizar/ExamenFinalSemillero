package co.edu.ufps.semillero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.ufps.semillero.repository.ProyectoRepository;
import co.edu.ufps.semillero.model.Proyecto;

import java.util.Optional;

@Service
public class ProyectoService {

    @Autowired
    private ProyectoRepository proyectoRepository;

    public Optional<Proyecto> getProyectoById(int id) {
        return proyectoRepository.findById(id);
    }

    public Proyecto deleteProyecto(int id) {
        Optional<Proyecto> proyecto = proyectoRepository.findById(id);
        if (proyecto.isPresent()) {
            proyectoRepository.delete(proyecto.get());
            return proyecto.get();
        } else {
            throw new RuntimeException("Proyecto con ID " + id + " no encontrado.");
        }
    }
}
