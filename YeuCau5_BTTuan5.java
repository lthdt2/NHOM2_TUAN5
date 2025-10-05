import java.util.Scanner;

public class YeuCau5_BTTuan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sách: ");
        int n = sc.nextInt();
        sc.nextLine(); // bỏ dòng thừa

        // Khai báo mảng chứa sách
        Sach[] danhSachSach = new Sach[n];

        // Nhập thông tin cho từng sách
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhập thông tin cho sách thứ " + (i + 1) + " ---");
            danhSachSach[i] = new Sach();
            danhSachSach[i].nhapThongTin();
        }

        // Hiển thị danh sách sách vừa nhập
        System.out.println("\n====== DANH SÁCH CÁC SÁCH ======");
        for (int i = 0; i < n; i++) {
            danhSachSach[i].hienThiThongTin();
        }
    }
}
