package com.sunday.blog.sundayblog.controller;

import com.sunday.blog.sundayblog.constant.Constant;
import com.sunday.blog.sundayblog.dto.MDResultDto;
import com.sunday.blog.sundayblog.pojo.ArticlePojo;
import com.sunday.blog.sundayblog.service.ArticleService;
import com.sunday.blog.sundayblog.untils.DateUtils;
import com.sunday.blog.sundayblog.untils.FileUtils;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.Date;
import java.util.Enumeration;
import java.util.Map;

/**
 * @ClassName ArticleController
 * @Description 文章视图控制器
 * @Author Sunday
 * @Date 2020/4/20 15:42
 * @Version 1.0
 */
@Controller
@Api("文章视图控制器")
@RequestMapping("/article")
public class ArticleController {

    /**
     * article service
     */
    @Autowired
    private ArticleService articleService;

    /**
     * @param
     * @return java.lang.String
     * @Description 写博客页面跳转
     * @Date 17:37 2020/4/21
     **/
    @RequestMapping("/write")
    public String index() {
        return "writeArticle";
    }

    /**
     * @param file
     * @param request
     * @param response
     * @return com.sunday.blog.sundayblog.dto.MarkDownDto
     * @Description 文件上传处理
     * @Date 17:38 2020/4/21
     **/
    @PostMapping("/upload")
    @ResponseBody
    public MDResultDto imgUpload(@RequestParam(value = "editormd-image-file", required = true) MultipartFile file,
                                 HttpServletRequest request,
                                 HttpServletResponse response) {
        // 获取当前系统日期
        String url = DateUtils.getSysDate();
        // 创建存储文件夹
        File dir = new File(Constant.FILE_PATH);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        // 创建存储文件
        File realFile = new File(Constant.FILE_PATH + File.separator + file.getOriginalFilename());
        MDResultDto successResult = null;
        try {
            // 设置编码
            request.setCharacterEncoding("utf-8");
            response.setHeader("Content-Type", "text/html");
            // 将文件存储到本地
            FileUtils.copyInputStreamToFile(file.getInputStream(), realFile);
            successResult = new MDResultDto(1, "上传成功", Constant.BACK_SHOW + url + File.separator + file.getOriginalFilename());
        } catch (Exception e) {
            e.printStackTrace();
            return new MDResultDto(1, "", "");
        }
        return successResult;
    }

    /**
     * @param request
     * @param model
     * @return java.lang.String
     * @Description 保存文件数据库
     * @Date 12:03 2020/4/22
     **/
    @PostMapping(value = "/uploadFile")
    public String fileUpload(HttpServletRequest request, Model model) {
        // 获取页面数据
        String markdownDoc = request.getParameter("test-editormd-markdown-doc");
        String HTMLDoc = request.getParameter("test-editormd-html-code");
        String title = request.getParameter("title");
        ArticlePojo article = new ArticlePojo();
        // 设置article实体类
        article.setAuthor("sunday");
        article.setContentHtml(HTMLDoc);
        article.setContentMarkdown(markdownDoc);
        article.setTitle(title);
        article.setType(1);
        article.setInsertTime(new Date());
        article.setModifyTime(article.getInsertTime());
        // 插入数据
        articleService.articleInsert(article);
        model.addAttribute("article", article);
        return "writeArticle";
    }
}
