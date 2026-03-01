package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.repository.BlocRepository;

import java.util.List;


@Service
public class BlocService implements  IBlocService
{
    @Autowired
    BlocRepository blocRepository;

    @Override
    public Bloc addOrUpdateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    @Override
    public List<Bloc> findAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc findBloc(long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }
}
