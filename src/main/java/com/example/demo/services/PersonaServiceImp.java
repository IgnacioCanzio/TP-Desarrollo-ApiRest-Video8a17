package com.example.demo.services;

import com.example.demo.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Persona;
import com.example.demo.repositories.PersonaRepository;

import java.util.List;

@Service //notacion para indicar que es un servicio
public class PersonaServiceImp extends BaseServiceImp<Persona, Long> implements PersonaService {
    
@Autowired
    private PersonaRepository personaRepository;

   public PersonaServiceImp(BaseRepository<Persona, Long> baseRepository) {
       super(baseRepository);
   }


    @Override
    public List<Persona> searchPersona(String filtro) throws Exception {
        try {
           // List<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            List<Persona> personas = personaRepository.searchNativo(filtro);
            return personas;

        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> searchPersona(String filtro, Pageable pageable) throws Exception {
        try {
            // List<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            Page<Persona> personas = personaRepository.searchNativo(filtro, pageable);
            return personas;

        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
