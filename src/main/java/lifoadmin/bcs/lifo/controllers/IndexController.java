package lifoadmin.bcs.lifo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String getPage(){
        return "index";

    }
}
