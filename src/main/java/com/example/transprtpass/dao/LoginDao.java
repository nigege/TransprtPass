package com.example.transprtpass.dao;


import org.apache.ibatis.annotations.Mapper;

//dao这里定义的不是一个类，而是需要一个接口
@Mapper                              //为了声明是个dao
public interface LoginDao {
     void check (String name);        //接口的函数定义就不需要全局了，所以不要public
}
