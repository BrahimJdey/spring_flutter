package com.iscae.Planification_Emploi_Temps.data.Repository;

import com.iscae.Planification_Emploi_Temps.data.Models.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatiereRepository extends JpaRepository<Matiere, Integer> {
}
