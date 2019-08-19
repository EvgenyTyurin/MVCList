package evgenyt.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String getHome(ModelMap model) {
        Map<Integer, String> testMap = new HashMap<>();
        testMap.put(1, "A");
        testMap.put(2, "B");
        testMap.put(3, "C");
        model.addAttribute("mapABC", testMap);
        return "/";
    }
}
