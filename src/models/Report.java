package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Report {
    private String id, generated_date;
    private Connection con = connection.getConnection();

    public Report(String id, String generated_date) {
        this.id = id;
        this.generated_date = generated_date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGenerated_date() {
        return generated_date;
    }

    public void setGenerated_date(String generated_date) {
        this.generated_date = generated_date;
    }

//    public static ArrayList<Report> getAll() throws SQLException {
//        Connection con = connection.getConnection();
//        ArrayList<Report> allRec = new ArrayList<>();
//        String query = "SELECT * FROM shops";
//        PreparedStatement selectq = con.prepareStatement(query);
//        ResultSet result = selectq.executeQuery();
//        while (result.next()){
//            int id = result.getInt("id");
//            String name = result.getString("name");
//            String contact = result.getString("contact");
//            String address = result.getString("address");
//            int type = result.getInt("type");
//            allRec.add(new Report(id,type,name,contact,address));
//        }
//        con.close();
//        return allRec;
//    }
//
//    public void update() throws SQLException {
//        String upQuery = "UPDATE shops SET name=?,contact=?,address=?,type=? WHERE id=?";
//        PreparedStatement upq = con.prepareStatement(upQuery);
//        upq.setInt(5,this.id);
//        upq.setString(1,this.name);
//        upq.setString(2,this.getContact());
//        upq.setString(3,this.getAddress());
//        upq.setInt(4,this.getType());
//        upq.execute();
//        con.close();
//    }
//
//    public static String getShopName(int id) throws SQLException {
//        Connection con = connection.getConnection();
//        String quey = "SELECT name FROM shops WHERE id = ? LIMIT 1";
//        PreparedStatement selectq = con.prepareStatement(quey);
//        selectq.setInt(1,id);
//        ResultSet resultSet = selectq.executeQuery();
//        String name = resultSet.getString("name");
//        con.close();
//        return name;
//    }
//
//    public static int getShopId(String name) throws SQLException {
//        Connection con = connection.getConnection();
//        String query = "SELECT id FROM shops WHERE name=?";
//        PreparedStatement selectq = con.prepareStatement(query);
//        selectq.setString(1,name);
//        ResultSet resultSet = selectq.executeQuery();
//        int id = resultSet.getInt("id");
//        con.close();
//        return id;
//    }
}