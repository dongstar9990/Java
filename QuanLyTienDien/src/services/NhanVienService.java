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
import models.NhanVien;

/**
 *
 * @author duato
 */
public interface NhanVienService {
    public List<NhanVien> getList();

    public int create(NhanVien nhanVien);
    
    public int update(NhanVien nhanVien);

    public boolean deleteData(int maNV);

    public int changePassword(int maNV, String oldPass, String newPass);

    public NhanVien getLogin(String taiKhoan, String matKhau);
}
