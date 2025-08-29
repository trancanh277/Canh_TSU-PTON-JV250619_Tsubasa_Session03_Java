import java.util.Scanner;

public class baitap01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên khách hàng");
        String kh = sc.nextLine();
        System.out.println("Tên sản phẩm");
        String sp = sc.nextLine();
        System.out.println("Giá sản phẩm");
        float gia = Float.parseFloat(sc.nextLine());
        System.out.println("Số lượng mua");
        int soluong = Integer.parseInt(sc.nextLine());
        System.out.println("Khách có thẻ thành viên hay không (true/false)");
        boolean thanhvien = Boolean.parseBoolean(sc.nextLine());

        float thanhtien = gia * soluong;
        float vat = thanhtien * 0.08F;
        float giamgia = thanhvien ? gia * 0.1F : 0;
        float thanhtoan = thanhtien - giamgia + vat;
        System.out.println("Tên khách hàng: " + kh);
        System.out.println("Sản phẩm: " + sp);
        System.out.println("Giá: %,.0f" + gia);
        System.out.println("Số lượng: " + soluong);
        System.out.printf("Thành tiền: %,.0f VND\n", thanhtien);
        System.out.printf("Giảm giá: %,.0f VND\n", giamgia);
        System.out.printf("Tiền vat: %,.0f VND\n", vat);
        System.out.printf("Tổng thanh toán: %,.0f VND\n", thanhtoan);

    }
}
