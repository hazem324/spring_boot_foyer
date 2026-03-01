package tn.esprit.tpfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.services.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambre")
@AllArgsConstructor
public class ChambreController {
    final IChambreService chambreService;

    @PostMapping("/add")
    Chambre addChambre(@RequestBody Chambre chambre){
        return chambreService.addOrUpdateChambre(chambre);
    }

    @PutMapping("/update")
    Chambre updateChambre(@RequestBody Chambre chambre){
        return chambreService.addOrUpdateChambre(chambre);
    }

    @DeleteMapping("/delete/{idChambre}")
    void deleteChambre(@PathVariable long idChambre){
        chambreService.deleteChambre(idChambre);
    }

    @GetMapping("/findAll")
    List<Chambre> findAllChambres(){
        return chambreService.findAllChambres();
    }

    @GetMapping("/findById/{idChambre}")
    Chambre findChambre(@PathVariable long idChambre){
        return chambreService.findChambre(idChambre);
    }
}
