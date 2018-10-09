package pl.coderslab.model;

public class Status {

    public int id;
    public float repairAppCost;
    public int inRepair;
    public int ready;
    public int resigned;

    public Status(int id, float repairAppCost, int inRepair, int ready, int resigned) {
        this.id = id;
        this.repairAppCost = repairAppCost;
        this.inRepair = inRepair;
        this.ready = ready;
        this.resigned = resigned;
    }

    public Status() {
    }

    public int getId() {
        return id;
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
        return "Status {" +
                "id= " + id +
                ", repairAppCost= " + repairAppCost +
                ", inRepair= " + inRepair +
                ", ready= " + ready +
                ", resigned= " + resigned +
                '}';
    }
}



