package com.iscae.Planification_Emploi_Temps.Login.Repository;


import com.iscae.Planification_Emploi_Temps.Login.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer>{
   Optional<User> findByEmail(String email);


}
