import java.util.Scanner;

public class baitap02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sohocvien = 0;
        float tongdiem = 0;
        float diemtoithieu = 10;
        float diemtoida = 0;
        do {
            System.out.println("********************MENU NHẬP ĐIỂM********************");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choise = Integer.parseInt(sc.nextLine());
            switch (choise) {
                case 1:
                    do {
                        System.out.println("Nhập điểm học viên");
                        float diem = Float.parseFloat(sc.nextLine());
                        System.out.println("Nhập -1 để dừng");
                        if(diem == -1) break;
                        else if(diem >= 0 && diem <= 10){
                            if(diem <5)
                                System.out.println("Xếp loại: Yếu");
                            else if (diem < 7)
                                System.out.println("Xếp loại: Trung bình");
                            else if (diem < 8)
                                System.out.println("Xếp loại: Khá");
                            else if (diem < 9)
                                System.out.println("Xếp loại: Giỏi");
                            else
                                System.out.println("Xếp loại: Xuất sắc");
                            sohocvien++;
                            tongdiem += diem;
                            if(diemtoithieu > diem)
                                diemtoithieu = diem;
                            if (diemtoida < diem)
                                diemtoida = diem;

                        }
                        else System.out.println("Điểm sinh viên có giá trị từ 0-10, vui lòng nhập lại");
                    }
                    while (true);
                    break;
                case 2:
                    if (sohocvien == 0)
                        System.out.println("Chưa có dữ liệu");
                    else {
                        System.out.printf("Số học viên đã nhập: %d\n Điểm trung bình %.1f \n Điểm cao nhất %.1f\n Điểm thấp nhất %.1f \n", sohocvien, tongdiem/sohocvien, diemtoithieu, diemtoida);
                    }

                    break;
                case 3:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1-3");
            }
        }
        while (true);

    }
}
