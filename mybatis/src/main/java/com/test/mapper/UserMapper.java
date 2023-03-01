package com.test.mapper;

import com.test.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.*;

public interface UserMapper {
   List<User> selectALL();
   @Select("select * from tb_user where id=#{id}")
   User selectById(int id);
}
