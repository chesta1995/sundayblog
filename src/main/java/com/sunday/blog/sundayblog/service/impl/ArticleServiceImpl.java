package com.sunday.blog.sundayblog.service.impl;

import com.sunday.blog.sundayblog.dto.ArticleResultDto;
import com.sunday.blog.sundayblog.mapper.ArticleMapper;
import com.sunday.blog.sundayblog.pojo.ArticlePojo;
import com.sunday.blog.sundayblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * @param article
     * @return void
     * @Description 插入文章
     * @Date 12:13 2020/4/22
     **/
    @Override
    public void articleInsert(ArticlePojo article) {
        articleMapper.articleInsert(article);
    }

    /**
     * @param
     * @return java.util.List<com.sunday.blog.sundayblog.pojo.ArticlePojo>
     * @Description 获取文章
     * @Date 12:13 2020/4/22
     **/
    @Override
    public List<ArticleResultDto> getArticleList(@Nullable Integer id) {
        List<ArticleResultDto> articleList = articleMapper.getArticleList(id);
        return articleList;
    }
}
