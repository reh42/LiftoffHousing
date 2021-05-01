package org.launchcode.liftoff_housing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("form")
public class HousingCommunities {

    //@autowired and repositories go here

    //first string:
    @GetMapping("form")
    public String editForm() {
        return "form";
    }
}
