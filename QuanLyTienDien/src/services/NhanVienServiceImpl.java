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

import dao.NhanVienDAO;
import dao.NhanVienDAOImpl;
import java.util.List;
import models.NhanVien;

/**
 *
 * @author duato
 */
public class NhanVienServiceImpl implements NhanVienService{
    
    private NhanVienDAO nhanVienDAO = null;

    public NhanVienServiceImpl() {
        nhanVienDAO = new NhanVienDAOImpl();
    }
    
    @Override
    public NhanVien getLogin(String taiKhoan, String matKhau) {
        return nhanVienDAO.getLogin(taiKhoan, matKhau);
    }

    @Override
    public List<NhanVien> getList() {
        return nhanVienDAO.getList();
    }

    @Override
    public int create(NhanVien nhanVien) {
        return nhanVienDAO.create(nhanVien);
    }
    
    @Override
    public int update(NhanVien nhanVien) {
        return nhanVienDAO.update(nhanVien);
    }

    @Override
    public boolean deleteData(int maNV) {
        return nhanVienDAO.deleteData(maNV);
    }

    @Override
    public int changePassword(int maNV, String oldPass, String newPass) {
        return nhanVienDAO.changePassword(maNV, oldPass, newPass);
    }
    
}
