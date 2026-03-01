package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.repository.FoyerRepository;

import java.util.List;

@Service
public class FoyerService implements IFoyerService{
    @Autowired
    FoyerRepository foyerRepository;

    @Override
    public Foyer addOrUpdateFoyer(Foyer foyer) {
        return null;
    }

    @Override
    public void deleteFoyer(long idFoyer) {

    }

    @Override
    public List<Foyer> findAllFoyers() {
        return List.of();
    }

    @Override
    public Foyer findFoyer(long idFoyer) {
        return null;
    }
}
