package tn.esprit.firstproject.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Equipement;
import tn.esprit.firstproject.service.interfaces.IEquipementService;

import java.util.List;

@Tag(name = "Gestion des equipements")
@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementRestController {

    IEquipementService equipementService;

    @Operation(description = "Récupérer tous les equipements")
    @GetMapping("/retrieve-all-equipements")
    public List<Equipement> getEquipements() {
        return equipementService.retrieveAllEquipements();
    }

    @Operation(description = "Récupérer un equipement par son identifiant")
    @GetMapping("/retrieve-equipement/{equipement-id}")
    public Equipement retrieveEquipement(
            @PathVariable("equipement-id") Long equipementId) {
        return equipementService.retrieveEquipement(equipementId);
    }

    @Operation(description = "Ajouter un equipement")
    @PostMapping("/add-equipement")
    public Equipement addEquipement(@RequestBody Equipement equipement) {
        return equipementService.addEquipement(equipement);
    }

    @Operation(description = "Supprimer un equipement")
    @DeleteMapping("/remove-equipement/{equipement-id}")
    public void removeEquipement(
            @PathVariable("equipement-id") Long equipementId) {
        equipementService.removeEquipement(equipementId);
    }

    @Operation(description = "Modifier un equipement")
    @PutMapping("/modify-equipement")
    public Equipement modifyEquipement(@RequestBody Equipement equipement) {
        return equipementService.modifyEquipement(equipement);
    }
}