package com.zss.scc.dao.mapper;

import com.zss.scc.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    
    User getUserById(int id);
    
    List<User> getUserList();
    
    int insertUser(User user);
    
    int updateUser(User user);
    
    int deleteUser(int id);
}
