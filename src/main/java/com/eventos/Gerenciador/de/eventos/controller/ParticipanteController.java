package com.eventos.Gerenciador.de.eventos.controller;

import com.eventos.Gerenciador.de.eventos.model.Participante;
import com.eventos.Gerenciador.de.eventos.repositories.ParticipanteRepository;
import com.eventos.Gerenciador.de.eventos.service.ParticipanteService;
import jakarta.servlet.http.Part;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/participante")
public class ParticipanteController {


    @Autowired
    ParticipanteService service;

    @PostMapping("/registrar")
    public ResponseEntity<Participante> registrar(@Valid @RequestBody Participante participante){
        Participante salvo = service.registrar(participante);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(salvo.getId_participante())
                .toUri();

        return ResponseEntity.created(location).body(salvo);
    }
}
