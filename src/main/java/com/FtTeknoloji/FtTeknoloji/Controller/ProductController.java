package com.FtTeknoloji.FtTeknoloji.Controller;

import com.FtTeknoloji.FtTeknoloji.Service.ProductService;
import com.FtTeknoloji.FtTeknoloji.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public ResponseEntity addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return ResponseEntity.ok(product);
    }
    @PostMapping("/list-before-date")
    public List<Product> expredationBefore(@RequestParam("Date")Date date){
        return productService.expredationBefore(date);
    }
    @PostMapping("/list-after-date")
    public List<Product> expredationAfter(@RequestParam("Date")Date date){
        return productService.expredationAfter(date);
    }
}
