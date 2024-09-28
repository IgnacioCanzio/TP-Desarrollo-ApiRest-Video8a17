package com.example.demo.services;

import com.example.demo.entities.Autor;
import com.example.demo.repositories.AutorRepository;
import com.example.demo.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImp extends BaseServiceImp<Autor, Long> implements AutorService {


    private AutorRepository autorRepository;

public AutorServiceImp(BaseRepository<Autor, Long> baseRepository) {
    super(baseRepository);
}

}