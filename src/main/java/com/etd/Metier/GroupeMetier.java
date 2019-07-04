package com.etd.Metier;

import java.util.List;

import com.etd.Entities.Groupe;

public interface GroupeMetier {
	public Groupe saveGroupe(Groupe g);

	public List<Groupe> listGroupe();
}
