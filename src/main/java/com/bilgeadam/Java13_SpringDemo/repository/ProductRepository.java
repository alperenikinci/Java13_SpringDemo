package com.bilgeadam.Java13_SpringDemo.repository;

import com.bilgeadam.Java13_SpringDemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.nio.DoubleBuffer;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {


    //codeium
    Optional<Product> findByProductName(String productName);
    Optional<Product> findByProductNameIgnoreCase(String productName);

    List<Product> findAllByProductNameLikeIgnoreCase(String productName); //Isminde belirli bir kelime gecenleri getirir.
    List<Product> findAllByProductNameContainingIgnoreCase(String productName);
    List<Product> findAllByProductPriceBetween(Double start, Double end);



    List<Product> findAllByProductPriceGreaterThan(Double price);  // Girilen fiyatın üstündeki ürünleri listeleyiniz.
    List<Product> findAllByProductUnitInStockGreaterThan(Integer stock);// Belirli bir stok adedinin üzerindeki ürünleri listeleyiniz.
    List<Product> findAllByProductPriceGreaterThanEqual(Double price); // Belirli bir fiyata eşit ve bu fiyatın üstündeki ürünleri listeleyiniz.

    Integer countByProductCategoryIgnoreCase(String categoryName); // Bir kategoriye ait kaç adet ürün olduğunu listeleyiniz.
    Integer countByProductNameIgnoreCase(String productName); // Bir üründen kaç tane olduğunu listeleyiniz.
    Boolean existsByProductCategoryIgnoreCase(String categoryName); // Girilen kategorinin varlığını kontrol ediniz. (true, false)
    List<Product> findAllByProductCategoryNull(); // Kategorisi 'null' olan ürünleri listeleyiniz.
    List<Product> findAllByProductNameStartsWith(String firstLetter); // Baş harfi girilen kategoriye ait ürünleri listeleyiniz. Min 2 harf girdisiyle calisir.
}
