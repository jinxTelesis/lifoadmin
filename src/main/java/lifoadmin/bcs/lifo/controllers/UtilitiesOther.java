package lifoadmin.bcs.lifo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class UtilitiesOther {

    @RequestMapping("/utilities-other")
    public String getPage(){
        return "utilities-other";

    }
}
