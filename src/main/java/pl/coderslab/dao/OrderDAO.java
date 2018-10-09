package pl.coderslab.dao;

import pl.coderslab.model.Order;
import pl.coderslab.utils.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderDAO {

    public void updateOrder(Order order) throws SQLException;

    public void delOrder(Order order) throws SQLException;

    public static ArrayList<Order> loadAllorders() throws SQLException {

            ArrayList<Order> orders = new ArrayList<>();
            String sql = "SELECT * FROM Orders";
            Connection conn = DbUtil.getConn();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Order order = new Order();
                order.id = rs.getInt(1);
                order.acceptanceDate = rs.getDate(2);
                order.startDate = rs.getDate(3);
                order.workerId = rs.getInt(4);
                order.problemDescription = rs.getString(5);
                order.repairDescription = rs.getString(6);
                order.status = rs.getString(7);
                order.vehicleId = rs.getInt(8);
                order.repairCost = rs.getFloat(9);
                order.partsCost = rs.getFloat(10);
                order.payableHour = rs.getInt(11);
                order.hours = rs.getInt(12);
                orders.add(order);

            }
            return orders;
        }

    public Order loadOrder(int id) throws SQLException;


}
