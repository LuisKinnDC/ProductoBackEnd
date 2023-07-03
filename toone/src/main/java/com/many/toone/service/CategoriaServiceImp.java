package com.many.toone.service;

import com.many.toone.entity.Categoria;
import com.many.toone.repository.CategoriaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImp implements CategoriaService{
    @Autowired
    private CategoriaRepo categoriaRepo;
    @Override
    public List<Categoria> findAll() {
        return categoriaRepo.findAll();
    }
}
