package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.firstproject.entities.Agence;

public interface AgenceRepository extends JpaRepository<Agence, Long> {

}
