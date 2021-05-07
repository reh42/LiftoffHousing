package org.launchcode.liftoff_housing.controllers;

import org.launchcode.liftoff_housing.models.HousingCommunity;
import org.launchcode.liftoff_housing.models.data.HousingCommunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;


@Controller
//@RequestMapping("form")
public class HousingCommunities {

    //@autowired and repositories go here
    @Autowired
    private HousingCommunityRepository housingCommunityRepository;

    //display the form: static view
//    @GetMapping("form")
//    public String displayForm() {
//        return "form";

    //first string:
    @GetMapping("form")
    public String displayForm(Model model) {
        model.addAttribute(new HousingCommunity());
        return "form";
    }

    @PostMapping
    public String processForm(@ModelAttribute HousingCommunity newHousingCommunity, Model model ){
        housingCommunityRepository.save(newHousingCommunity);
        return "redirect:";
    }
}
