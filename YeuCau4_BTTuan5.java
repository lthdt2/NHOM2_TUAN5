import java.util.Scanner;

public class Sach {
    // Thuộc tính
    String maSach;
    String tieuDe;
    String tacGia;
    int namXuatBan;
    int soLuong;

    
    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("---------------------------");
    }

   
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách: ");
        maSach = sc.nextLine();

        System.out.print("Nhập tiêu đề: ");
        tieuDe = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        tacGia = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        namXuatBan = sc.nextInt();

        System.out.print("Nhập số lượng: ");
        soLuong = sc.nextInt();
        sc.nextLine(); // bỏ dòng thừa
    }
}
