package pl.coderslab.dao;

import pl.coderslab.model.Vehicle;

import java.util.ArrayList;

public interface VehicleDAO {

    public void updateVehicle();

    public void delVehicle();

    public ArrayList<Vehicle> loadAllvehicles();

    public Vehicle loadVehicle(int id);


}