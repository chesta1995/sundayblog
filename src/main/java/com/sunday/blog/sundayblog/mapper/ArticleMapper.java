package com.sunday.blog.sundayblog.mapper;

import com.sunday.blog.sundayblog.pojo.ArticlePojo;
import org.springframework.stereotype.Repository;

/**
 * @ClassName AticleMapper
 * @Description TODO
 * @Author Sunday
 * @Date 2020/4/21 21:51
 * @Version 1.0
 */
@Repository
public interface ArticleMapper {
    /**
     * 追加文章
     * @param articlePojo
     */
    void articleInsert(ArticlePojo articlePojo);
}
