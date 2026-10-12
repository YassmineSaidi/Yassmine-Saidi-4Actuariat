package tn.esprit.firstproject.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Contrat;
import tn.esprit.firstproject.service.interfaces.IContratService;

import java.util.List;

@Tag(name = "Gestion des contrats")
@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratRestController {

    IContratService contratService;

    @Operation(description = "Récupérer tous les contrats")
    @GetMapping("/retrieve-all-contrats")
    public List<Contrat> getContrats() {
        return contratService.retrieveAllContrats();
    }

    @Operation(description = "Récupérer un contrat par son identifiant")
    @GetMapping("/retrieve-contrat/{contrat-id}")
    public Contrat retrieveContrat(
            @PathVariable("contrat-id") Long contratId) {
        return contratService.retrieveContrat(contratId);
    }

    @Operation(description = "Ajouter un contrat")
    @PostMapping("/add-contrat")
    public Contrat addContrat(@RequestBody Contrat contrat) {
        return contratService.addContrat(contrat);
    }

    @Operation(description = "Supprimer un contrat")
    @DeleteMapping("/remove-contrat/{contrat-id}")
    public void removeContrat(
            @PathVariable("contrat-id") Long contratId) {
        contratService.removeContrat(contratId);
    }

    @Operation(description = "Modifier un contrat")
    @PutMapping("/modify-contrat")
    public Contrat modifyContrat(@RequestBody Contrat contrat) {
        return contratService.modifyContrat(contrat);
    }
}