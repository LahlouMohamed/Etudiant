package com.etd.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.etd.Entities.Groupe;
import com.etd.Metier.GroupeMetier;

@RestController
public class GroupeRestService {

	@Autowired
	private GroupeMetier groupetMetier;
	@RequestMapping(value="/Groupes",method=RequestMethod.POST)
	public Groupe saveEtudiant(@RequestBody Groupe g) {
//		Groupe g=new Groupe();
//		g.setLibelle(libelle);
		return groupetMetier.saveGroupe(g);
	}
}
