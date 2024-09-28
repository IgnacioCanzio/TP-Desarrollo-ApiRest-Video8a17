package com.example.demo.services;

import com.example.demo.entities.Localidad;
import com.example.demo.repositories.BaseRepository;
import com.example.demo.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImp extends BaseServiceImp<Localidad, Long> implements LocalidadService {

    private LocalidadRepository localidadRepository;

    public LocalidadServiceImp(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }


}
