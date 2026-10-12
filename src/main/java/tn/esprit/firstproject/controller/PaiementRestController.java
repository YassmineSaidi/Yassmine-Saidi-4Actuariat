package tn.esprit.firstproject.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Paiement;
import tn.esprit.firstproject.service.interfaces.IPaiementService;

import java.util.List;

@Tag(name = "Gestion des paiements")
@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class PaiementRestController {

    IPaiementService paiementService;

    @Operation(description = "Récupérer tous les paiements")
    @GetMapping("/retrieve-all-paiements")
    public List<Paiement> getPaiements() {
        return paiementService.retrieveAllPaiements();
    }

    @Operation(description = "Récupérer un paiement par son identifiant")
    @GetMapping("/retrieve-paiement/{paiement-id}")
    public Paiement retrievePaiement(
            @PathVariable("paiement-id") Long paiementId) {
        return paiementService.retrievePaiement(paiementId);
    }

    @Operation(description = "Ajouter un paiement")
    @PostMapping("/add-paiement")
    public Paiement addPaiement(@RequestBody Paiement paiement) {
        return paiementService.addPaiement(paiement);
    }

    @Operation(description = "Supprimer un paiement")
    @DeleteMapping("/remove-paiement/{paiement-id}")
    public void removePaiement(
            @PathVariable("paiement-id") Long paiementId) {
        paiementService.removePaiement(paiementId);
    }

    @Operation(description = "Modifier un paiement")
    @PutMapping("/modify-paiement")
    public Paiement modifyPaiement(@RequestBody Paiement paiement) {
        return paiementService.modifyPaiement(paiement);
    }
}