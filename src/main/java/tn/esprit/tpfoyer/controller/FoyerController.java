package tn.esprit.tpfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.services.IFoyerService;

import java.util.List;

@RestController
@RequestMapping("/foyer")
@AllArgsConstructor
public class FoyerController {
    final IFoyerService foyerService;

    @PostMapping("/add")
    Foyer addFoyer(@RequestBody Foyer foyer){
        return foyerService.addOrUpdateFoyer(foyer);
    }

    @PutMapping("/update")
    Foyer updateFoyer(@RequestBody Foyer foyer){
        return foyerService.addOrUpdateFoyer(foyer);
    }

    @DeleteMapping("/delete/{idFoyer}")
    void deleteFoyer(@PathVariable long idFoyer){
        foyerService.deleteFoyer(idFoyer);
    }

    @GetMapping("/findAll")
    List<Foyer> findAllFoyers(){
        return foyerService.findAllFoyers();
    }

    @GetMapping("/findById/{idFoyer}")
    Foyer findFoyer(@PathVariable long idFoyer){
        return foyerService.findFoyer(idFoyer);
    }
}
