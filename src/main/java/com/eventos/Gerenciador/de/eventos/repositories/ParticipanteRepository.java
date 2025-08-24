package com.eventos.Gerenciador.de.eventos.repositories;

import com.eventos.Gerenciador.de.eventos.model.Participante;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ParticipanteRepository extends JpaRepository<Participante, Integer> {
    Optional<Participante> findByEmailAndSenha(String email, String senha);
}
