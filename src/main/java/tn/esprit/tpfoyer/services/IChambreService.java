package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addOrUpdateChambre(Chambre chambre);

    void deleteChambre(long idChambre);

    List<Chambre> findAllChambres();

    Chambre findChambre(long idChambre);
}
