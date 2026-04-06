package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tn.esprit.tpfoyer.entities.Bloc;
import java.util.List;


public interface BlocRepository extends JpaRepository<Bloc, Long> {

    List<Bloc> findByFoyerIsNull();

    List<Bloc> findByCapaciteBlocGreaterThan(Long capacite);

    List<Bloc> findByNomBlocStartingWith(String prefix);

    List<Bloc> findByNomBlocStartingWithAndCapaciteBlocGreaterThan(String nomBloc, Long capacite);

    @Query("SELECT b FROM Bloc b")
    List<Bloc> getAllBlocs(); 
}
