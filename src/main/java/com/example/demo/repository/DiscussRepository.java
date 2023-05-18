package com.example.demo.repository;

import com.example.demo.entity.Article;
import com.example.demo.entity.Comment;
import com.example.demo.entity.Discuss;
import jakarta.transaction.Transactional;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.util.List;


public interface DiscussRepository extends JpaRepository<Discuss,Integer> {


    @Override
    <S extends Discuss> S save(S entity);

    /*1.查询author非空的Discuss集合*/
    public List<Discuss> findByAuthorNotNull();
    /*2.保存*/


    // 根据id更新评论的内容和作者
    @Modifying
    @Transactional
    @Query("update t_comment set content = :content, author = :author where id = :id")
    int updateContentAndAuthorById(@Param("id") Long id, @Param("content") String content, @Param("author") String author);

    // 根据id删除评论
    @Modifying
    @Transactional
    @Query("delete from t_comment where id = :id")
    int deleteById(@Param("id") Long id);


}
