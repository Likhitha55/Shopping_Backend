package com.shoppingwebsite.database.api.Database.API.controller;

import com.shoppingwebsite.database.api.Database.API.DTO.RequestBody.ProductReqBody;
import com.shoppingwebsite.database.api.Database.API.models.PortalUser;
import com.shoppingwebsite.database.api.Database.API.models.Product;
import com.shoppingwebsite.database.api.Database.API.repository.PortalUserRepo;
import com.shoppingwebsite.database.api.Database.API.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("db/product")
public class ProductController {
    @Autowired
    ProductRepo productRepo;
    @Autowired
    PortalUserRepo portalUserRepo;
    @PostMapping("/add-product")
    public Product addProduct(@RequestBody ProductReqBody product){
        Product p = new Product();
        p.setId(UUID.randomUUID());
        p.setProductName(product.getProductName());
        p.setProductType(product.getProductType());
        p.setRating(0);
        p.setQuantity(product.getQuantity());
        p.setPrice(product.getPrice());
        PortalUser seller = portalUserRepo.findById(product.getSellerId()).orElse(null);
        p.setSeller(seller);
        productRepo.save(p);
        return p;
    }
}
