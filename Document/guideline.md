# HƯỚNG DẪN SỬ DỤNG

###Mục lục

[I. Mở đầu](#begin)

[II. Cài đặt phần mềm](#install)
- [1. Yêu cầu](#requirements)
- [2. Thư viên sử dụng](#libraries)
- [3. Kết nối CSDL](#connectdb)
- [4. Chạy chương trình](#run)
	
[III. Sử dụng](#usage)
- [1. Đăng nhập](#login)
- [2. Giới thiệu chức năng](#functions)

[Câu hỏi thường gặp](#faq)

===========================

<a name="begin"></a>
## Mở đầu

`Phần mềm quản lý Hoá đơn tiền điện` là một bài tập lớn học phần Lập trình Java của nhóm 18(Hảo, Nam, Trung) KTPM3-K13.

- **Ngôn ngữ**: Java
- **GUI**: SWING
- **Database**: MySQL
- **DB Driver**: JDBC
- **Structure**: MVC

<a name="instal"></a>
## Cài đặt phần mềm

<a name="requirements"></a>
### Yêu cầu

- Java 9 support requires Ant 1.10.0 or higher (JDK 15 is recommended)
- NetbeanIDE 12 or higher (Apache NetBean IDE 12 is recommended)
- MySQL installed

Lưu ý: Khuyến cáo dùng Java bản từ version 9-16. Vì một số thư viện sẽ không được hỗ trợ trong bản cao cấp hơn.

<a name="libraries"></a>
### Thư viện sử dụng

Bạn có thể tìm thấy thư viện ở trong thư mục QuanLyTienDien/libraries

- [MySQL SDBC Driver](https://dev.mysql.com/downloads/connector/j/): Thư viện kết nối CSDL MySQL
- [JCalendar](https://toedter.com/jcalendar/): Tạo hộp thoại chọn ngày JDateChooser
- [Synthetica Look and Feel for Swing](https://www.jyloo.com/synthetica/download/): Thư viện cho giao diện Look and Feel
- [Synthetica Simple2D Look and Feel Theme](https://www.jyloo.com/synthetica/themes/): Giao diện - Theme được thử viện ở trên hỗ trợ (có thư viện trên mới dùng được theme này)
- [JasperReports Library](https://community.jaspersoft.com/project/jasperreports-library/releases): 
	<ul>
	  <li>jasperreports-6.17.0.jar</li>
	  <li>jasperreports-annotation-processors-6.17.0.jar</li>
	  <li>jasperreports-javaflow-6.17.0.jar</li>
	  <li>jasperreports-metadata-6.17.0.jar</li>
	  <li>commons-beanutils-1.9.4.jar</li>
	  <li>commons-collections4-4.4.jar</li>
	  <li>commons-digester-2.1.jar</li>
	  <li>commons-logging-1.2.jar</li>
	  <li>groovy-all-2.4.9.jar</li>
	  <li>itext-2.1.7.jar</li>
	  <li>poi-5.0.0.jar</li>
	  <li>CustomFontPDF.jar: Tại itext xuất ra PDF bị lỗi font nên phải thêm custom font vào.</li>
	</ul>

JasperReports Dùng để tạo và in hoá đơn tiền điện. Thư viện chúa ghét nhất vì phải thêm cả tá các thư viện khác vào để hỗ trợ thư viện này.

<a name=connectdb></a>
### Kết nối CSDL

- Mở **MySQL Workbench** hoặc **phpMyAdmin** tạo một Schema (database): *quanlytiendien*
- Chạy hay import file *Database/MySQLScript.sql*
- Mở file `QuanLyTienDien/dao/MySQLConnect.java` và sửa lại `DATABASE_NAME`, `DATABASE_URL`, `USERNAME`, `PASSWORD` cho phù hợp.

<a name="run"></a>
### Chạy chương trình

- Mở Project `QuanLyTienDien` bằng NetBeanIDE
- Chọn Run Project (F6) để build và run 


<a name="usage"></a>
## Sử dụng

<a name="login"></a>
### Đăng nhập

<a href="https://ibb.co/SrVd479"><img src="https://i.ibb.co/SrVd479/image.png" alt="image" border="0" /></a>

Trước khi truy cập vào hệ thống, bắt buộc người dùng phải đăng nhập với tài khoản được cấp phép.

Mội số tài khoản mặc định: 

| Tài khoản | Mật khẩu | Quyền|
|-----------|----------|------
| admin | admin | QuanLy |
| quanly | quanly | QuanLy |
| thodien1 | 123456 | ThoDien |
| thodien2 | 123456 | ThoDien |
| thodien3 | 1234567 | ThoDien |
| thutien1 | 12345 | ThuTien |
| thutien2 | 123456789 | ThuTien |

<a name="functions"></a>
### Giới thiệu chức năng

Click vào ảnh để xem chi tiết.

<a href="https://ibb.co/1zVXWwV"><img src="https://i.ibb.co/1zVXWwV/image.png" alt="image" border="0" /></a>
<a href="https://ibb.co/BZFpvQg"><img src="https://i.ibb.co/BZFpvQg/image.png" alt="image" border="0" /></a>
<a href="https://ibb.co/LZ9QJqD"><img src="https://i.ibb.co/LZ9QJqD/image.png" alt="image" border="0" /></a>

<a name="faq"></a>
## Câu hỏi thường gặp

**Lỗi IllegalAccessError**

Do `--illegal-access` sẽ bị chặn trong các bản JDK gần đây nên phần mềm sẽ không thể sử dụng giao diện Look and Feel

**Khác**

Hãy thử *Clean and Build Project* lại một lần trước khi chạy.