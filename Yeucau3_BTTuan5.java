public class Yeucau3_BTTuan5
 {
    public static void main(String[] args) {
        // Tạo đối tượng sách 1
        Sach sach1 = new Sach();
        sach1.maSach = "S001";
        sach1.tieuDe = "Lập trình Java";
        sach1.tacGia = "Nguyễn Văn A";
        sach1.namXuatBan = 2021;
        sach1.soLuong = 10;

        // Tạo đối tượng sách 2
        Sach sach2 = new Sach();
        sach2.maSach = "S002";
        sach2.tieuDe = "Cấu trúc dữ liệu";
        sach2.tacGia = "Trần Văn B";
        sach2.namXuatBan = 2020;
        sach2.soLuong = 5;

        // Hiển thị thông tin
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
    }
}
