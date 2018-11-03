package com.sid.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sid.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe,Integer> {
@Query(value="SELECT * FROM employe where login=:login and mdp=:pass",nativeQuery=true)
Employe auth(@Param("login") String login,@Param("pass") String pass);

/*
 @Query(value="SELECT * FROM employe where anciennete=:anciennete",nativeQuery=true)
Employe ancien(@Param("anciennete") Boolean anciennete);
*/
}
