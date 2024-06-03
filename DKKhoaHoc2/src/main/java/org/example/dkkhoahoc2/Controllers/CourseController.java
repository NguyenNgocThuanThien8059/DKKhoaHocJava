package org.example.dkkhoahoc2.Controllers;

import org.springframework.ui.Model;
import org.example.dkkhoahoc2.Models.Course;
import org.example.dkkhoahoc2.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/course")
public class CourseController
{
    @Autowired
    private CourseService courseservice;
    @GetMapping("/create")
    public String Create(Model model)
    {
        model.addAttribute("course", new Course());
        return "create";
    }
    @PostMapping("/create")
    public String Create(Course NewCourse, Model model)
    {
        courseservice.Add(NewCourse);
        return "redirect:/home";
    }
}
