package br.com.ajvieiraa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ajvieiraa.model.Cambio;

public interface cambioRepository extends JpaRepository<Cambio, Long>{

	Cambio findByFromAndTo(String from, String to);
	
}
