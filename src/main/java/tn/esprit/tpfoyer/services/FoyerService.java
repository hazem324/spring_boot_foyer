package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.repository.FoyerRepository;

@Service
public class FoyerService implements IFoyerService{
    @Autowired
    FoyerRepository foyerRepository;

}
