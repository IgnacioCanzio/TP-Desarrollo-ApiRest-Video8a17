package com.example.demo.controllers;


import com.example.demo.entities.Libro;
import com.example.demo.services.LibroServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros")
public class LibroController extends BaseControllerImp<Libro, LibroServiceImp>{


}
