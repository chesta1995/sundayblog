package com.sunday.blog.sundayblog.service.impl;

import com.sunday.blog.sundayblog.dto.ArticleResultDto;
import com.sunday.blog.sundayblog.mapper.IndexMapper;
import com.sunday.blog.sundayblog.pojo.ArticleTypePojo;
import com.sunday.blog.sundayblog.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName IndexServiceImpl
 * @Description TODO
 * @Author Sunday
 * @Date 2020/4/22 12:44
 * @Version 1.0
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private IndexMapper indexMapper;

    @Override
    public List<ArticleTypePojo> getArticleTypeList() {
        return indexMapper.getArticleTypeList();
    }
}
