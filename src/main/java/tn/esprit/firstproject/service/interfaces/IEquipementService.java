package tn.esprit.firstproject.service.interfaces;

import tn.esprit.firstproject.entities.Equipement;
import java.util.List;

public interface IEquipementService {

    public List<Equipement> retrieveAllEquipements();

    public Equipement retrieveEquipement(Long equipementId);

    public Equipement addEquipement(Equipement equipement);

    public void removeEquipement(Long equipementId);

    public Equipement modifyEquipement(Equipement equipement);
}