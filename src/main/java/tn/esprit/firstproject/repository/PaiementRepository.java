package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.firstproject.entities.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
