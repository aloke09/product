package com.bridgelabz.product.controller;

import com.bridgelabz.product.model.product;
import com.bridgelabz.product.service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdController
{
    @Autowired
    ProdService service;

    @GetMapping("/prod")
    public List<product> getAll()
    {
        return service.getAll();
    }

    @GetMapping("/prod/{id}")
    public product getByID(@PathVariable int id)
    {
        return service.getById(id);
    }

    @PostMapping("/prod")
    public product insert(@RequestBody product product)
    {
        return service.insert(product);
    }

    @PutMapping("/prod")
    public product update(@RequestBody product product)
    {
        return service.update(product);
    }

    @DeleteMapping("/prod/{id}")
    public void deleteById(@PathVariable int id)
    {
        service.deleteById(id);
    }
}
