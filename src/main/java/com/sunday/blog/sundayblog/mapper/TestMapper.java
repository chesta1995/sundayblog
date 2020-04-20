package com.sunday.blog.sundayblog.mapper;

import com.sunday.blog.sundayblog.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {
    List<User> getUser();
}
