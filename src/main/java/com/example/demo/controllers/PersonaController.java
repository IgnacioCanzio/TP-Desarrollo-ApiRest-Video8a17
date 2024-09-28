package com.example.demo.controllers;

import com.example.demo.services.BaseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Persona;
import com.example.demo.services.PersonaServiceImp;



@RestController
@CrossOrigin(origins ="*") //con esto permitimos el ingreso a nuestra API de distintos origens
@RequestMapping(path ="api/v1/personas") // en esta url encontramos los metodos de persona
public class PersonaController extends BaseControllerImp<Persona, PersonaServiceImp> {

    @GetMapping("/search")
    public ResponseEntity<?> searchPersona(@RequestParam String filtro){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchPersona(filtro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"" + e.getMessage() + "\"}");
        }
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchPersona(@RequestParam String filtro, Pageable pageable){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchPersona(filtro, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"" + e.getMessage() + "\"}");
        }
    }


    @Override
    public ResponseEntity<?> getAll(java.awt.print.Pageable pageable) {
        return null;
    }
}
