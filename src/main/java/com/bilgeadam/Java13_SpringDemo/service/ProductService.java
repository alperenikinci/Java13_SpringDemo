package com.bilgeadam.Java13_SpringDemo.service;

import com.bilgeadam.Java13_SpringDemo.entity.Product;
import com.bilgeadam.Java13_SpringDemo.repository.ProductRepository;
import com.bilgeadam.Java13_SpringDemo.utility.IService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService implements IService<Product,Long> {

    private final ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(Product.builder()
                        .productName(product.getProductName())
                        .productCategory(product.getProductCategory())
                        .productPrice(product.getProductPrice())
                        .productUnitInStock(product.getProductUnitInStock())
                        .productDescription(product.getProductDescription())
                .build());
    }
    @Override
    public Product update(Product product) {
        Optional<Product> product1 = productRepository.findById(product.getId());

        if(product1.isEmpty()){
            //exception fırlatıyorum.
        }
        return productRepository.save(product);
    }

    @Override
    public Iterable<Product> saveAll(Iterable<Product> t) {
        return productRepository.saveAll(t);
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findByProductName(String productName){
        if(productName.equalsIgnoreCase(productRepository.findByProductName(productName).get().getProductName())){
            return productRepository.findByProductName(productName);
        }
        return Optional.empty();
    }

    public Optional<Product> findByProductNameIgnoreCase(String productName){
        return productRepository.findByProductNameIgnoreCase(productName);
    }
    public  List<Product> findAllByProductNameLikeIgnoreCase(String productName){
        return productRepository.findAllByProductNameLikeIgnoreCase(productName);
    }

    public List<Product> findAllByProductNameContainingIgnoreCase(String productName){
        return productRepository.findAllByProductNameContainingIgnoreCase(productName);
    }

    public List<Product> findAllByProductPriceBetween(Double start, Double end){
        return productRepository.findAllByProductPriceBetween(start,end);
    }

    public  List<Product> findAllByProductPriceGreaterThan(Double price){
        return productRepository.findAllByProductPriceGreaterThan(price);
    }

    public List<Product> findAllByProductUnitInStockGreaterThan(Integer stock){
        return productRepository.findAllByProductUnitInStockGreaterThan(stock);
    }

    public List<Product> findAllByProductPriceGreaterThanEqual(Double price){
        return productRepository.findAllByProductPriceGreaterThanEqual(price);
    }

    public Integer countByProductCategoryIgnoreCase(String categoryName){
        return productRepository.countByProductCategoryIgnoreCase(categoryName);
    }

    public  Integer countByProductNameIgnoreCase(String productName){
        return productRepository.countByProductNameIgnoreCase(productName);
    }

    public Boolean existsByProductCategoryIgnoreCase(String categoryName){
        return productRepository.existsByProductCategoryIgnoreCase(categoryName);
    }

    public List<Product> findAllByProductCategoryNull(){
        return productRepository.findAllByProductCategoryNull();
    }

    public List<Product> findAllByProductNameStartsWith(String firstLetter){
        return productRepository.findAllByProductNameStartsWith(firstLetter);
    }


}
