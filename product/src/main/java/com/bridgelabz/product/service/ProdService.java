package com.bridgelabz.product.service;

import com.bridgelabz.product.model.product;
import com.bridgelabz.product.repo.ProdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdService
{
    @Autowired
    ProdRepo repo;

    public List<product> getAll()
    {
        return repo.findAll();
    }

    public product getById(int id)
    {
        return repo.findById(id).orElse(null);
    }

    public product insert(product product)
    {
        return repo.save(product);
    }

    public product update(product product)
    {
        product existing = repo.findById(product.getProdId()).orElse(null);
        existing.setProdNme(product.getProdNme());
        existing.setProdPrice(product.getProdPrice());
        return repo.save(existing);
    }

    public void deleteById(int id)
    {
        repo.deleteById(id);
    }

}
