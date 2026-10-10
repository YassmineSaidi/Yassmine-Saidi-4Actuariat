package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.firstproject.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
