package pl.coderslab.model;

public class Worker {

    public int id;
    public String name;
    public String surname;
    public String address;
    public int phone;
    public String notes;
    public float hourCost;

    public Worker(int id, String name, String surname, String address, int phone, String notes, float hourCost) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.notes = notes;
        this.hourCost = hourCost;
    }

    public Worker() {

    }

    public int getId() {
        return id;
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
        return "Worker {" +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", surname= '" + surname + '\'' +
                ", address= '" + address + '\'' +
                ", phone= " + phone +
                ", notes= '" + notes + '\'' +
                ", hourCost= " + hourCost +
                '}';
    }
}
