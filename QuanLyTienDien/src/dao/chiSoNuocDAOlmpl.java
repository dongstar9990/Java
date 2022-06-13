/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Project URI:        https://github.com/zadajtjeu/QuanLyTienDien
 * Description:       Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Version:           1.0
 * Author:            Nhom 18: Nam, Hao, Trung
 * Author URI:        https://nam.name.vn
 * 
 * Copyright (C) 2021-2022 Pham Thanh Nam - HAUI.
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.ChiSoNuoc;
import models.Thang;

/**
 *
 * @author dell
 */
public class chiSoNuocDAOlmpl implements chiSoNuocDAO{
    @Override
    public List<ChiSoNuoc> getList() {
        Connection cons = MySQLConnect.getConnection();
        String sql = "SELECT * FROM `ChiSoDien`";
        List<ChiSoNuoc> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                long id = rs.getLong("ID");
                int maKH = rs.getInt("MaKH");
                int thangID = rs.getInt("ThangID");
                int chiSoCu = rs.getInt("ChiSoCu");
                int chiSoMoi = rs.getInt("ChiSoMoi");
                Date ngayGhi = new Date(rs.getDate("NgayGhi").getTime());

                ChiSoNuoc chiSoDien = new ChiSoNuoc(id, maKH, thangID, chiSoCu, chiSoMoi, ngayGhi);
                list.add(chiSoDien);
            }
            ps.close();
            MySQLConnect.disconnect();
        } catch (SQLException e) {
            MySQLConnect.disconnect();
        }
        return list;
    }

    // Lấy danh sách chỉ số điện chưa lập hoá đơn
    @Override
    public List<ChiSoNuoc> getListExcludedInHoaDon() {
        Connection cons = MySQLConnect.getConnection();
        String sql = "SELECT * FROM `ChiSoDien` WHERE "
                + "`ThangID` NOT IN (SELECT DISTINCT `ThangID` FROM `HoaDon` WHERE `MaKH` = `ChiSoDien`.`MaKH`) "
                + "AND `MaKH` NOT IN (SELECT DISTINCT `MaKH` FROM `HoaDon` WHERE `ThangID` = `ChiSoDien`.`ThangID`)";
        List<ChiSoNuoc> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                long id = rs.getLong("ID");
                int maKH = rs.getInt("MaKH");
                int thangID = rs.getInt("ThangID");
                int chiSoCu = rs.getInt("ChiSoCu");
                int chiSoMoi = rs.getInt("ChiSoMoi");
                Date ngayGhi = new Date(rs.getDate("NgayGhi").getTime());

                ChiSoNuoc chiSoDien = new ChiSoNuoc(id, maKH, thangID, chiSoCu, chiSoMoi, ngayGhi);
                list.add(chiSoDien);
            }
            ps.close();
            MySQLConnect.disconnect();
        } catch (SQLException e) {
            MySQLConnect.disconnect();
        }
        return list;
    }
    
    @Override
    public ChiSoNuoc getChiSoDien(int maKH, int thangID) {
        ChiSoNuoc chiSoDien = null;
        try {
            Connection connection = MySQLConnect.getConnection();
            String query = "SELECT * FROM `ChiSoDien` WHERE maKH = ? AND thangID = ?";
            
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(query);
            ps.setInt(1, maKH);
            ps.setInt(2, thangID);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                long id = rs.getLong("ID");
                int chiSoCu = rs.getInt("ChiSoCu");
                int chiSoMoi = rs.getInt("ChiSoMoi");
                Date ngayGhi = rs.getDate("NgayGhi");
                
                chiSoDien = new ChiSoNuoc(id, maKH, thangID, chiSoCu, chiSoMoi, ngayGhi);
            }
            
            ps.close();
            connection.close();
            MySQLConnect.disconnect();
            
            
        }
        catch (SQLException e){
            System.err.println("Bug lòi ra: " + e.getMessage());
        }
        return chiSoDien;
    }

    @Override
    public ChiSoNuoc getFirstChiSoDien(int maKH) {
        ChiSoNuoc chiSoDien = null;
        try {
            Connection connection = MySQLConnect.getConnection();
            String query = "SELECT * FROM ChiSoDien WHERE MaKH = ? " + 
                    "AND NgayGhi = (SELECT MIN(NgayGhi) FROM ChiSoDien WHERE MaKH = ?);";
            
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(query);
            ps.setInt(1, maKH);
            ps.setInt(2, maKH);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                long id = rs.getLong("ID");
                int thangID = rs.getInt("ThangID");
                int chiSoCu = rs.getInt("ChiSoCu");
                int chiSoMoi = rs.getInt("ChiSoMoi");
                Date ngayGhi = rs.getDate("NgayGhi");
                
                chiSoDien = new ChiSoNuoc(id, maKH, thangID, chiSoCu, chiSoMoi, ngayGhi);
            }
            
            ps.close();
            connection.close();
            MySQLConnect.disconnect();
        }
        catch (SQLException e){
            System.err.println("Bug lòi ra: " + e.getMessage());
        }
        return chiSoDien;
    }
    
    @Override
    public ChiSoNuoc getLastChiSoDien(int maKH) {
        ChiSoNuoc chiSoDien = null;
        try {
            Connection connection = MySQLConnect.getConnection();
            String query = "SELECT * FROM ChiSoDien WHERE MaKH = ? " + 
                    "AND NgayGhi = (SELECT MAX(NgayGhi) FROM ChiSoDien WHERE MaKH = ?);";
            
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(query);
            ps.setInt(1, maKH);
            ps.setInt(2, maKH);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                long id = rs.getLong("ID");
                int thangID = rs.getInt("ThangID");
                int chiSoCu = rs.getInt("ChiSoCu");
                int chiSoMoi = rs.getInt("ChiSoMoi");
                Date ngayGhi = rs.getDate("NgayGhi");
                
                chiSoDien = new ChiSoNuoc(id, maKH, thangID, chiSoCu, chiSoMoi, ngayGhi);
            }
            
            ps.close();
            connection.close();
            MySQLConnect.disconnect();
        }
        catch (SQLException e){
            System.err.println("Bug lòi ra: " + e.getMessage());
        }
        return chiSoDien;
    }
    
    @Override
    public int createORUpdate(ChiSoNuoc chiSoDien) {
        try {
            Connection cons = MySQLConnect.getConnection();
            String sql = "INSERT INTO ChiSoDien(ID, MaKH, ThangID, ChiSoCu, ChiSoMoi, NgayGhi) VALUES(?, ?, ?, ?, ?, ?) "
                    + "ON DUPLICATE KEY UPDATE ChiSoCu = VALUES(ChiSoCu), ChiSoMoi = VALUES(ChiSoMoi), NgayGhi = VALUES(NgayGhi);";
            PreparedStatement ps = cons.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setLong(1, chiSoDien.getId());
            ps.setInt(2, chiSoDien.getMaKH());
            ps.setInt(3, chiSoDien.getThangID());
            ps.setInt(4, chiSoDien.getChiSoCu());
            ps.setInt(5, chiSoDien.getChiSoMoi());
            ps.setDate(6, chiSoDien.utilDateToSQLDate(chiSoDien.getNgayGhi()));
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            int generatedKey = 0;
            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }
            ps.close();
            MySQLConnect.disconnect();
            return generatedKey;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return 0;
    }

    public List<ChiSoNuoc> getListOfThang(Thang thang) {
        List<ChiSoNuoc> list = null;
        try {
            Connection connection = MySQLConnect.getConnection();
            String query = "SELECT * FROM `ChiSoDien` WHERE ThangID = ?";
            
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(query);
            ps.setInt(1, thang.getThangID());
            
            ResultSet rs = ps.executeQuery();
            list = new ArrayList<>();
            
            while (rs.next()) {
                ChiSoNuoc chiSoDien = new ChiSoNuoc();
                long id = rs.getLong("ID");
                int maKH = rs.getInt("MaKH");
                int chiSoCu = rs.getInt("ChiSoCu");
                int chiSoMoi = rs.getInt("ChiSoMoi");
                java.util.Date ngayGhi =  chiSoDien.sqlDateToUtilDate(rs.getDate("NgayGhi"));
                
                chiSoDien = new ChiSoNuoc(id, maKH, thang.getThangID(), chiSoCu, chiSoMoi, ngayGhi);
                list.add(chiSoDien);
            }
            ps.close();
            connection.close();
            MySQLConnect.disconnect();
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        }
        return list;
    } 
}
