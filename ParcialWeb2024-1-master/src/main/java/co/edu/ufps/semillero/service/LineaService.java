package co.edu.ufps.semillero.service;

import co.edu.ufps.semillero.model.Linea;
import co.edu.ufps.semillero.repository.LineaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LineaService {

    @Autowired
    private LineaRepository lineaRepository;

    public Optional<Linea> obtenerLineaPorId(int id) {
        return lineaRepository.findById(id);
    }
}
