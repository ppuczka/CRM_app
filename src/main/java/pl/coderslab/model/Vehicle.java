package pl.coderslab.model;

import java.sql.Date;

public class Vehicle {

    public int id;
    public String model;
    public String mark;
    public int year;
    public String registrationNum;
    public Date nextReview;

    public Vehicle() {
    }

    public Vehicle(int id, String model, String mark, int year, String registrationNum, Date nextReview) {
        this.id = id;
        this.model = model;
        this.mark = mark;
        this.year = year;
        this.registrationNum = registrationNum;
        this.nextReview = nextReview;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(String registrationNum) {
        this.registrationNum = registrationNum;
    }

    public Date getNextReview() {
        return nextReview;
    }

    public void setNextReview(Date nextReview) {
        this.nextReview = nextReview;
    }

    @Override
    public String toString() {
        return "Vehicle {" +
                "id =" + id +
                ", model ='" + model + '\'' +
                ", mark ='" + mark + '\'' +
                ", year =" + year +
                ", registrationNum ='" + registrationNum + '\'' +
                ", nextReview =" + nextReview +
                '}';
    }
}

