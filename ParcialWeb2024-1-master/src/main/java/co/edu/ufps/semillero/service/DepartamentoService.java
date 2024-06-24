package co.edu.ufps.semillero.service;

import co.edu.ufps.semillero.model.Departamento;
import co.edu.ufps.semillero.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    public List<Departamento> getAllDepartamentos() {
        return departamentoRepository.findAll();
    }

    public Optional<Departamento> getDepartamentoById(int id) {
        return departamentoRepository.findById(id);
    }

    public Departamento createDepartamento(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    public Optional<Departamento> updateDepartamento(int id, Departamento updatedDepartamento) {
        return departamentoRepository.findById(id).map(departamento -> {
            departamento.setNombre(updatedDepartamento.getNombre());
            return departamentoRepository.save(departamento);
        });
    }

    public boolean deleteDepartamento(int id) {
        return departamentoRepository.findById(id).map(departamento -> {
            departamentoRepository.delete(departamento);
            return true;
        }).orElse(false);
    }
}
