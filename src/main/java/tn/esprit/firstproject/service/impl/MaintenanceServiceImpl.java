package tn.esprit.firstproject.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Maintenance;
import tn.esprit.firstproject.repository.MaintenanceRepository;
import tn.esprit.firstproject.service.interfaces.IMaintenanceService;

import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceServiceImpl implements IMaintenanceService {

    MaintenanceRepository maintenanceRepository;

    public List<Maintenance> retrieveAllMaintenances() {
        return maintenanceRepository.findAll();
    }

    public Maintenance retrieveMaintenance(Long maintenanceId) {
        return maintenanceRepository.findById(maintenanceId).get();
    }

    public Maintenance addMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    public void removeMaintenance(Long maintenanceId) {
        maintenanceRepository.deleteById(maintenanceId);
    }

    public Maintenance modifyMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }
}