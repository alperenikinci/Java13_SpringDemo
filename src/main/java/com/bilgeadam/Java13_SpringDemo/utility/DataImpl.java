//package com.bilgeadam.Java13_SpringDemo.utility;
//
//import com.bilgeadam.Java13_SpringDemo.entity.Product;
//import com.bilgeadam.Java13_SpringDemo.service.ProductService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//@RequiredArgsConstructor
//public class DataImpl implements ApplicationRunner {
//    private final ProductService productService;
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        createProducts();
//    }
//
//    private void createProducts() {
//        productService.saveAll(List.of(
//                Product.builder()
//                        .productName("Apple IPhone 15")
//                        .productCategory("Smartphone")
//                        .productPrice(1500D)
//                        .productUnitInStock(50)
//                        .productDescription("Apple Iphone")
//                .build(),
//                Product.builder()
//                        .productName("Samsung Galaxy S22")
//                        .productCategory("Smartphone")
//                        .productPrice(1300D)
//                        .productUnitInStock(0)
//                        .productDescription("Samsung Iphone")
//                        .build(),
//
//                Product.builder()
//                        .productName("Apple Airpods Pro")
//                        .productCategory("Earphones")
//                        .productPrice(200D)
//                        .productUnitInStock(50)
//                        .productDescription("Apple Earpods")
//                        .build(),
//
//                Product.builder()
//                        .productName("Tesla Model S Plaid")
//                        .productPrice(80000D)
//                        .productUnitInStock(70)
//                        .productDescription("Tesla")
//                        .build()
//
//        ));
//    }
//}
