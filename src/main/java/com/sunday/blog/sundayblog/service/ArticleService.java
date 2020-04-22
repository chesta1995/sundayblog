package com.sunday.blog.sundayblog.service;

import com.sunday.blog.sundayblog.dto.ArticleResultDto;
import com.sunday.blog.sundayblog.pojo.ArticlePojo;
import org.springframework.lang.Nullable;

import java.util.List;

/**
 * @ClassName ArticleService
 * @Description TODO
 * @Author Sunday
 * @Date 2020/4/21 21:54
 * @Version 1.0
 */
public interface ArticleService {
    /**
     * 发布文章
     * @param articlePojo
     */
    void articleInsert(ArticlePojo articlePojo);

    /**
     * 获取所有文章
     * @return
     */
    List<ArticleResultDto> getArticleList(@Nullable Integer id);
}
