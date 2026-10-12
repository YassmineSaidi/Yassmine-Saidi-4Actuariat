package tn.esprit.firstproject.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Vehicule;
import tn.esprit.firstproject.repository.VehiculeRepository;
import tn.esprit.firstproject.service.interfaces.IVehiculeService;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeServiceImpl implements IVehiculeService {

    VehiculeRepository vehiculeRepository;

    public List<Vehicule> retrieveAllVehicules() {
        return vehiculeRepository.findAll();
    }

    public Vehicule retrieveVehicule(Long vehiculeId) {
        return vehiculeRepository.findById(vehiculeId).get();
    }

    public Vehicule addVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    public void removeVehicule(Long vehiculeId) {
        vehiculeRepository.deleteById(vehiculeId);
    }

    public Vehicule modifyVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }
}