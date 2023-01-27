package com.iscae.Planification_Emploi_Temps.Managment.Services;

import com.iscae.Planification_Emploi_Temps.data.Models.Cours;
import com.iscae.Planification_Emploi_Temps.data.Repository.CoursRepository;
import com.iscae.Planification_Emploi_Temps.data.Repository.Exception.FiliereNotFindException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursServices {
    private final CoursRepository coursRepository;


    public CoursServices(CoursRepository coursRepository) {
        this.coursRepository = coursRepository;
    }
    public Cours AddCours(Cours cours){
       return coursRepository.save(cours);
    }
public List<Cours> getCours(){
        return coursRepository.findAll();
}
    public Cours updateCours(Cours cours){
        return coursRepository.save(cours);
    }
    public Cours findCourseById(Integer id){
        return  coursRepository.findById(id).orElseThrow(()->new FiliereNotFindException("Classe by id"+id+"was not find"));
    }
    public void deleteCours(Integer id){
        coursRepository.deleteById(id);
    }

}
