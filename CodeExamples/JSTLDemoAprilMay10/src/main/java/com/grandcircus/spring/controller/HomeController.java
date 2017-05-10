package com.grandcircus.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

/**
 * Created by Antonella on 5/10/17.
 */


@Controller
public class HomeController {

    @RequestMapping("/")
    public String testTags(Model model) {
        ArrayList<Employee> empList = new ArrayList<Employee>();

        Employee emp1 = new Employee();
        emp1.setId(1);
        emp1.setName("Antonella");
        emp1.setRole("Instructor");

        Employee emp2 = new Employee();
        emp2.setId(2);
        emp2.setName("Maurice");
        emp2.setRole("Space Mercenary");

        empList.add(emp1);
        empList.add(emp2);

        model.addAttribute("empList", empList);
        model.addAttribute("htmlTagData", "<br/> creates a new line.");
        model.addAttribute("url", "http://www.grandcircus.co");

        return "welcome";
    }

    @RequestMapping("/htmlform")
    public String displayForm() {
        return "htmlform";
    }


    @RequestMapping("/success")
    public ModelAndView userInfo(@RequestParam("c_name") String name,
                                 @RequestParam("c_type") String type,
                                 @RequestParam("options") String option,
                                 @RequestParam("gender") String gender) {

        String info = name + " " + type + " " + option + " " + gender;
        return new ModelAndView("success", "addStuff", info);
    }

}
