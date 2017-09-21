package zovlzhongguanhua.demo.springmvc;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/get")
public class GetController {

    @GetMapping("/string")
    public String string() {
        return Utils.newString("string", null);
    }

    @RequestMapping(value = "/string_sec", method = RequestMethod.GET)
    public String string_sec() {
        return Utils.newString("string_sec", null);
    }

    @GetMapping("/map")
    public Map<Object, Object> map() {
        Map<Object, Object> map = new HashMap<>();
        map.put("code", "200");
        map.put("msg", "success");
        return Utils.newObject("map", map);
    }

    @GetMapping("/list")
    public List<Object> list() {
        List<Object> list = new ArrayList<>();
        list.add("200");
        list.add("success");
        return Utils.newObject("list", list);
    }

    @GetMapping("/object")
    public Object object() {
        Object object = new Object();
        return Utils.newObject("object", object);
    }

    @GetMapping("/set")
    public Set<Object> set() {
        Set<Object> set = new HashSet<>();
        set.add("200");
        set.add("success");
        return Utils.newObject("set", set);
    }

    // -----------------------------------------------------------------------------------------------------------------

    @GetMapping("/path/{p}")
    public String path(@PathVariable("p") String p) {
        return Utils.newString("path", p);
    }

    @GetMapping("/params")
    public String params(@RequestParam("p") String p) {
        return Utils.newString("params", p);
    }

    // -----------------------------------------------------------------------------------------------------------------

    @GetMapping("/headers")
    public String headers(@RequestHeader("h") String h) {
        return Utils.newString("params", h);
    }
}
