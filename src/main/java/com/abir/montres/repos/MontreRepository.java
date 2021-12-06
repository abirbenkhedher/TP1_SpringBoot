package com.abir.montres.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abir.montres.entities.Montre;

public interface MontreRepository extends JpaRepository<Montre, Long> {
}