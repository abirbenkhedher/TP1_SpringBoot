package com.abir.montres.service;

import java.util.List;

import com.abir.montres.entities.Montre;

public interface MontreService {
	Montre saveMontre(Montre p);
	Montre updateMontre(Montre p);
void deleteMontre(Montre p);
void deleteMontreById(Long id);
Montre getMontre(Long id);
List<Montre> getAllMontres();
}