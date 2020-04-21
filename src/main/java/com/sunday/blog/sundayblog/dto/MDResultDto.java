package com.sunday.blog.sundayblog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName MarkDownDto
 * @Description TODO
 * @Author Sunday
 * @Date 2020/4/21 16:01
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MDResultDto {
    private Integer success;
    private String message;
    private String url;
}
