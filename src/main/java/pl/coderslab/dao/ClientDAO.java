package pl.coderslab.dao;

import pl.coderslab.model.Client;

import java.util.ArrayList;

public interface ClientDAO {

    public void updateClient();

    public void delClient();

    public ArrayList<Client> loadAllClients();

    public Client loadClient(int id);

}
