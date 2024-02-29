package com.projects.backend.proxyserver.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {

      RestTemplate restTemplate;

    private static String resourceUrl = "https://fakestoreapi.com/products";

   public String getProduct(Long id){
       restTemplate = new RestTemplate();
        resourceUrl = resourceUrl+"/"+id;
       ResponseEntity<String> response =  restTemplate.getForEntity(resourceUrl,String.class);
       return response.getBody();
   }

   public String getProducts(){
       restTemplate = new RestTemplate();

       ResponseEntity<String> response =  restTemplate.getForEntity(resourceUrl,String.class);
       return response.getBody();
   }
}
