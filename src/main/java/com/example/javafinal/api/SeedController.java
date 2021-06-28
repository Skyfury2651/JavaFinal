package com.example.javafinal.api;

import com.example.javafinal.entity.Product;
import com.example.javafinal.repository.SaleRepository;
import com.example.javafinal.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/")
public class SeedController {

    @Autowired
    private SaleRepository saleRepository;

    @GetMapping(value = "seeding")
    public boolean seeding() {
        Product product1 = new Product(1,"Product 1","description 1", DateTimeUtils.getCurrentTimeInMLS(),20.00);


    }
}
