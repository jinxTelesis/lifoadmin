package lifoadmin.bcs.lifo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static lifoadmin.bcs.lifo.constants.Constants.ADMIN;


@Controller
public class ChartsController {

    @RequestMapping("/charts")
    public String getPage(){
        return "charts";

    }
}
