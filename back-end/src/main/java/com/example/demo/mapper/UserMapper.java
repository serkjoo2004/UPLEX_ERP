package com.example.demo.mapper;

import java.util.List;

import com.example.demo.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface UserMapper {
    List<UserVO> userList();
    UserVO fetchUserByID(int id);
    void updateUser(UserVO user);
    void insertUser(UserVO user);
    void deleteUser(int id);
}