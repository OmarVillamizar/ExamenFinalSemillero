package co.edu.ufps.semillero.service;

import co.edu.ufps.semillero.model.Estudiante;
import co.edu.ufps.semillero.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public Estudiante updateEstudiante(int id, Estudiante updatedEstudiante) {
        Optional<Estudiante> optionalEstudiante = estudianteRepository.findById(id);
        
        if (optionalEstudiante.isPresent()) {
            Estudiante existingEstudiante = optionalEstudiante.get();
            existingEstudiante.setCodigo(updatedEstudiante.getCodigo());
            existingEstudiante.setDireccion(updatedEstudiante.getDireccion());
            existingEstudiante.setEmail(updatedEstudiante.getEmail());
            existingEstudiante.setFechaNacimiento(updatedEstudiante.getFechaNacimiento());
            existingEstudiante.setNombre(updatedEstudiante.getNombre());
            existingEstudiante.setTelefono(updatedEstudiante.getTelefono());
            existingEstudiante.setPrograma(updatedEstudiante.getPrograma());
            
            return estudianteRepository.save(existingEstudiante);
        } else {
            // Handle the case where the student does not exist
            return null;
        }
    }
}
