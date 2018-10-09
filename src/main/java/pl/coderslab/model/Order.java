package pl.coderslab.model;

import java.sql.Date;

public class Order {

    public int id;
    public Date acceptanceDate;
    public Date startDate;
    public String problemDescription;
    public String repairDescription;
    public String status;
    public float repairCost;
    public float partsCost;
    public float payableHour;
    public int hours;
    public int vehicleId;
    public int workerId;


    public Order() {
    }


    public Order(int id, Date acceptanceDate, Date startDate, String problemDescription, String repairDescription,
                 String status, float repairCost, float partsCost, float payableHour, int hours, int vehicleId,
                 int workerId) {
        this.id = id;
        acceptanceDate = acceptanceDate;
        startDate = startDate;
        this.problemDescription = problemDescription;
        this.repairDescription = repairDescription;
        this.status = status;
        this.repairCost = repairCost;
        this.partsCost = partsCost;
        this.payableHour = payableHour;
        this.hours = hours;
        this.vehicleId = vehicleId;
        this.workerId = workerId;

    }

    public int getId() {
        return id;
    }

    public Date getacceptanceDate() {
        return acceptanceDate;
    }

    public void setacceptanceDate(Date acceptanceDate) {
        acceptanceDate = acceptanceDate;
    }

    public Date getstartDate() {
        return startDate;
    }

    public void setstartDate(Date startDate) {
        startDate = startDate;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getRepairDescription() {
        return repairDescription;
    }

    public void setRepairDescription(String repairDescription) {
        this.repairDescription = repairDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(float repairCost) {
        this.repairCost = repairCost;
    }

    public float getPartsCost() {
        return partsCost;
    }

    public void setPartsCost(float partsCost) {
        this.partsCost = partsCost;
    }

    public float getPayableHour() {
        return payableHour;
    }

    public void setPayableHour(float payableHour) {
        this.payableHour = payableHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    @Override
    public String toString() {
        return "Order {" +
                "id= " + id +
                ", acceptanceDate= " + acceptanceDate +
                ", startDate= " + startDate +
                ", problemDescription= '" + problemDescription + '\'' +
                ", repairDescription= '" + repairDescription + '\'' +
                ", status= '" + status + '\'' +
                ", repairCost= " + repairCost +
                ", partsCost= " + partsCost +
                ", payableHour= " + payableHour +
                ", hours= " + hours +
                ", vehicleId= " + vehicleId +
                ", workerId= " + workerId +
                '}';
    }
}

