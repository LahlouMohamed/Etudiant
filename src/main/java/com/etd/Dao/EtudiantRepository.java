package com.etd.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etd.Entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> 
{

}
