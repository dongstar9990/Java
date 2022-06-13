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

import java.util.List;
import models.ChiSoNuoc;
import models.Thang;

/**
 *
 * @author dell
 */
public interface ChiSoNuocService {
     public List<ChiSoNuoc> getList();
    // Lấy danh sách chỉ số điện chưa lập hoá đơn
    public List<ChiSoNuoc> getListExcludedInHoaDon();
    public ChiSoNuoc getChiSoDien(int maKH, int thangID);
    public ChiSoNuoc getLastChiSoDien(int maKH);
    public ChiSoNuoc getFirstChiSoDien(int maKH);
    public int createORUpdate(ChiSoNuoc chiSoDien);
    public List<ChiSoNuoc> getListOfThang(Thang thang);
}
