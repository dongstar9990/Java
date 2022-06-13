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

import java.util.List;
import models.KhachHang;

/**
 *
 * @author duato
 */
public interface KhachHangDAO {
    public List<KhachHang> getList();
    
    public int createORUpdate(KhachHang khachHang);
    
    public boolean deleteData(KhachHang khachHang);
    
    public KhachHang getKhachHang(int maKH);
}
