package pl.coderslab.impl.dao;

import pl.coderslab.dao.OrderDAO;
import pl.coderslab.model.Order;
import pl.coderslab.utils.DbUtil;

import java.sql.*;

public class OrderImplDao implements OrderDAO {

    @Override
    public void updateOrder(Order order) throws SQLException {
        if (order.id == 0) {
            String sql = "INSERT INTO ORDERS(AcceptanceDate, StartDate, Worker_id, ProblemDesc, RepairDesc, RepairStatus, " +
                    "Vehicle_id, RepairCost, PartsCost, PayableHour, hours) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            Connection conn = DbUtil.getConn();
            String generatedColumns[] = {"Order_id"};
            PreparedStatement ps = conn.prepareStatement(sql, generatedColumns);
            ps.setDate(1, order.acceptanceDate);
            ps.setDate(2, order.startDate);
            ps.setInt(3, order.workerId);
            ps.setString(4, order.problemDescription);
            ps.setString(5, order.repairDescription);
            ps.setString(6, order.status);
            ps.setFloat(7, order.repairCost);
            ps.setFloat(8, order.partsCost);
            ps.setFloat(9, order.payableHour);
            ps.setInt(10, order.hours);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                order.id = rs.getInt(1);
            }
        } else {
            String sql = "UPDATE ORDERS SET AcceptanceDate =?, StartDate =?, Worker_id =?, ProblemDesc =?, RepairDesc =?, RepairStatus =?, " +
                    "Vehicle_id =?, RepairCost =?, PartsCost =?, PayableHour =?, hours =? WHERE order_id = ?";
            Connection conn = DbUtil.getConn();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, order.acceptanceDate);
            ps.setDate(2, order.startDate);
            ps.setInt(3, order.workerId);
            ps.setString(4, order.problemDescription);
            ps.setString(5, order.repairDescription);
            ps.setString(6, order.status);
            ps.setFloat(7, order.repairCost);
            ps.setFloat(8, order.partsCost);
            ps.setFloat(9, order.payableHour);
            ps.setInt(10, order.hours);
            ps.executeUpdate();
        }

    }

    @Override
    public void delOrder(Order order) throws SQLException {
        if (order.id != 0) {
            Connection conn = DbUtil.getConn();
            String sql = "DELETE FROM Orders WHERE Order_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, order.id);
            ps.executeUpdate();
            order.id = 0;
        }

    }

    @Override
    public Order loadOrder(int id) throws SQLException {
        String sql = "SELECT * FORM Orders WHERE Order_id = ?";
        Connection conn = DbUtil.getConn();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
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
            return order;
        }

        return null;
    }


}



