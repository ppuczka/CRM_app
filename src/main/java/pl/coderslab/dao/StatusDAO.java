package pl.coderslab.dao;

import pl.coderslab.model.Status;

import java.util.ArrayList;

public interface StatusDAO {
    
    public void updateStatus();

    public void delStatus();

    public ArrayList<Status> loadAllstatus();

    public Status loadStatus(int id);


}