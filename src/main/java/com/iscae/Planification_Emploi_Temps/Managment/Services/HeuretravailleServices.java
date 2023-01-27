package com.iscae.Planification_Emploi_Temps.Managment.Services;

import com.iscae.Planification_Emploi_Temps.data.Models.Heuretravailleparjour;
import com.iscae.Planification_Emploi_Temps.data.Repository.Exception.FiliereNotFindException;
import com.iscae.Planification_Emploi_Temps.data.Repository.HeuretravailleparjourRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeuretravailleServices {
    private final HeuretravailleparjourRepository htRepository;

    public HeuretravailleServices(HeuretravailleparjourRepository htRepository) {
        this.htRepository = htRepository;
    }

    public List<Heuretravailleparjour> getHeuretravailleparjour(){
        return  htRepository.findAll();
    }
    public Heuretravailleparjour AddHeuretravailleparjour(Heuretravailleparjour heuretravaille){
        return htRepository.save(heuretravaille);
    }
    public Heuretravailleparjour updateHeuretravailleparjour(Heuretravailleparjour heuretravaille){
        return htRepository.save(heuretravaille);
    }
    public Heuretravailleparjour findHeuretravailleparjourById(Integer id){
        return  htRepository.findById(id).orElseThrow(()->new FiliereNotFindException("Entrouvable!"+id+"was not find"));
    }
    public void deleteHeuretravailleparjour(Integer id){
        htRepository.deleteById(id);
    }

}
