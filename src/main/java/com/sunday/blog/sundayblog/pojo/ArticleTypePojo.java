package com.sunday.blog.sundayblog.pojo;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName ArticleTypePojo
 * @Description TODO
 * @Author Sunday
 * @Date 2020/4/22 12:38
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("文章类型实体")
public class ArticleTypePojo implements Serializable {
    private Integer id;
    private String typeName;
}
