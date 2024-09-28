package com.example.demo.services;

import com.example.demo.entities.Libro;
import com.example.demo.repositories.BaseRepository;
import com.example.demo.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImp extends BaseServiceImp<Libro, Long> implements LibroService {


    private LibroRepository libroRepository;

    public LibroServiceImp(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }


}
