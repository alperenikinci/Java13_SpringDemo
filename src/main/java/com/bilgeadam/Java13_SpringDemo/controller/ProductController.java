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
                                                                // Bu bize ürün adında tam eşleşme varsa değer döner
                                                                // -> Markası "..." olanları getir gibi kullanılabilir.
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

    @GetMapping("/find-all-by-product-price-greater-than")
    public  List<Product> findAllByProductPriceGreaterThan(Double price){
        return productService.findAllByProductPriceGreaterThan(price);
    }

    @GetMapping("/find-all-by-product-unit-in-stock-greater-than")
    public List<Product> findAllByProductUnitInStockGreaterThanEqual(Integer stock){
        return productService.findAllByProductUnitInStockGreaterThan(stock);
    }

    @GetMapping("/find-all-by-product-price-greater-than-equal")
    public List<Product> findAllByProductPriceGreaterThanEqual(Double price){
        return productService.findAllByProductPriceGreaterThanEqual(price);
    }

    @GetMapping("/count-by-product-category-ignore-case") //ignore-case'i endpoint'e yazmasak da olur.
    public Integer countByProductCategoryIgnoreCase(String categoryName){
        return productService.countByProductCategoryIgnoreCase(categoryName);
    }


    @GetMapping("/count-by-product-name-ignore-case") //ignore-case'i endpoint'e yazmasak da olur.
    public  Integer countByProductNameIgnoreCase(String productName){
        return productService.countByProductNameIgnoreCase(productName);
    }

    @GetMapping("/exists-by-product-category-ignore-case") //ignore-case'i endpoint'e yazmasak da olur.
    public Boolean existsByProductCategoryIgnoreCase(String categoryName){
        return productService.existsByProductCategoryIgnoreCase(categoryName);
    }

    @GetMapping("/find-all-by-product-category-null")
    public List<Product> findAllByProductCategoryNull(){
        return productService.findAllByProductCategoryNull();
    }

    @GetMapping("/find-all-by-product-name-starts-with")
    public List<Product> findAllByProductNameStartsWith(String firstLetter){
        return productService.findAllByProductNameStartsWith(firstLetter);
    }



}
