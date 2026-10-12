package tn.esprit.firstproject.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Employe;
import tn.esprit.firstproject.repository.EmployeRepository;
import tn.esprit.firstproject.service.interfaces.IEmployeService;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeServiceImpl implements IEmployeService {

    EmployeRepository employeRepository;

    public List<Employe> retrieveAllEmployes() {
        return employeRepository.findAll();
    }

    public Employe retrieveEmploye(Long employeId) {
        return employeRepository.findById(employeId).get();
    }

    public Employe addEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    public void removeEmploye(Long employeId) {
        employeRepository.deleteById(employeId);
    }

    public Employe modifyEmploye(Employe employe) {
        return employeRepository.save(employe);
    }
}