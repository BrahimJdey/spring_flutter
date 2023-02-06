package com.iscae.Planification_Emploi_Temps.Managment.Controllers;

import com.iscae.Planification_Emploi_Temps.Managment.Services.ProfesseurServices;
import com.iscae.Planification_Emploi_Temps.data.Models.Professeur;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emploi/auth")
public class ProfesseurController {
    final ProfesseurServices professeurServices;

    public ProfesseurController(ProfesseurServices professeurServices) {
        this.professeurServices = professeurServices;
    }
    @GetMapping("/professeur/all")
    public ResponseEntity<List<Professeur>> getAllProfesseur(){
        List<Professeur> professeurs= professeurServices.getProfesseur();
        return new ResponseEntity<>(professeurs, HttpStatus.OK);
    }

    @GetMapping("/professeur/find/{id}")
    public ResponseEntity<Professeur> getProfesseurById (@PathVariable("id") Integer id){
        Professeur professeur = professeurServices.findProfesseurById(id);
        return new ResponseEntity<>(professeur, HttpStatus.OK);
    }

    @PostMapping("/professeur/add")
    public ResponseEntity<Professeur> addProfesseur(@RequestBody Professeur professeur){
        Professeur newProfesseur = professeurServices.AddProfesseur(professeur);
        return new ResponseEntity<>(newProfesseur, HttpStatus.CREATED);
    }

    @PutMapping("/professeur/update")
    public ResponseEntity<Professeur> updateFiliere(@RequestBody Professeur professeur){
        Professeur upProfesseur = professeurServices.updateProfesseur(professeur);
        return new ResponseEntity<>(upProfesseur, HttpStatus.OK);
    }

    @DeleteMapping("/professeur/delete/{id}")
    public ResponseEntity<?> deleteProfesseur(@PathVariable("id") Integer id){
        professeurServices.deleteProfesseur(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
