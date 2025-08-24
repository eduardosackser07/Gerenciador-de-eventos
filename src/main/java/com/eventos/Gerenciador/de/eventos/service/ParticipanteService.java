package com.eventos.Gerenciador.de.eventos.service;

import com.eventos.Gerenciador.de.eventos.model.Participante;
import com.eventos.Gerenciador.de.eventos.repositories.ParticipanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipanteService {

    @Autowired
    ParticipanteRepository repository;

    public Participante registrar(Participante participante){
        return repository.save(participante);
    }
}
