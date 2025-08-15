package com.eventos.Gerenciador.de.eventos.model;

import com.eventos.Gerenciador.de.eventos.repositories.OrganizadorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrganizadorTest {

    @Autowired
    OrganizadorRepository orgRes;

    @Test
    void testeSaveOrganizador(){
        Organizador org = new Organizador();

        org.setEmail("testeorg@gmail.com");
        org.setNome("teste da silva 1");
        org.setTelefone("51999999999");

        orgRes.save(org);


    }
}