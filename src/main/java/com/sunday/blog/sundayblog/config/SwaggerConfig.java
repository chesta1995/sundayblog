package com.sunday.blog.sundayblog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @ClassName SwaggerConfig
 * @Description Swagger插件配置类
 * @Author Sunday
 * @Date 2020/4/20 13:19
 * @Version 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    /**
     * @return springfox.documentation.service.ApiInfo
     * @Description //TODO
     * @Date 13:39 2020/4/20
     * @Param []
     **/
    private ApiInfo apiInfo() {
        Contact contact = new Contact("Sunday", "", "ch_esta@163.com");
        ApiInfo apiInfo = new ApiInfo("Api Documentation", "Api Documentation", "1.0", "urn:tos",
                contact, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>());
        return apiInfo;
    }
}
