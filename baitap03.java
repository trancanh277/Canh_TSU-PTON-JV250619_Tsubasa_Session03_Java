import java.util.ArrayList;
import java.util.Scanner;

public class baitap03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Float> listluong = new ArrayList<>();
        int nhanvien = 0;
        float tongluong = 0;
        float luongthapnhat = Float.MAX_VALUE;
        float luongcaonhat = Float.MIN_VALUE;
        do {

            System.out.println("***************MENU NHẬP LƯƠNG***************");
            System.out.println("1.  Nhập lương nhân viên");
            System.out.println("2.  Hiển thị thống kê");
            System.out.println("3.  Tính tổng số tiền thưởng cho nhân viên");
            System.out.println("4.  Thoát");
            System.out.println("Lựa chọn của bạn:");
            int choise = Integer.parseInt(input.nextLine());
            switch (choise) {
                case 1:
                   do {
                       System.out.println("Nhập lương nhân viên");
                       float luong = Float.parseFloat(input.nextLine());
                       System.out.println("Nhập -1 để dừng");
                       if(luong == -1)
                           break;
                       else if(luong >= 0 && luong <= 500000000){
                           if(luong < 5000000)
                               System.out.println("Thu nhập thấp");
                           else if (luong < 15000000)
                               System.out.println("Thu nhập trung bình");
                           else if(luong < 50000000)
                               System.out.println("Thu nhập khá");
                           else
                               System.out.println("Thu nhập cao");
                           nhanvien++;
                           tongluong += luong;
                           listluong.add(luong);
                           if(luongthapnhat > luong)
                               luongthapnhat = luong;
                           if (luongcaonhat < luong)
                               luongcaonhat = luong;
                       }

                       else
                           System.out.println("Tiền lương có giá trị từ 0 - 500000000, vui long nhập lại");

                   }
                   while (true);
                    break;
                case 2:
                    if ( nhanvien == 0)
                        System.out.println("Chưa có dữ liệu");
                    else {
                        System.out.printf("Số nhân viên đã nhập: %d\n Lương trung bình: %,.0f\n Lương cao nhất: %,.0f \n Lương thấp nhất: %,.0f\n Tổng tiền lương: %,.0f\n ", nhanvien, tongluong/nhanvien, luongcaonhat,luongthapnhat, tongluong );

                    }
                    break;
                case 3:
                    if(listluong.isEmpty()) {
                        System.out.println("Chưa có dữ liệu để tính thưởng");
                    } else {
                        float tongThuong = 0;
                        for (float luong : listluong) {
                            float thuong ;
                            if (luong < 5000000)
                                thuong = luong * 0.05f;
                            else if (luong <= 15_000_000) thuong = luong * 0.10f;
                            else if (luong <= 50_000_000) thuong = luong * 0.15f;
                            else if (luong <= 100_000_000) thuong = luong * 0.20f;
                            else thuong = luong * 0.25f;
                            tongThuong += thuong;
                        }
                        System.out.printf("Tổng tiền thưởng cho tất cả nhân viên: %,.0f\n", tongThuong);
                    }

                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1-4");
            }
        }
        while (true);
    }
}
