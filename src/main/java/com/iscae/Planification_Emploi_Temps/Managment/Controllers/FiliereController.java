package com.iscae.Planification_Emploi_Temps.Managment.Controllers;

import com.iscae.Planification_Emploi_Temps.Managment.Services.FiliereServices;
import com.iscae.Planification_Emploi_Temps.data.Models.Filiere;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filiere")
public class FiliereController {
final FiliereServices filiereServices;

    public FiliereController(FiliereServices filiereServices) {
        this.filiereServices = filiereServices;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Filiere>> getAllFiliere(){
        List<Filiere> filieres= filiereServices.getFilieres();
        return new ResponseEntity<>(filieres, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Filiere> getFiliereById (@PathVariable("id") Integer id){
        Filiere filiere = filiereServices.findFiliereById(id);
        return new ResponseEntity<>(filiere, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Filiere> addFiliere(@RequestBody Filiere filiere){
        Filiere newFiliere = filiereServices.AddFiliere(filiere);
        return new ResponseEntity<>(newFiliere, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Filiere> updateFiliere(@RequestBody Filiere filiere){
        Filiere upFiliere = filiereServices.updateFiliere(filiere);
        return new ResponseEntity<>(upFiliere, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFiliere(@PathVariable("id") Integer id){
        filiereServices.deleteFiliere(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
