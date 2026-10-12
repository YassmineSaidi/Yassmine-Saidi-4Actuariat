package tn.esprit.firstproject.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Reservation;
import tn.esprit.firstproject.service.interfaces.IReservationService;

import java.util.List;

@Tag(name = "Gestion des reservations")
@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {

    IReservationService reservationService;

    @Operation(description = "Récupérer toutes les reservations")
    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservations() {
        return reservationService.retrieveAllReservations();
    }

    @Operation(description = "Récupérer une reservation par son identifiant")
    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation(
            @PathVariable("reservation-id") Long reservationId) {
        return reservationService.retrieveReservation(reservationId);
    }

    @Operation(description = "Ajouter une reservation")
    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @Operation(description = "Supprimer une reservation")
    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(
            @PathVariable("reservation-id") Long reservationId) {
        reservationService.removeReservation(reservationId);
    }

    @Operation(description = "Modifier une reservation")
    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation reservation) {
        return reservationService.modifyReservation(reservation);
    }
}