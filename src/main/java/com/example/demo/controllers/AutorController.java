package com.example.demo.controllers;


import com.example.demo.entities.Autor;
import com.example.demo.services.AutorServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImp<Autor, AutorServiceImp>{



}
