package com.example.demo.services;

import com.example.demo.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonaService extends BaseService<Persona, Long>{

    List<Persona> searchPersona(String filtro) throws Exception;

    Page<Persona> searchPersona(String filtro, Pageable pageable) throws Exception;
}
