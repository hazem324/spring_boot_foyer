package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Universite;
import tn.esprit.tpfoyer.repository.UniversiteRepository;

import java.util.List;

@Service
public class UniversiteService implements IUniversiteService {

    @Autowired
    UniversiteRepository universiteRepository;

    @Override
    public Universite addOrUpdateUniversite(Universite universite) {
        return null;
    }

    @Override
    public void deleteUniversite(long idUniversite) {

    }

    @Override
    public List<Universite> findAllUniversites() {
        return List.of();
    }

    @Override
    public Universite findUniversite(long idUniversite) {
        return null;
    }
}
