package co.edu.ufps.semillero.repository;

import co.edu.ufps.semillero.model.Semillero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SemilleroRepository extends JpaRepository<Semillero, Integer> {
}
