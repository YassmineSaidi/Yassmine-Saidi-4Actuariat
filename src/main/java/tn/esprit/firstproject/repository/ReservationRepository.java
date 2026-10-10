package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.firstproject.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
