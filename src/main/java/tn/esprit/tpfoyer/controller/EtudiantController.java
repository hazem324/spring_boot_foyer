package tn.esprit.tpfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.services.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
@AllArgsConstructor
public class EtudiantController {
    final IEtudiantService etudiantService;

    @PostMapping("/add")
    Etudiant addEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.addOrUpdateEtudiant(etudiant);
    }

    @PutMapping("/update")
    Etudiant updateEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.addOrUpdateEtudiant(etudiant);
    }

    @DeleteMapping("/delete/{idEtudiant}")
    void deleteEtudiant(@PathVariable long idEtudiant){
        etudiantService.deleteEtudiant(idEtudiant);
    }

    @GetMapping("/findAll")
    List<Etudiant> findAllEtudiants(){
        return etudiantService.findAllEtudiants();
    }

    @GetMapping("/findById/{idEtudiant}")
    Etudiant findEtudiant(@PathVariable long idEtudiant){
        return etudiantService.findEtudiant(idEtudiant);
    }
}
