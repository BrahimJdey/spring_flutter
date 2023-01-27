package com.iscae.Planification_Emploi_Temps.Managment.Services;

import com.iscae.Planification_Emploi_Temps.data.Models.Professeur;
import com.iscae.Planification_Emploi_Temps.data.Repository.Exception.FiliereNotFindException;
import com.iscae.Planification_Emploi_Temps.data.Repository.ProfesseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesseurServices {
    @Autowired
    private final ProfesseurRepository professeurRepository;

    public ProfesseurServices(ProfesseurRepository professeurRepository) {
        this.professeurRepository = professeurRepository;
    }

    public List<Professeur> getProfesseur(){
        return  professeurRepository.findAll();
    }
    public Professeur AddProfesseur(Professeur professeur){
        return professeurRepository.save(professeur);
    }
    public Professeur updateProfesseur(Professeur professeur){
        return professeurRepository.save(professeur);
    }
    public Professeur findProfesseurById(Integer id){
        return  professeurRepository.findById(id).orElseThrow(()->new FiliereNotFindException("Entrouvable!"+id+"was not find"));
    }
    public void deleteProfesseur(Integer id){
        professeurRepository.deleteById(id);
    }

}
