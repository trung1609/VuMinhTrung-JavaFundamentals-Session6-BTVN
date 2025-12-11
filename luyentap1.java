package Session6;

import java.util.Scanner;

public class luyentap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = Integer.parseInt(sc.nextLine());
        float[] arrScore = new float[n];
        int i = 0;
        do {
            System.out.println("********************QUAN LY DIEM SINH VIEN********************");
            System.out.println("1. Nhap danh sach diem sinh vien");
            System.out.println("2. In danh sach diem sinh vien");
            System.out.println("3. Tinh diem trung binh cua cac sinh vien");
            System.out.println("4. Tim diem cao nhat va thap nhat");
            System.out.println("5. Dem so luong sinh vien dat va truot");
            System.out.println("6. Sap xep diem tang dan");
            System.out.println("7. Thong ke so luong sinh vien gioi va xuat sac");
            System.out.println("8. Thoat");
            System.out.print("Lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    do {
                        System.out.printf("Nhap diem cho sinh vien thu %d: \n", i);
                        arrScore[i] = Float.parseFloat(sc.nextLine());
                        if (arrScore[i] < 0 || arrScore[i] > 10) {
                            System.err.println("Vui long nhap diem trong khoang tu 0-10.");
                            continue;
                        }
                        i++;
                    } while (i < arrScore.length);
                    break;
                case 2:
                    System.out.println("Danh sach diem sinh vien");
                    for (i = 0; i < arrScore.length; i++) {
                        System.out.printf("Diem cua sinh vien %d: %.2f\n", i, arrScore[i]);
                    }
                    break;
                case 3:
                    float sum = 0;
                    for (i = 0; i < arrScore.length; i++) {
                        sum += arrScore[i];
                    }
                    System.out.println("Diem trung binh cua sinh vien: " + (sum / arrScore.length));
                    break;
                case 4:
                    float max = arrScore[0];
                    float min = arrScore[0];
                    for (i = 0; i < arrScore.length; i++) {
                        if (arrScore[i] < min) {
                            min = arrScore[i];
                        }
                        if (arrScore[i] > max) {
                            max = arrScore[i];
                        }
                    }
                    System.out.println("Diem cao nhat: " + max);
                    System.out.println("Diem thap nhat: " + min);
                    break;
                case 5:
                    int countPass = 0;
                    int countFail = 0;
                    for (i = 0; i < arrScore.length; i++) {
                        if (arrScore[i] >= 5) {
                            countPass++;
                        } else {
                            countFail++;
                        }
                    }
                    System.out.println("So luong sinh vien dat: " + countPass);
                    System.out.println("So luong sinh vien truot: " + countFail);
                    break;
                case 6:
                    for (i = 0; i < arrScore.length; i++) {
                        for (int j = 0; j < arrScore.length - i - 1; j++) {
                            if (arrScore[j] > arrScore[j + 1]) {
                                float tmp = arrScore[j];
                                arrScore[j] = arrScore[j + 1];
                                arrScore[j + 1] = tmp;
                            }
                        }
                    }
                    System.out.println("Da sap xep diem tang dan");
                    break;
                case 7:
                    int rank = 0;
                    for (i = 0; i < arrScore.length; i++) {
                        if (arrScore[i] >= 8) {
                            rank++;
                        }
                    }
                    System.out.println("So luong sinh vien gioi va xuat sac: " + rank);
                    break;
                case 8:
                    System.out.println("Tam biet!");
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap tu 1-8");
            }
        } while (true);
    }
}
