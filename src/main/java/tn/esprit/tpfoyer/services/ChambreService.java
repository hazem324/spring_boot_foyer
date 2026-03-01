package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.repository.ChambreRepository;

import java.util.List;


@Service
public class ChambreService implements IChambreService {
    @Autowired
    ChambreRepository chambreRepository;

    @Override
    public Chambre addOrUpdateChambre(Chambre chambre) {
        return null;
    }

    @Override
    public void deleteChambre(long idChambre) {

    }

    @Override
    public List<Chambre> findAllChambres() {
        return List.of();
    }

    @Override
    public Chambre findChambre(long idChambre) {
        return null;
    }
}
