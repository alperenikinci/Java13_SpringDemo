package com.bilgeadam.Java13_SpringDemo.controller;

import com.bilgeadam.Java13_SpringDemo.entity.Product;
import com.bilgeadam.Java13_SpringDemo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/save")
    public Product save(Product product){
        return productService.save(product);
    }
    @GetMapping("/find-all")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/find-by-id")
    public Optional<Product> findById(Long id){
        return productService.findById(id);
    }

    @GetMapping("/update") //PutMapping ile yapmaya calisirsam, PUT request yollarsam 405(Forbidden) dönecektir.
    public Product update(Product product){
        return productService.update(product);
    }

    @GetMapping("/find-by-product-name")
    public Optional<Product> findByProductName(String productName){
        return productService.findByProductName(productName);
    }
    @GetMapping("/find-by-product-name-ignore-case")
    public Optional<Product> findByProductNameIgnoreCase(String productName){
        return productService.findByProductNameIgnoreCase(productName);
    }
    @GetMapping("/find-all-by-product-name-like-ignore-case") //-> Bunun yerine containing kullanmak gerekiyor.
    public  List<Product> findAllByProductNameLikeIgnoreCase(String productName){
        return productService.findAllByProductNameLikeIgnoreCase(productName);
    }

    @GetMapping("/find-all-by-product-name-containing-ignore-case") //http://localhost:8080/product/find-all-by-product-name-containing-ignore-case?name=Be
    public List<Product> findAllByProductNameContainingIgnoreCase(String name){
        return productService.findAllByProductNameContainingIgnoreCase(name);
    }

    @GetMapping("/find-all-by-product-price-between")
    public List<Product> findAllByProductPriceBetween(Double start, Double end){
        return productService.findAllByProductPriceBetween(start,end);
    }


}
