package com.etd.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.etd.Entities.Etudiant;
import com.etd.Metier.EtudiantMetier;

@RestController
public class EtudiantRestService {
	@Autowired
	private EtudiantMetier etudiantMetier;

	@RequestMapping(value="/Etudiants",method=RequestMethod.POST)
	public Etudiant saveEtudiant(@RequestBody Etudiant e) {
		return etudiantMetier.saveEtudiant(e);
	}
	
	@RequestMapping(value="/Etudiants",method=RequestMethod.GET)
	public List<Etudiant> listEtudiant() {
		return etudiantMetier.listEtudiant();
	}
	
	@RequestMapping(value="/Etudiants/{code}",method=RequestMethod.GET)
	public Etudiant Etudiant(@PathVariable  long code) {
		return etudiantMetier.Etudiant(code);
	}
}
