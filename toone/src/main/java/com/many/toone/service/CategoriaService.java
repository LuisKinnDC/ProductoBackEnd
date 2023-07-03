package com.many.toone.service;

import com.many.toone.entity.Categoria;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoriaService {
    public List<Categoria> findAll();
}
