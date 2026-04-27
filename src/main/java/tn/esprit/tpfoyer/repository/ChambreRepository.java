package tn.esprit.tpfoyer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.entities.TypeChambre;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    List<Chambre> findByTypeC(TypeChambre typeC);

    Chambre findByNumeroChambre(Long numeroChambre);

    @Query("SELECT c FROM Chambre c where c.numeroChambre = :num ")
    Chambre findByNumero(@Param("num") long numero);

    @Query("SELECT c FROM Chambre c JOIN c.bloc b JOIN b.foyer f WHERE f.nomFoyer = :nom")
    List<Chambre> findChambresByFoyer(@Param("nom") String nomFoyer);

    @Query("SELECT e FROM Etudiant e " +
       "WHERE (SELECT COUNT(r) FROM Reservation r WHERE r.etudiant = e) > " +
       "(SELECT AVG((SELECT COUNT(r2) FROM Reservation r2 WHERE r2.etudiant = e2)) FROM Etudiant e2)")
    List<Etudiant> findEtudiantsAboveAverageAlt();
}
