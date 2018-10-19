package pl.coderslab.entity;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name= "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String model;
    private String mark;
    private int year;
    private String registrationNum;
    private Date nextReview;


    public Vehicle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Vehicle{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", year=" + year +
                ", registrationNum='" + registrationNum + '\'' +
                ", nextReview=" + nextReview +
                '}';
    }
}

