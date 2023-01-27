package com.iscae.Planification_Emploi_Temps.data.Repository;


import com.iscae.Planification_Emploi_Temps.data.Models.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<Cours,Integer> {



    // @Query(value = "select",nativeQuery = true)
    
    //List<Cours> findAllById(CoursPK);
}
