package com.sunday.blog.sundayblog.service.impl;

import com.sunday.blog.sundayblog.mapper.ArticleMapper;
import com.sunday.blog.sundayblog.pojo.ArticlePojo;
import com.sunday.blog.sundayblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName ArticleService
 * @Description TODO
 * @Author Sunday
 * @Date 2020/4/21 21:55
 * @Version 1.0
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public void articleInsert(ArticlePojo article) {
        articleMapper.articleInsert(article);
    }
}
