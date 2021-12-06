package com.abir.montres;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.abir.montres.entities.Montre;
import com.abir.montres.repos.MontreRepository;

@SpringBootTest
class MontresApplicationTests {

	@Autowired
	private MontreRepository montreRepository;
	@Test
	public void testCreateMontre() {
	Montre prod = new Montre("Rolex",25000000.0);
	
		montreRepository.save(prod);
		
	}
	
	@Test
	public void testFindMontre()
	{
		Montre p = montreRepository.findById(1L).get();

	System.out.println(p);
	}
	@Test
	public void testUpdateProduit()
	{
		Montre p = montreRepository.findById(2L).get();
	p.setPrixMontre(26000000.0);
	montreRepository.save(p);
	}
	@Test
	public void testDeleteProduit()
	{
		montreRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousProduits()
	{
	List<Montre> prods = montreRepository.findAll();
	for (Montre p : prods)
	{
		System.out.println(p);
	}

	}
	}
