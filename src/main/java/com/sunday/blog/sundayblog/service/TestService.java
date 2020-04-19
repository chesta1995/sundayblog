package com.sunday.blog.sundayblog.service;

import com.sunday.blog.sundayblog.mapper.TestMapper;
import com.sunday.blog.sundayblog.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public List<User> getUser() {
        return testMapper.getUser();
    }
}
