package zovlzhongguanhua.demo.springmvc;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/post")
public class PostController {

    @PostMapping("/string")
    public String string() {
        return Utils.newString("string", null);
    }

    @RequestMapping(value = "/string_sec", method = RequestMethod.POST)
    public String string_sec() {
        return Utils.newString("string_sec", null);
    }

    // -----------------------------------------------------------------------------------------------------------------

    @PostMapping("/form")
    public String form(String username, String password) {
        return Utils.newObject("form", username + "/" + password);
    }

    @PostMapping("/form_bean")
    public String form_bean(RequestBean bean) {
        return Utils.newString("form_bean", bean);
    }

    @PostMapping("/form_map")
    public String form_map(@RequestParam Map<Object, Object> map) {
        return Utils.newString("form_map", map);
    }

    // -----------------------------------------------------------------------------------------------------------------

    @PostMapping("/json")
    public String json(@RequestBody RequestBean json) {
        return Utils.newString("json", json);
    }

    // -----------------------------------------------------------------------------------------------------------------

    @PostMapping("/xml")
    public String xml(@RequestBody RequestBean xml) {
        return Utils.newString("xml", xml);
    }
}
