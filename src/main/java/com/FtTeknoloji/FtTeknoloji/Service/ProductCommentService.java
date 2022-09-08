package com.FtTeknoloji.FtTeknoloji.Service;

import com.FtTeknoloji.FtTeknoloji.entity.Customer;
import com.FtTeknoloji.FtTeknoloji.entity.Product;
import com.FtTeknoloji.FtTeknoloji.entity.ProductComment;
import com.FtTeknoloji.FtTeknoloji.repository.CustomerRepository;
import com.FtTeknoloji.FtTeknoloji.repository.ProductCommentRepository;
import com.FtTeknoloji.FtTeknoloji.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.sql.Date;
import java.util.List;

@Service

public class ProductCommentService {
    @Autowired
    private ProductCommentRepository productCommentRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    public ProductComment addProductComment(ProductComment productComment) {
        return productCommentRepository.save(productComment);
    }

    public List<ProductComment> getProductComment(Long id) {
        return productCommentRepository.findAllByProductId_Id(id);
    }

    public List<ProductComment> getCustomerComment(Long id) {
        return productCommentRepository.findAllByCustomerId_Id(id);
    }

    public List<ProductComment> getProductCommentBetweenDateAndProductId(Date date, Date date2, Long id) {
        return productCommentRepository.findProductCommentsByCommentDateBetweenAndProductId_Id(date, date2, id);
    }

    public List<ProductComment> getProductCommentBetweenDateAndCustomerId(Date date, Date date2, Long id) {
        return productCommentRepository.findProductCommentsByCommentDateBetweenAndCustomerId_Id(date, date2, id);
    }



    @PostConstruct
    public void loadData(){
       loadProductComment();
    }

    public void loadProductComment(){
        ProductComment a =new ProductComment();
        ProductComment b =new ProductComment();
        ProductComment c =new ProductComment();
        ProductComment d =new ProductComment();

        Customer x = new Customer();
        Customer y = new Customer();

        Product e = new Product();
        Product r = new Product();
        Product t = new Product();


        e.setId(3);
        e.setName("laptop");
        e.setPrice(Long.valueOf(1500));
        e.setExpredationDate(Date.valueOf("2022-09-08"));

        r.setId(4);
        r.setName("modem");
        r.setPrice(Long.valueOf(1500));
        r.setExpredationDate(null);

        t.setId(5);
        t.setName("telefon");
        t.setPrice(Long.valueOf(1500));
        t.setExpredationDate(Date.valueOf("2022-09-10"));





        x.setId(1);
        x.setName("musa");
        x.setSurname("yildirim");
        x.setEmail("deneme@gmail.com");
        x.setPhonenumber("05426616404");

        y.setId(2);
        y.setName("faruk");
        y.setSurname("yapar");
        y.setEmail("deneme2@gmail.com");
        y.setPhonenumber("05426616405");


        a.setId(1);
        a.setProductId(e);
        a.setComment("dshhftbasdfasd");
        a.setCommentDate(Date.valueOf("2022-09-07"));
        a.setCustomerId(x);


        b.setId(2);
        b.setProductId(r);
        b.setComment("dshhftbasdfasd");
        b.setCommentDate(Date.valueOf("2022-09-10"));
        b.setCustomerId(x);


        c.setId(3);
        c.setProductId(t);
        c.setComment("dshhftbasdfasd");
        c.setCommentDate(Date.valueOf("2022-09-11"));
        c.setCustomerId(y);


        d.setId(4);
        d.setProductId(e);
        d.setComment("dshhftbasdfasd");
        d.setCommentDate(Date.valueOf("2022-09-13"));
        d.setCustomerId(y);





        customerRepository.save(x);
        customerRepository.save(y);

        productRepository.save(e);
        productRepository.save(r);
        productRepository.save(t);

        productCommentRepository.save(a);
        productCommentRepository.save(b);
        productCommentRepository.save(c);
        productCommentRepository.save(d);
    }

}

