package lifoadmin.bcs.lifo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static lifoadmin.bcs.lifo.constants.Constants.ADMIN;


@Controller
public class AdminLoginController {

    @RequestMapping( "/"  + ADMIN + "/login") // can't map to same login
    public String getPage(){
        return "login";

    }
}
