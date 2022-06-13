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

import dao.chiSoNuocDAOlmpl;
import java.util.List;
import models.ChiSoNuoc;
import models.Thang;

/**
 *
 * @author dell
 */
public class ChiSoNuocServicelmpl implements ChiSoNuocService{
    private chiSoNuocDAOlmpl chiSoDienDAOImpl = null;

    public ChiSoNuocServicelmpl() {
        chiSoDienDAOImpl = new chiSoNuocDAOlmpl();
    }
    
    @Override
    public List<ChiSoNuoc> getList() {
        return chiSoDienDAOImpl.getList();
    }

    @Override
    public List<ChiSoNuoc> getListExcludedInHoaDon() {
        return chiSoDienDAOImpl.getListExcludedInHoaDon();
    }

    @Override
    public ChiSoNuoc getChiSoDien(int maKH, int thangID) {
        return chiSoDienDAOImpl.getChiSoDien(maKH, thangID);
    }

    @Override
    public ChiSoNuoc getLastChiSoDien(int maKH) {
        return chiSoDienDAOImpl.getLastChiSoDien(maKH);
    }

    @Override
    public ChiSoNuoc getFirstChiSoDien(int maKH) {
        return chiSoDienDAOImpl.getFirstChiSoDien(maKH);
    }

    @Override
    public int createORUpdate(ChiSoNuoc chiSoDien) {
        return chiSoDienDAOImpl.createORUpdate(chiSoDien);
    }

    @Override
    public List<ChiSoNuoc> getListOfThang(Thang thang) {
        return chiSoDienDAOImpl.getListOfThang(thang);
    }
}
