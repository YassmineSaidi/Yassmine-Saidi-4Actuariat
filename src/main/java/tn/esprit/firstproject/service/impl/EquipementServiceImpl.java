package tn.esprit.firstproject.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Equipement;
import tn.esprit.firstproject.repository.EquipementRepository;
import tn.esprit.firstproject.service.interfaces.IEquipementService;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipementServiceImpl implements IEquipementService {

    EquipementRepository equipementRepository;

    public List<Equipement> retrieveAllEquipements() {
        return equipementRepository.findAll();
    }

    public Equipement retrieveEquipement(Long equipementId) {
        return equipementRepository.findById(equipementId).get();
    }

    public Equipement addEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    public void removeEquipement(Long equipementId) {
        equipementRepository.deleteById(equipementId);
    }

    public Equipement modifyEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }
}