package com.iscae.Planification_Emploi_Temps.Managment.Services;

import com.iscae.Planification_Emploi_Temps.data.Models.Filiere;
import com.iscae.Planification_Emploi_Temps.data.Repository.Exception.FiliereNotFindException;
import com.iscae.Planification_Emploi_Temps.data.Repository.FiliereRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FiliereServices {
private final FiliereRepository filiereRepository;

    public FiliereServices(FiliereRepository filiereRepository) {
        this.filiereRepository = filiereRepository;
    }
    public Filiere AddFiliere(Filiere filiere){
        return filiereRepository.save(filiere);
    }

    public List<Filiere> getFilieres(){
        return filiereRepository.findAll();
    }

    public Filiere updateFiliere(Filiere filiere){
        return filiereRepository.save(filiere);
    }
    public Filiere findFiliereById(Integer id){
        return  filiereRepository.findById(id).orElseThrow(()->new FiliereNotFindException("Classe by id"+id+"was not find"));
    }
    public void deleteFiliere(Integer id){
        filiereRepository.deleteById(id);
    }

}
