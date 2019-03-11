package lifoadmin.bcs.lifo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class UtilitiesBorderController {

    @RequestMapping("/utilities-border")
    public String getPage(){
        return "utilities-boarder";

    }
}
