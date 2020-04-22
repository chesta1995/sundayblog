package com.sunday.blog.sundayblog.controller;

import com.sunday.blog.sundayblog.dto.ArticleResultDto;
import com.sunday.blog.sundayblog.pojo.ArticlePojo;
import com.sunday.blog.sundayblog.pojo.ArticleTypePojo;
import com.sunday.blog.sundayblog.service.ArticleService;
import com.sunday.blog.sundayblog.service.IndexService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author Sunday
 * @Date 2020/4/20 14:28
 * @Version 1.0
 */
@Api("首页Controller")
@Controller
public class IndexController {

    @Autowired
    private ArticleService articleService;
    @Autowired
    private IndexService indexService;

    /**
     * @param model
     * @return java.lang.String
     * @Description 首页视图控制器
     * @Date 12:48 2020/4/22
     **/
    @RequestMapping(value = "/index")
    public String index(Model model, @PathVariable Integer id) {
        // 查询文章内容并传递到前端
        List<ArticleResultDto> articleList = articleService.getArticleList(id);
        model.addAttribute("articles", articleList);
        // 查询文章类型并传递到前端
        List<ArticleTypePojo> typeList = indexService.getArticleTypeList();
        model.addAttribute("types", typeList);
        return "/index";
    }

    @RequestMapping("album")
    public String album() {
        return "album";
    }

    @RequestMapping("about")
    public String about() {
        return "about";
    }

    @RequestMapping("details")
    public String details() {
        return "details";
    }

    @RequestMapping("leacots")
    public String leacots() {
        return "leacots";
    }

    @RequestMapping("whisper")
    public String whisper() {
        return "whisper";
    }
}
