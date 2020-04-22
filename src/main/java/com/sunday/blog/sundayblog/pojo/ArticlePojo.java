package com.sunday.blog.sundayblog.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName Blog
 * @Description 博客文章实体类
 * @Author Sunday
 * @Date 2020/4/20 14:30
 * @Version 1.0
 */
@ApiModel("文章实体类")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticlePojo {
    /**
     * 文章id
     */
    @ApiModelProperty("文章id")
    private Integer id;
    /**
     * 文章标题
     */
    @ApiModelProperty("文章标题")
    private String title;
    /**
     * 文章类型
     */
    @ApiModelProperty("文章类型")
    private Integer type;
    /**
     * markdown文章内容
     */
    @ApiModelProperty("MarkDown文章内容")
    private String contentMarkdown;
    /**
     * 文章图片
     */
    @ApiModelProperty("文章图片")
    private String picture;
    /**
     * 文章作者
     */
    @ApiModelProperty("文章作者")
    private String author;
    /**
     * 文章提交时间
     */
    @ApiModelProperty("文章提交时间")
    private Date insertTime;
    /**
     * 文章更新时间
     */
    @ApiModelProperty("文章更新时间")
    private Date modifyTime;
    /**
     * HTML内容
     */
    @ApiModelProperty("HTML内容")
    private String contentHtml;
}
