package com.abir.montres.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abir.montres.entities.Montre;
import com.abir.montres.repos.MontreRepository;

@Service
public class MontreServiceImpl implements MontreService {
@Autowired
MontreRepository montreRepository;
@Override
public Montre saveMontre(Montre p) {
return montreRepository.save(p);
}
@Override
public Montre updateMontre(Montre p) {
return montreRepository.save(p);
}
@Override
public void deleteMontre(Montre p) {
	montreRepository.delete(p);
}
@Override
public void deleteMontreById(Long id) {
	montreRepository.deleteById(id);
}
@Override
public Montre getMontre(Long id) {
return montreRepository.findById(id).get();
}
@Override
public List<Montre> getAllMontres() {
return montreRepository.findAll();
}
}
