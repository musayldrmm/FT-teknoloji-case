package com.FtTeknoloji.FtTeknoloji.repository;

import com.FtTeknoloji.FtTeknoloji.entity.CheckExpredation;
import com.FtTeknoloji.FtTeknoloji.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByExpredationDateBeforeOrExpredationDateIsNull(Date date);

    List<Product> findAllByExpredationDateAfter(Date date);

}
