package zovlzhongguanhua.demo.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GreetingController {

    @RequestMapping("/")
    public String sayGreeting() {
        return "Greeting!";
    }
}
