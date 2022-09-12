package com.FtTeknoloji.FtTeknoloji.Service;

import com.FtTeknoloji.FtTeknoloji.entity.Product;
import com.FtTeknoloji.FtTeknoloji.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
    public List<Product> expredationBefore(Date date){
        return productRepository.findAllByExpredationDateBeforeOrExpredationDateIsNull(date);
    }
    public List<Product> expredationAfter(Date date){
        return productRepository.findAllByExpredationDateAfter(date);
    }

}
