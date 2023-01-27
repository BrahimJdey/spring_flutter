package com.iscae.Planification_Emploi_Temps.data.Repository;


import com.iscae.Planification_Emploi_Temps.data.Models.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalleRepository extends JpaRepository<Salle,Integer> {
}
