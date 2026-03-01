package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.repository.EtudiantRepository;

import java.util.List;

@Service
public class EtudiantService implements  IEtudiantService {
    @Autowired
    EtudiantRepository etudiantRepository;

    @Override
    public Etudiant addOrUpdateEtudiant(Etudiant etudiant) {
        return null;
    }

    @Override
    public void deleteEtudiant(long idEtudiant) {

    }

    @Override
    public List<Etudiant> findAllEtudiants() {
        return List.of();
    }

    @Override
    public Etudiant findEtudiant(long idEtudiant) {
        return null;
    }
}
