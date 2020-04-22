package com.sunday.blog.sundayblog.mapper;

import com.sunday.blog.sundayblog.dto.ArticleResultDto;
import com.sunday.blog.sundayblog.pojo.ArticleTypePojo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName IndexMapper
 * @Description TODO
 * @Author Sunday
 * @Date 2020/4/22 12:41
 * @Version 1.0
 */
@Repository
public interface IndexMapper {
    /**
     * 获取文章类型
     * @return
     */
    List<ArticleTypePojo> getArticleTypeList();
}
