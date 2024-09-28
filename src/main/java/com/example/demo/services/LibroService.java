package com.example.demo.services;

import com.example.demo.entities.Libro;
import org.springframework.stereotype.Service;

@Service
public interface LibroService extends BaseService<Libro, Long> {
}
