package lifoadmin.bcs.lifo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static lifoadmin.bcs.lifo.constants.Constants.ADMIN;


@Controller
public class UntilitiesAnimationController {

    @RequestMapping("/utilities-animation")
    public String getPage(){
        return  "utilities-animation";

    }
}
