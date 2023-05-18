package com.example.demo;
import com.example.demo.mapper.ArticleMapper;
import com.example.demo.mapper.CommentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootTest
public class Demo1ApplicationTests {
    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private ArticleMapper articleMapper;
    @Test
    public void test() {
        Article article = articleMapper.selectArticle(1);
        System.out.printf(String.valueOf(article));
    }
    @Test
    public void updateArticle() {
        Article newArticle = new Article();
        newArticle.setContent("update");
        newArticle.setId(1);
        newArticle.setTitle("update");
        articleMapper.updateArticle(newArticle);
        System.out.println(newArticle);

    }
}
