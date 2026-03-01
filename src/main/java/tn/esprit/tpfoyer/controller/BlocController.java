package tn.esprit.tpfoyer.controller;

import lombok.AllArgsConstructor;
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
}
