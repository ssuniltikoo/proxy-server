package com.projects.backend.proxyserver.controller;

import com.projects.backend.proxyserver.services.ProductService;
import lombok.Data;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class ProductController {

    private final ProductService productService;

    public  ProductController(final ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/products/{id}")
    public String getProductDetails(@PathVariable("id") Long id)
    {
        System.out.println("GET request for product with id "+ id);
        return productService.getProduct(id);
     //return "produc id" + id+ "under maintenance";
    }

    @GetMapping("/products")
    public String getProductDetails()
    {
        System.out.println("GET request for all product  ");
        return productService.getProducts();
        //return "produc id" + id+ "under maintenance";
    }

}
