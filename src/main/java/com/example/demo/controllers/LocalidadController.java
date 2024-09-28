package com.example.demo.controllers;

import com.example.demo.entities.Localidad;
import com.example.demo.services.LocalidadServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImp<Localidad, LocalidadServiceImp> {


}
