package org.example.dkkhoahoc2.Controllers;

import org.example.dkkhoahoc2.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/home")
public class HomeController
{
    @Autowired
    private CourseService courseService;
    @GetMapping("/test")
    public String Index()
    {
        return "home";
    }
    @GetMapping("")
    public String Index(Model model)
    {
        model.addAttribute("listcourse", courseService.GetAll());
        return "home";
    }
}