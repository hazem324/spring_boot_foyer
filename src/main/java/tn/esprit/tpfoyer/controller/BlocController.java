package tn.esprit.tpfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.services.IBlocService;

import java.util.List;


@RestController
@RequestMapping("/bloc")
@AllArgsConstructor
public class BlocController {

    final IBlocService blocService;

    @PostMapping("/add")
    Bloc addBloc(@RequestBody Bloc bloc){
        return blocService.addOrUpdateBloc(bloc);
    }

    @PutMapping("/update")
    Bloc updateBloc(@RequestBody Bloc bloc){
        return blocService.addOrUpdateBloc(bloc);
    }

    @DeleteMapping("/delete/{idBloc}")
    void deleteBloc(@PathVariable long idBloc){
        blocService.deleteBloc(idBloc);
    }

    @GetMapping("/findAll")
    List<Bloc> findAllBlocs(){
        return blocService.findAllBlocs();
    }

    @GetMapping("/findById/{idBloc}")
    Bloc findBloc(@PathVariable long idBloc){
        return blocService.findBloc(idBloc);
    }

    @PostMapping("/add-with-foyer/{idFoyer}")
    public ResponseEntity<Bloc> addBlocWithFoyer(@RequestBody Bloc bloc,
                                                 @PathVariable Long idFoyer) {
        return ResponseEntity.ok(blocService.addBlocAndFoyer(bloc, idFoyer));
    }


    @PutMapping("/affecter/{idBloc}/foyer/{idFoyer}")
    public ResponseEntity<Bloc> affecterBlocAFoyer(@PathVariable Long idBloc,
                                                   @PathVariable Long idFoyer) {
        return ResponseEntity.ok(blocService.affecterBlocAFoyer(idBloc, idFoyer));
    }


    @PutMapping("/desaffecter/{idBloc}")
    public ResponseEntity<Bloc> desaffecterBlocDeFoyer(@PathVariable Long idBloc) {
        return ResponseEntity.ok(blocService.desaffecterBlocDeFoyer(idBloc));
    }

     //  Blocs sans foyer
    @GetMapping("/sans-foyer")
    public List<Bloc> getBlocsSansFoyer() {
        return blocService.getBlocsSansFoyer();
    }

    //  Blocs capacité > X
    @GetMapping("/capacite/{cap}")
    public List<Bloc> getByCapacite(@PathVariable Long cap) {
        return blocService.getBlocsByCapacite(cap);
    }

    // Blocs nom commence par A
    @GetMapping("/prefix/{prefix}")
    public List<Bloc> getByPrefix(@PathVariable String prefix) {
        return blocService.getBlocsByPrefix(prefix);
    }

    //   Blocs nom + capacité
    @GetMapping("/search")
    public List<Bloc> getByNomAndCapacite(
            @RequestParam String nom,
            @RequestParam Long capacite) {

        return blocService.getBlocsByNomAndCapacite(nom, capacite);
    }

    @GetMapping("/all")
    public List<Bloc> getAllBlocs() {
        return blocService.getAllBlocs();
    }
    

}
