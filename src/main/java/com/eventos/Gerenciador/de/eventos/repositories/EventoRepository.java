package com.eventos.Gerenciador.de.eventos.repositories;

import com.eventos.Gerenciador.de.eventos.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Integer> {
}
