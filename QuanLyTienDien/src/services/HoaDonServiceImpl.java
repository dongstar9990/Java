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

import dao.HoaDonDAO;
import dao.HoaDonDAOImpl;
import java.util.List;
import models.HoaDon;
import models.Thang;

/**
 *
 * @author duato
 */
public class HoaDonServiceImpl implements HoaDonService{

    private HoaDonDAO hoaDonDAOImpl = null;

    public HoaDonServiceImpl() {
        hoaDonDAOImpl = new HoaDonDAOImpl();
    }
    
    @Override
    public List<HoaDon> getList() {
        return hoaDonDAOImpl.getList();
    }

    @Override
    public boolean deleteData(long maHoaDon) {
        return hoaDonDAOImpl.deleteData(maHoaDon);
    }

    @Override
    public int createHoaDon(HoaDon hoaDon) {
        return hoaDonDAOImpl.createHoaDon(hoaDon);
    }

    @Override
    public int updateBillStatus(int maHD) {
        return hoaDonDAOImpl.updateBillStatus(maHD);
    }

    public List<HoaDon> getListOfThang(Thang thang) {
        return hoaDonDAOImpl.getListOfThang(thang);
    }
    
}
