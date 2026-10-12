package tn.esprit.firstproject.service.interfaces;

import tn.esprit.firstproject.entities.Employe;
import java.util.List;

public interface IEmployeService {

    public List<Employe> retrieveAllEmployes();

    public Employe retrieveEmploye(Long employeId);

    public Employe addEmploye(Employe employe);

    public void removeEmploye(Long employeId);

    public Employe modifyEmploye(Employe employe);
}