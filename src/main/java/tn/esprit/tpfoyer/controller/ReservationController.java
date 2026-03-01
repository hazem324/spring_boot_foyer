package tn.esprit.tpfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.services.IReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservation")
@AllArgsConstructor
public class ReservationController {
    final IReservationService reservationService;

    @PostMapping("/add")
    Reservation addReservation(@RequestBody Reservation reservation){
        return reservationService.addOrUpdateReservation(reservation);
    }

    @PutMapping("/update")
    Reservation updateReservation(@RequestBody Reservation reservation){
        return reservationService.addOrUpdateReservation(reservation);
    }

    @DeleteMapping("/delete/{idReservation}")
    void deleteReservation(@PathVariable String idReservation){
        reservationService.deleteReservation(idReservation);
    }

    @GetMapping("/findAll")
    List<Reservation> findAllReservations(){
        return reservationService.findAllReservations();
    }

    @GetMapping("/findById/{idReservation}")
    Reservation findReservation(@PathVariable String idReservation){
        return reservationService.findReservation(idReservation);
    }
}
