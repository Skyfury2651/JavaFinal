package com.example.javafinal.api;

import com.example.javafinal.entity.Product;
import com.example.javafinal.entity.Sale;
import com.example.javafinal.repository.ProductRepository;
import com.example.javafinal.repository.SaleRepository;
import com.example.javafinal.utils.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value = "/api/v1/")
public class SeedController {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(value = "seeding")
    public boolean seeding() {
        Product product1 = new Product("Tivi Samsung", "Sản phẩm tốt nhất", DateTimeUtils.getCurrentTimeInMLS(), 10000000.00);
        Product product2 = new Product("Tivi Samsung 2", "Sản phẩm tốt nhất", DateTimeUtils.getCurrentTimeInMLS(), 10000000.00);
        Product product3 = new Product("Tivi Samsung 3", "Sản phẩm tốt nhất", DateTimeUtils.getCurrentTimeInMLS(), 10000000.00);
        Product product4 = new Product("Tivi Samsung 4", "Sản phẩm tốt nhất", DateTimeUtils.getCurrentTimeInMLS(), 10000000.00);
        Product product5 = new Product("Tivi Samsung 5 ", "Sản phẩm tốt nhất", DateTimeUtils.getCurrentTimeInMLS(), 10000000.00);
        Product product6 = new Product("Tivi Samsung 6", "Sản phẩm tốt nhất", DateTimeUtils.getCurrentTimeInMLS(), 10000000.00);
        Product product7 = new Product("Tivi Samsung 7 ", "Sản phẩm tốt nhất", DateTimeUtils.getCurrentTimeInMLS(), 10000000.00);
        Product product8 = new Product("Tivi Samsung 8", "Sản phẩm tốt nhất", DateTimeUtils.getCurrentTimeInMLS(), 10000000.00);
        Product product9 = new Product("Tivi Samsung 9", "Sản phẩm tốt nhất", DateTimeUtils.getCurrentTimeInMLS(), 10000000.00);


        List<Product> products = Arrays.asList(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10);
        productRepository.saveAll(products);

        return true;
    }
}
