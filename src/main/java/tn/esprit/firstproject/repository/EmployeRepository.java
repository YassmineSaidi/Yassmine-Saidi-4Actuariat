package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.firstproject.entities.Employe;


public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
