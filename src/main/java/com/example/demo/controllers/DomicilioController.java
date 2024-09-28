package com.example.demo.controllers;


import com.example.demo.entities.Domicilio;
import com.example.demo.services.DomicilioServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioController extends BaseControllerImp<Domicilio, DomicilioServiceImp>{


}

