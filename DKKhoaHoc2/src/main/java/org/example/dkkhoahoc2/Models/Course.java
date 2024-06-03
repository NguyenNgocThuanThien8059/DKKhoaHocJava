package org.example.dkkhoahoc2.Models;

import java.time.LocalDate;

public class Course
{
    private int ID;
    private String LectureName;
    private String Place;
    private LocalDate StartDate;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLectureName() {
        return LectureName;
    }

    public void setLectureName(String lectureName) {
        LectureName = lectureName;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

}