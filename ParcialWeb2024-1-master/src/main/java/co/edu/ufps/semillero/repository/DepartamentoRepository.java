package co.edu.ufps.semillero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.edu.ufps.semillero.model.Departamento;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {
}
