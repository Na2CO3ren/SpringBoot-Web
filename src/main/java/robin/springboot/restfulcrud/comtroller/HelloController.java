package robin.springboot.restfulcrud.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.Oneway;
import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/testConnection")
    public String testConnection(Map<String, Object> map) {
        map.put("hello","你好");
        map.put("persons", Arrays.asList("robin","jinglan","yiyi"));
        return "success";
    }
}
