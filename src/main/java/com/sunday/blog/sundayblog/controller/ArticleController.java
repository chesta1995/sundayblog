package com.sunday.blog.sundayblog.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName ArticleController
 * @Description 文章视图控制器
 * @Author Sunday
 * @Date 2020/4/20 15:42
 * @Version 1.0
 */
@Controller
@Api("文章视图控制器")
@RequestMapping("article")
public class ArticleController {

    @RequestMapping("write")
    public String index() {
        return "writeArticle";
    }
}
