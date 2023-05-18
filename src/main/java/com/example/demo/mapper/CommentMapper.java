package com.example.demo.mapper;

import com.example.demo.entity.Comment;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CommentMapper {
    @Select("select * from t_comment where id = #{id}")
    public Comment getById(Integer id) ;

    @Insert("INSERT INTO t_comment(content,author,a_id) VALUES(#{content},#{author},#{a_id})")
    void insertComment(Comment Comment);
    @Insert("INSERT INTO t_comment(content, create_time, update_time) VALUES(#{content}, #{createTime}, #{updateTime})")
    void save(Comment Comment);
    @Update("update t_comment set content=#{content} where id =#{id}")
    public int update(Comment Comment);
    @Delete("delete from t_comment where id=#{id}")
    public int delete(Integer id);
}
