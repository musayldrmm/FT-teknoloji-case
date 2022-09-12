package com.FtTeknoloji.FtTeknoloji.Controller;

import com.FtTeknoloji.FtTeknoloji.Service.ProductCommentService;
import com.FtTeknoloji.FtTeknoloji.entity.ProductComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/product-comment")
public class ProductCommentController {
    @Autowired
    private ProductCommentService productCommentService;

    @PostMapping("/save")
    public ResponseEntity addProductComment(@RequestBody ProductComment productComment) {
        long millis = System.currentTimeMillis();
        java.sql.Date sqlDate = new java.sql.Date(millis);
        productComment.setCommentDate(sqlDate);
        productCommentService.addProductComment(productComment);
        return ResponseEntity.ok(productComment);
    }

    @GetMapping("/one-product-comment/{id}")
    public List<ProductComment> getProductComment(@PathVariable Long id) {
        return productCommentService.getProductComment(id);
    }

    @GetMapping("/one-customer-comment/{id}")
    public List<ProductComment> getCustomerComment(@PathVariable Long id) {
        return productCommentService.getCustomerComment(id);
    }

    @PostMapping("/one-product-date-between")
    public List<ProductComment> getProductCommentBetweenDateAndProductId(@RequestParam("firstDate")Date firstdate,
                                                                         @RequestParam("secondDate")Date seconddate,
                                                                         @RequestParam("ID") long id) {
        return productCommentService.getProductCommentBetweenDateAndProductId(firstdate, seconddate, id);
    }

    @PostMapping("/one-customer-date-between")
    public List<ProductComment> getProductCommentBetweenDateAndCustomerId(@RequestParam("firstDate")Date firstdate,
                                                                          @RequestParam("secondDate")Date seconddate,
                                                                          @RequestParam("ID") long id) {
        return productCommentService.getProductCommentBetweenDateAndCustomerId(firstdate, seconddate, id);
    }
}
