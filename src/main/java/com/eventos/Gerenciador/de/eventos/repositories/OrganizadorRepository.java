package com.eventos.Gerenciador.de.eventos.repositories;

import com.eventos.Gerenciador.de.eventos.model.Organizador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizadorRepository extends JpaRepository<Organizador, Integer> {
}
