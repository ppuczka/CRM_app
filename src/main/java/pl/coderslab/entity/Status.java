package pl.coderslab.entity;

import javax.persistence.*;

@Entity
@Table(name = "status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public float repairAppCost;
    public int inRepair;
    public int ready;
    public int resigned;


    public Status() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getRepairAppCost() {
        return repairAppCost;
    }

    public void setRepairAppCost(float repairAppCost) {
        this.repairAppCost = repairAppCost;
    }

    public int getInRepair() {
        return inRepair;
    }

    public void setInRepair(int inRepair) {
        this.inRepair = inRepair;
    }

    public int getReady() {
        return ready;
    }

    public void setReady(int ready) {
        this.ready = ready;
    }

    public int getResigned() {
        return resigned;
    }

    public void setResigned(int resigned) {
        this.resigned = resigned;
    }

    @Override
    public String toString() {
        return "Status{" +
                "id=" + id +
                ", repairAppCost=" + repairAppCost +
                ", inRepair=" + inRepair +
                ", ready=" + ready +
                ", resigned=" + resigned +
                '}';
    }
}



