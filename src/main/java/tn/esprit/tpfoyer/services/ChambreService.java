package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.repository.ChambreRepository;


@Service
public class ChambreService implements IChambreService {
    @Autowired
    ChambreRepository chambreRepository;

}
