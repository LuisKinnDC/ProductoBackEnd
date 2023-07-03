package com.many.toone.service;

import com.many.toone.entity.Producto;
import com.many.toone.repository.ProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImp implements ProductoService{
    @Autowired
    private ProductoRepo productoRepo;
    @Override
    public Producto save(Producto producto) {
        return productoRepo.save(producto);
    }

    @Override
    public Producto findById(Long id) {
        return productoRepo.findById(id) .orElse(null);
    }

    @Override
    public List<Producto> findAll() {
        return productoRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        productoRepo.deleteById(id);
    }
}
