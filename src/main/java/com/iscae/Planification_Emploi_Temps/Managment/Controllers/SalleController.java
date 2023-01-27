package com.iscae.Planification_Emploi_Temps.Managment.Controllers;

import com.iscae.Planification_Emploi_Temps.Managment.Services.SalleServices;
import com.iscae.Planification_Emploi_Temps.data.Models.Salle;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salle")
public class SalleController {
    final SalleServices salleServices;

    public SalleController(SalleServices salleServices) {
        this.salleServices = salleServices;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Salle>> getAllSalle(){
        List<Salle> salles= salleServices.getSalle();
        return new ResponseEntity<>(salles, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Salle> getSalleById (@PathVariable("id") Integer id){
        Salle salle = salleServices.findSalleById(id);
        return new ResponseEntity<>(salle, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Salle> addSalle(@RequestBody Salle salle){
        Salle newSalle = salleServices.AddSalle(salle);
        return new ResponseEntity<>(salle, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Salle> updateFiliere(@RequestBody Salle salle){
        Salle upSalle = salleServices.updateSalle(salle);
        return new ResponseEntity<>(salle, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSalle(@PathVariable("id") Integer id){
        salleServices.deleteSalle(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
