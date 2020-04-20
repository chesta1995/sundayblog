package com.sunday.blog.sundayblog.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    /**
    * @Description //TODO
    * @Date 14:29 2020/4/20
     * @param 
    * @return java.lang.String
    **/
    @RequestMapping("index")
    public String index() {
        return "index";
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
