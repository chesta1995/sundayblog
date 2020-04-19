package com.sunday.blog.sundayblog.mapper;

import com.sunday.blog.sundayblog.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public interface TestMapper {
    List<User> getUser();
}
