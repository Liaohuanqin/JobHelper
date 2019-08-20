package com.service;

import com.entity.Blog;

import java.util.List;

public interface BlogService {
    /*delete one blog by id*/
    int deleteByPrimaryKey(Integer blogId);

    /*insert into blog*/
    int insert(Blog record);

    /*get one blog by id*/
    Blog selectByPrimaryKey(Integer blogId);

    /*get all blog*/
    List<Blog> selectAll();

    /*update one blog*/
    int updateByPrimaryKey(Blog record);
}