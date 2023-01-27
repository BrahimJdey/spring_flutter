package com.iscae.Planification_Emploi_Temps.data.Repository;


import com.iscae.Planification_Emploi_Temps.data.Models.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FiliereRepository extends JpaRepository<Filiere, Integer> {

}
