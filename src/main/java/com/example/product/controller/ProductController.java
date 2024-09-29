package com.example.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.dto.ProductDto;

@RestController
@RequestMapping(value = "product")
public class ProductController {

    @GetMapping("/list")
    public List<ProductDto> list() {

        List<ProductDto> products = new ArrayList<>(3);

        ProductDto anggur = new ProductDto();
        anggur.setName("anggur");
        anggur.setDesc("ini anggur java");
        anggur.setCategory("Buah");
        anggur.setPict("fruite-item-5.jpg");
        anggur.setPrice(75000);
        anggur.setPrice_qty("Kg");
        products.add(anggur);

        ProductDto apel = new ProductDto();
        apel.setName("apel");
        apel.setDesc("ini apel java");
        apel.setCategory("Buah");
        apel.setPict("fruite-item-6.jpg");
        apel.setPrice(75000);
        apel.setPrice_qty("Kg");
        products.add(apel);

        return products;
    }

}
