package com.FtTeknoloji.FtTeknoloji.repository;

import com.FtTeknoloji.FtTeknoloji.entity.ProductComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface ProductCommentRepository extends JpaRepository<ProductComment, Long> {

    List<ProductComment> findAllByCustomerId_Id(Long id); //bir kullanıcının yorumları

    List<ProductComment> findAllByProductId_Id(Long id);  // bir ürüne ait yorumların tamamı

    List<ProductComment> findProductCommentsByCommentDateBetweenAndProductId_Id(Date date, Date secondDate, Long id);//verilen tarih arasında bir ürüne yapılan yorumlar

    List<ProductComment> findProductCommentsByCommentDateBetweenAndCustomerId_Id(Date date, Date secondDate, Long id);//verilen tarih arasında bir kullanıcının yaptığı yorumlar

}
