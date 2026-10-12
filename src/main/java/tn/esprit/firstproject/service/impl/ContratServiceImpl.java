package tn.esprit.firstproject.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Contrat;
import tn.esprit.firstproject.repository.ContratRepository;
import tn.esprit.firstproject.service.interfaces.IContratService;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratServiceImpl implements IContratService {

    ContratRepository contratRepository;

    public List<Contrat> retrieveAllContrats() {
        return contratRepository.findAll();
    }

    public Contrat retrieveContrat(Long contratId) {
        return contratRepository.findById(contratId).get();
    }

    public Contrat addContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    public void removeContrat(Long contratId) {
        contratRepository.deleteById(contratId);
    }

    public Contrat modifyContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }
}