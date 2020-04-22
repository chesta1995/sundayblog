package com.sunday.blog.sundayblog.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName ArticleResultDto
 * @Description TODO
 * @Author Sunday
 * @Date 2020/4/22 12:50
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("文章查询结果网络传输实体类型")
public class ArticleResultDto {
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
     * 文章作者
     */
    @ApiModelProperty("文章作者")
    private String author;
    /**
     * HTML内容
     */
    @ApiModelProperty("HTML内容")
    private String contentHtml;
    /**
     * 类型名称
     */
    @ApiModelProperty("文章类型名称")
    private String typeName;
}
