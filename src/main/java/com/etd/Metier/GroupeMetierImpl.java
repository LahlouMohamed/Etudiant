package com.etd.Metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etd.Dao.GroupeRepository;
import com.etd.Entities.Groupe;
@Service
public class GroupeMetierImpl implements GroupeMetier{
	@Autowired
	private GroupeRepository G;
	@Override
	public Groupe saveGroupe(Groupe g) {
		return G.save(g);
	}

	@Override
	public List<Groupe> listGroupe() {
		return G.findAll();
	}

}
