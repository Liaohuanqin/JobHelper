package com.mapper;

import com.entity.Admin;

import java.util.List;

public interface AdminMapper {
    /*delete admin by id*/
    int deleteByPrimaryKey(Integer adminId);

    /*insert into admin*/
    int insert(Admin record);

    /*get one admin by id*/
    Admin selectByPrimaryKey(Integer adminId);

    /*get all admins*/
    List<Admin> selectAll();

    /*update one admin*/
    int updateByPrimaryKey(Admin record);
}