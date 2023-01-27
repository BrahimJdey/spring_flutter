package com.iscae.Planification_Emploi_Temps.Managment.Controllers;

import com.iscae.Planification_Emploi_Temps.Managment.Services.MatiereServices;
import com.iscae.Planification_Emploi_Temps.data.Models.Matiere;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matiere")
public class MatiereController {
    final MatiereServices matiereServices;

    public MatiereController(MatiereServices matiereServices) {
        this.matiereServices = matiereServices;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Matiere>> getAllMatiere(){
        List<Matiere> matieres= matiereServices.getMatiere();
        return new ResponseEntity<>(matieres, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Matiere> getMatiereById (@PathVariable("id") Integer id){
        Matiere matiere = matiereServices.findMatiereById(id);
        return new ResponseEntity<>(matiere, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Matiere> addMatiere(@RequestBody Matiere matiere){
        Matiere newMatiere = matiereServices.AddMatiere(matiere);
        return new ResponseEntity<>(newMatiere, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Matiere> updateFiliere(@RequestBody Matiere matiere){
        Matiere upMatiere = matiereServices.updateMatiere(matiere);
        return new ResponseEntity<>(upMatiere, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMatiere(@PathVariable("id") Integer id){
        matiereServices.deleteMatiere(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
