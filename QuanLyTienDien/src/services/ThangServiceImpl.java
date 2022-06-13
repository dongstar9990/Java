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

import dao.ThangDAO;
import dao.ThangDAOImpl;
import java.util.List;
import models.Thang;

/**
 *
 * @author duato
 */
public class ThangServiceImpl implements ThangService{
    
    private ThangDAO thangDAO = null;

    public ThangServiceImpl() {
        thangDAO = new ThangDAOImpl();
    }

    @Override
    public List<Thang> getList() {
        return thangDAO.getList();
    }

    @Override
    public int createORUpdate(Thang thang) {
        return thangDAO.createORUpdate(thang);
    }

    @Override
    public Thang getThang(int thangID) {
        return thangDAO.getThang(thangID);
    }

    @Override
    public Thang getLastThangOf(int maKH) {
        return thangDAO.getLastThangOf(maKH);
    }

    @Override
    public Thang getLastThang() {
        return thangDAO.getLastThang();
    }
    
}
