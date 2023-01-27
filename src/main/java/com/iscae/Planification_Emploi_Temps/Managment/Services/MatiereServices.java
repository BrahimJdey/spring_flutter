package com.iscae.Planification_Emploi_Temps.Managment.Services;

import com.iscae.Planification_Emploi_Temps.data.Models.Matiere;
import com.iscae.Planification_Emploi_Temps.data.Repository.Exception.FiliereNotFindException;
import com.iscae.Planification_Emploi_Temps.data.Repository.MatiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatiereServices {
    @Autowired
    private final MatiereRepository matiereRepository;

    public MatiereServices(MatiereRepository matiereRepository) {
        this.matiereRepository = matiereRepository;
    }

    public List<Matiere> getMatiere(){
        return  matiereRepository.findAll();
    }
    public Matiere AddMatiere(Matiere matiere){
        return matiereRepository.save(matiere);
    }
    public Matiere updateMatiere(Matiere matiere){
        return matiereRepository.save(matiere);
    }
    public Matiere findMatiereById(Integer id){
        return  matiereRepository.findById(id).orElseThrow(()->new FiliereNotFindException("Entrouvable!"+id+"was not find"));
    }
    public void deleteMatiere(Integer id){
        matiereRepository.deleteById(id);
    }

}
