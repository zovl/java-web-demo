package zovlzhongguanhua.demo.springmvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {

    @RequestMapping("/")
    public String a() {
        return "java-web-library-springmvc";
    }
}
