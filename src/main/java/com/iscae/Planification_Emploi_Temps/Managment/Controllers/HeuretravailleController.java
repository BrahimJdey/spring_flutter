package com.iscae.Planification_Emploi_Temps.Managment.Controllers;

import com.iscae.Planification_Emploi_Temps.Managment.Services.HeuretravailleServices;
import com.iscae.Planification_Emploi_Temps.data.Models.Heuretravailleparjour;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/htp")
public class HeuretravailleController {

    final HeuretravailleServices htjServices;

    public HeuretravailleController(HeuretravailleServices htjServices) {
        this.htjServices = htjServices;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Heuretravailleparjour>> getAllHeuretravailleparjour(){
        List<Heuretravailleparjour> hts= htjServices.getHeuretravailleparjour();
        return new ResponseEntity<>(hts, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Heuretravailleparjour> getHeuretravailleparjourById (@PathVariable("id") Integer id){
        Heuretravailleparjour ht = htjServices.findHeuretravailleparjourById(id);
        return new ResponseEntity<>(ht, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Heuretravailleparjour> addHeuretravailleparjour(@RequestBody Heuretravailleparjour ht){
        Heuretravailleparjour newHeuretravailleparjour = htjServices.AddHeuretravailleparjour(ht);
        return new ResponseEntity<>(ht, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Heuretravailleparjour> updateHeuretravailleparjour(@RequestBody Heuretravailleparjour ht){
        Heuretravailleparjour upHeuretravailleparjour = htjServices.updateHeuretravailleparjour(ht);
        return new ResponseEntity<>(ht, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteHeuretravailleparjour(@PathVariable("id") Integer id){
        htjServices.deleteHeuretravailleparjour(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
