package com.example.demo.services;

import com.example.demo.entities.Base;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public interface BaseService<E extends Base, ID extends Serializable> { //metodos principales, con operaciones principales
    public List<E> findAll() throws Exception; //nos trae una lista de la entidad en la base de dato
    public Page<E> findAll(Pageable pageable) throws Exception;
    public E findById(ID id) throws  Exception;
    public E save(E entity) throws Exception;
    public E update(ID id,E entity) throws Exception;
    public boolean delete(ID id) throws  Exception;
}
