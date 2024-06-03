package org.example.dkkhoahoc2.Services;

import org.example.dkkhoahoc2.Models.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService
{
    private List<Course> listcourse = new ArrayList<>();
    public void Add(Course NewCourse)
    {
        listcourse.add(NewCourse);
    }
    public List<Course> GetAll()
    {
        return listcourse;
    }
}

