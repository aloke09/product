package com.bridgelabz.product.repo;

import com.bridgelabz.product.model.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdRepo extends JpaRepository<product,Integer>
{

}
