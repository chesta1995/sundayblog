package com.sunday.blog.sundayblog;

import com.sunday.blog.sundayblog.untils.DateUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@SpringBootTest
class SundayblogApplicationTests {

    @Test
    void contextLoads(HttpServletRequest request) {
        String url = request.getServletContext().getRealPath("/");
        File file = new File(url, "test");
        file.mkdir();

    }

}
