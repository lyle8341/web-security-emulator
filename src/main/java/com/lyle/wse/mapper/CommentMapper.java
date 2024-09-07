package com.lyle.wse.mapper;

import com.lyle.wse.model.Comment;
import com.lyle.wse.model.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lyle 2024-09-04 21:07
 */
@Mapper
public interface CommentMapper {

    @Insert("INSERT INTO comment (postId, comment, name, email, website) VALUES (#{postId}, #{comment}, #{name}, #{email}, #{website})")
    void insert(Comment comment);

    @Select("select * from comment")
    List<Comment> selectAll();

}