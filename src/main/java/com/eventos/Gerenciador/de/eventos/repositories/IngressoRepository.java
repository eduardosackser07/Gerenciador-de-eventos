package com.eventos.Gerenciador.de.eventos.repositories;

import com.eventos.Gerenciador.de.eventos.model.Ingresso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngressoRepository extends JpaRepository<Ingresso, Integer> {
}
