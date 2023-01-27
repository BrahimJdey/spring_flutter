package com.iscae.Planification_Emploi_Temps.Managment.Services;

import com.iscae.Planification_Emploi_Temps.data.Models.Salle;
import com.iscae.Planification_Emploi_Temps.data.Repository.Exception.FiliereNotFindException;
import com.iscae.Planification_Emploi_Temps.data.Repository.SalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalleServices {

    @Autowired
    private final SalleRepository salleRepository;

    public SalleServices(SalleRepository salleRepository) {
        this.salleRepository = salleRepository;
    }

    public List<Salle> getSalle(){
        return  salleRepository.findAll();
    }
    public Salle AddSalle(Salle matiere){
        return salleRepository.save(matiere);
    }
    public Salle updateSalle(Salle matiere){
        return salleRepository.save(matiere);
    }
    public Salle findSalleById(Integer id){
        return  salleRepository.findById(id).orElseThrow(()->new FiliereNotFindException("Entrouvable!"+id+"was not find"));
    }
    public void deleteSalle(Integer id){
        salleRepository.deleteById(id);
    }
}
