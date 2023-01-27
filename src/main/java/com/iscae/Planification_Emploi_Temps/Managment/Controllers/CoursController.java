package com.iscae.Planification_Emploi_Temps.Managment.Controllers;

import com.iscae.Planification_Emploi_Temps.Managment.Services.CoursServices;
import com.iscae.Planification_Emploi_Temps.data.Models.Cours;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cours")
public class CoursController {
    private CoursServices coursServices;
    public CoursController(CoursServices coursServices){
        this.coursServices=coursServices;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Cours>> getAllCours(){
        List<Cours> cours = coursServices.getCours();
        return new ResponseEntity<>(cours, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Cours> addCours(@RequestBody Cours cours){
        Cours newCours = coursServices.AddCours(cours);
        return new ResponseEntity<>(newCours, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Cours> updateCours(@RequestBody Cours professeur){
        Cours upCours = coursServices.updateCours(professeur);
        return new ResponseEntity<>(upCours, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCours(@PathVariable("id") Integer id){
        coursServices.deleteCours(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
