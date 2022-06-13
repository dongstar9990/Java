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
package services;

import dao.KhachHangDAO;
import dao.KhachHangDAOImpl;
import java.util.List;
import models.KhachHang;

/**
 *
 * @author duato
 */
public class KhachHangServiceImpl implements KhachHangService{
    
    private KhachHangDAO khachHangDAO = null;

    public KhachHangServiceImpl() {
        khachHangDAO = new KhachHangDAOImpl();
    }
    
    
    @Override
    public List<KhachHang> getList() {
        return khachHangDAO.getList();
    }

    @Override
    public int createORUpdate(KhachHang khachHang) {
        return khachHangDAO.createORUpdate(khachHang);
    }

    @Override
    public boolean deleteData(KhachHang khachHang) {
        return khachHangDAO.deleteData(khachHang);
    }

    @Override
    public KhachHang getKhachHang(int maKH) {
        return khachHangDAO.getKhachHang(maKH);
    }
    
}
