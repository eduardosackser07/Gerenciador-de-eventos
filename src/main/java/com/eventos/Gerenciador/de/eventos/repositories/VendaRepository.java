package com.eventos.Gerenciador.de.eventos.repositories;

import com.eventos.Gerenciador.de.eventos.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda, Integer> {
}
