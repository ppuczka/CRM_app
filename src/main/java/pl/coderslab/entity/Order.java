package pl.coderslab.entity;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Table(name = "orders")
public  class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //date time now 
    private Date acceptanceDate;
    private Date startDate;
    private String problemDescription;
    private String repairDescription;
    private String status;
    private float repairCost;
    private float partsCost;
    private float payableHour;
    private int hours;
    private int vehicleId;
    private int workerId;

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAcceptanceDate() {
        return acceptanceDate;
    }

    public void setAcceptanceDate(Date acceptanceDate) {
        this.acceptanceDate = acceptanceDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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
        return "Order{" +
                "id=" + id +
                ", acceptanceDate=" + acceptanceDate +
                ", startDate=" + startDate +
                ", problemDescription='" + problemDescription + '\'' +
                ", repairDescription='" + repairDescription + '\'' +
                ", status='" + status + '\'' +
                ", repairCost=" + repairCost +
                ", partsCost=" + partsCost +
                ", payableHour=" + payableHour +
                ", hours=" + hours +
                ", vehicleId=" + vehicleId +
                ", workerId=" + workerId +
                '}';
    }
}

