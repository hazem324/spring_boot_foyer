package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.repository.EtudiantRepository;

@Service
public class EtudiantService implements  IEtudiantService {
    @Autowired
    EtudiantRepository etudiantRepository;
}
