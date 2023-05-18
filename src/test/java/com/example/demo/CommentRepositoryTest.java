package com.example.demo;
import com.example.demo.entity.Comment;
import com.example.demo.entity.Discuss;
import com.example.demo.mapper.CommentMapper;
import com.example.demo.repository.DiscussRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class CommentRepositoryTest {

    @Autowired
    private DiscussRepository discussRepository;

    @Test
    public void testFinAll() {
        List<Discuss> comments = discussRepository.findByAuthorNotNull();
        System.out.printf(comments.toString());
    }
    @Test
    public void testSaveComment() {
        Discuss discuss = new Discuss();
        discuss.setaId(5);
        discuss.setContent("test content");
        discuss.setAuthor("jghjhkhkh");
    }

    @Test
    public void testUpdateComment() {
        discussRepository.updateContentAndAuthorById(1L,"lalala","TestUpdate");
    }

    @Test
    public void testDeleteComment() {
        discussRepository.deleteById(1L);
    }
}
