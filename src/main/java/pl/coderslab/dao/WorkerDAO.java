package pl.coderslab.dao;

import pl.coderslab.model.Worker;

import java.util.ArrayList;

public interface WorkerDAO {

    public void updateWorker();

    public void delWorker();

    public ArrayList<Worker> loadAllworkers();

    public Worker loadWorker(int id);


}