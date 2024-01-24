package com.bilgeadam.Java13_SpringDemo.repository;

import com.bilgeadam.Java13_SpringDemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    /*
    # Ürün ismine göre ürünü bulunuz.
# Ürün isminin içerdiği harf veya kelimeye göre ürünü bulunuz.
# Belirli fiyat aralığındaki ürünleri listeleyiniz.
     */
    //codeium
    Optional<Product> findByProductName(String productName);
    Optional<Product> findByProductNameIgnoreCase(String productName);

    List<Product> findAllByProductNameLikeIgnoreCase(String productName);
    List<Product> findAllByProductNameContainingIgnoreCase(String productName);
    List<Product> findAllByProductPriceBetween(Double start, Double end);
}
