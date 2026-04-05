package tn.esprit.tpfoyer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.TypeChambre;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    List<Chambre> findByTypeC(TypeChambre typeC);

    Chambre findByNumeroChambre(Long numeroChambre);
}
