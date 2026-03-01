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
        return null;
    }

    @Override
    public void deleteBloc(long idBloc) {

    }

    @Override
    public List<Bloc> findAllBlocs() {
        return List.of();
    }

    @Override
    public Bloc findBloc(long idBloc) {
        return null;
    }
}
