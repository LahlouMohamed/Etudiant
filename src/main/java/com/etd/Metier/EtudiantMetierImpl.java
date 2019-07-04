package com.etd.Metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.etd.Dao.EtudiantRepository;
import com.etd.Entities.Etudiant;

@Service
public class EtudiantMetierImpl implements EtudiantMetier {

	@Autowired
	private EtudiantRepository E;

	@Override
	public Etudiant saveEtudiant(Etudiant e) {
		return E.save(e);
	}

	@Override
	public List<Etudiant> listEtudiant() {
		return E.findAll();
	}

	@Override
	public Etudiant Etudiant(Long id) {
		return E.findOne(id);
	}

}
