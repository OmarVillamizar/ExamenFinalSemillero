package co.edu.ufps.semillero.service;

import co.edu.ufps.semillero.model.Linea;
import co.edu.ufps.semillero.model.Proyecto;
import co.edu.ufps.semillero.repository.LineaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LineaService {

    @Autowired
    private LineaRepository lineaRepository;

    public Optional<Linea> obtenerLineaPorId(int id) {
        return lineaRepository.findById(id);
    }
    
    public List<Proyecto> obtenerProyectosPorLineaId(int id) {
        Optional<Linea> linea = lineaRepository.findById(id);
        if (linea.isPresent() && !linea.get().getProyectos().isEmpty()) {
            return linea.get().getProyectos();
        } else {
            throw new RuntimeException("No hay proyectos asociados a la línea con ID: " + id);
        }
    }
}