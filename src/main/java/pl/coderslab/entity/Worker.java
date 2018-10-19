package pl.coderslab.entity;


import javax.persistence.*;

@Entity
@Table(name = "vehicles")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String address;
    private int phone;
    private String notes;
    private float hourCost;

    public Worker() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public float getHourCost() {
        return hourCost;
    }

    public void setHourCost(float hourCost) {
        this.hourCost = hourCost;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", notes='" + notes + '\'' +
                ", hourCost=" + hourCost +
                '}';
    }
}
   