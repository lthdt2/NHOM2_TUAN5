public class Tra_BTTuan5 {
    static class Sach {
        private String maSach, tieuDe, tacGia;
        private int namXuatBan, soLuong;

        public Sach() {}

        public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
            this.maSach = maSach;
            this.tieuDe = tieuDe;
            this.tacGia = tacGia;
            this.namXuatBan = namXuatBan;
            this.soLuong = soLuong;
        }

        public void setMaSach(String maSach) { this.maSach = maSach; }
        public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }
        public void setTacGia(String tacGia) { this.tacGia = tacGia; }
        public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }
        public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

        public void hienThiThongTin() {
            System.out.println("THONG TIN SACH");
            System.out.println("Ma sach: " + maSach);
            System.out.println("Tieu de: " + tieuDe);
            System.out.println("Tac gia: " + tacGia);
            System.out.println("Nam xuat ban: " + namXuatBan);
            System.out.println("So luong: " + soLuong);
        }
    }
    
    public static void main(String[] args) {
        Sach sach1 = new Sach("S001", "Lap trinh Java", "Nguyen Van A", 2022, 8);
        Sach sach2 = new Sach();
        sach2.setMaSach("S002");
        sach2.setTieuDe("Co so du lieu");
        sach2.setTacGia("Tran Thi B");
        sach2.setNamXuatBan(2020);
        sach2.setSoLuong(5);

        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
    }
}