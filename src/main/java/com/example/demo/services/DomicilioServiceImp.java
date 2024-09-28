package com.example.demo.services;


import com.example.demo.entities.Domicilio;
import com.example.demo.repositories.BaseRepository;
import com.example.demo.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImp extends BaseServiceImp<Domicilio, Long> implements DomicilioService {


    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImp(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }


}
