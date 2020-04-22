package com.sunday.blog.sundayblog.service;

import com.sunday.blog.sundayblog.dto.ArticleResultDto;
import com.sunday.blog.sundayblog.pojo.ArticleTypePojo;

import java.util.List;

/**
 * @ClassName IndexService
 * @Description TODO
 * @Author Sunday
 * @Date 2020/4/22 12:37
 * @Version 1.0
 */
public interface IndexService {
    List<ArticleTypePojo> getArticleTypeList();
}
