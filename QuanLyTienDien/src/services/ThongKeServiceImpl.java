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

import dao.ThongKeDAOImpl;
import java.util.List;


public class ThongKeServiceImpl implements ThongKeService {

    ThongKeDAOImpl thongKeDAOImpl = new ThongKeDAOImpl();
    @Override
    public List<List<Object>> getRawData() {
        return thongKeDAOImpl.getRawData();
    }
    
}
