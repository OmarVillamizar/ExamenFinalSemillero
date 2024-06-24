package co.edu.ufps.semillero.service;

import co.edu.ufps.semillero.model.Semillero;
import co.edu.ufps.semillero.repository.SemilleroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SemilleroService {

    @Autowired
    private SemilleroRepository semilleroRepository;

    public Semillero crearSemillero(Semillero semillero) {
        return semilleroRepository.save(semillero);
    }
}
