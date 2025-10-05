public class thucquyen_BTtuan5 {

    // Lớp Sach nằm bên trong 
    static class Sach {
        private String maSach;
        private String tieuDe;
        private String tacGia;
        private int namXuatBan;
        private int soLuong;
        // Constructor không tham số
        public Sach() {}
        // Constructor đầy đủ tham số
        public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
            this.maSach = maSach;
            this.tieuDe = tieuDe;
            this.tacGia = tacGia;
            this.namXuatBan = namXuatBan;
            this.soLuong = soLuong;
        }
        // Getter và Setter
        public String getMaSach() { return maSach; }
        public void setMaSach(String maSach) { this.maSach = maSach; }
        public String getTieuDe() { return tieuDe; }
        public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }
        public String getTacGia() { return tacGia; }
        public void setTacGia(String tacGia) { this.tacGia = tacGia; }
        public int getNamXuatBan() { return namXuatBan; }
        public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }
        public int getSoLuong() { return soLuong; }
        public void setSoLuong(int soLuong) { this.soLuong = soLuong; }
        // Phương thức hiển thị thông tin
        public void hienThiThongTin() {
            System.out.println("Ma sach: " + maSach);
            System.out.println("Tieu de: " + tieuDe);
            System.out.println("Tac gia: " + tacGia);
            System.out.println("Nam xuat ban: " + namXuatBan);
            System.out.println("So luong: " + soLuong);
        }
    }
    // Hàm main
    public static void main(String[] args) {
        // Tạo sách bằng constructor đầy đủ
        Sach sach1 = new Sach("B001", "Java co ban", "Nguyen Van A", 2021, 10);
        // Tạo sách bằng constructor rỗng + setter
        Sach sach2 = new Sach();
        sach2.setMaSach("B002");
        sach2.setTieuDe("Cau truc du lieu");
        sach2.setTacGia("Tran Thi B");
        sach2.setNamXuatBan(2019);
        sach2.setSoLuong(5);
        // Hiển thị
        System.out.println("Thong tin sach 1:");
        sach1.hienThiThongTin();
        System.out.println("Thong tin sach 2:");
        sach2.hienThiThongTin();
    }
}
