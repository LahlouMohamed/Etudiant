package com.etd.Metier;

import java.util.List;

import com.etd.Entities.Etudiant;

public interface EtudiantMetier {
	public Etudiant saveEtudiant(Etudiant e);

	public List<Etudiant> listEtudiant();
	
	public Etudiant Etudiant(Long id);
}
