package Session6;

import java.util.Arrays;
import java.util.Scanner;

public class luyentap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrBienSo = new String[0];
        String bienSo = null;
        do {
            System.out.println("***************** QUAN LY BIEN SO XE *****************");
            System.out.println("1. Them cac bien so xe");
            System.out.println("2. Hien thi danh sach bien so xe");
            System.out.println("3. Tim kiem bien so xe");
            System.out.println("4. Tim kiem bien so xe theo ma tinh");
            System.out.println("5. Sap xep bien so xe tang dan");
            System.out.println("6. Thoat");
            System.out.print("Lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    do {
                        System.out.println("Them bien so xe: ");
                        bienSo = sc.nextLine();
                        String checkBienSo = "[\\d]{2}[A-Z]{1}[-][0-9]{3}\\.[0-9]{2}";
                        if (!bienSo.matches(checkBienSo)) {
                            System.err.println("Vui long nhap dung dinh dang bien so.");
                            continue;
                        }
                        String[] newArrBienSo = new String[arrBienSo.length + 1];
                        for (int i = 0; i < arrBienSo.length; i++) {
                            newArrBienSo[i] = arrBienSo[i];
                        }
                        newArrBienSo[arrBienSo.length] = bienSo;
                        arrBienSo = newArrBienSo;
                        System.out.printf("Da them bien so: %s\n", bienSo);
                        break;
                    } while (true);
                    break;
                case 2:
                    System.out.println("Danh sach bien so xe:");
                    for (int i = 0; i < arrBienSo.length; i++) {
                        System.out.println(arrBienSo[i]);
                    }
                    break;
                case 3:
                    boolean isFoundBienSo = false;
                    System.out.println("Nhap bien so xe can tim: ");
                    String searchBienSo = sc.nextLine();
                    for (int i = 0; i < arrBienSo.length; i++) {
                        if (arrBienSo[i].contains(searchBienSo)) {
                            System.out.printf("Bien so xe %s co ton tai\n", searchBienSo);
                            isFoundBienSo = true;
                        }
                    }
                    if (!isFoundBienSo) {
                        System.out.printf("Bien so xe %s khong ton tai\n", searchBienSo);
                    }
                    break;
                case 4:
                    boolean isFoundMaTinh = false;
                    System.out.println("Nhap ma tinh can tim");
                    String maTinh = sc.nextLine();
                    for (int i = 0; i < arrBienSo.length; i++) {
                        if (arrBienSo[i].startsWith(maTinh)) {
                            System.out.println(arrBienSo[i]);
                            isFoundMaTinh = true;
                        }
                    }
                    if (!isFoundMaTinh) {
                        System.out.printf("Bien so xe theo ma tinh %s khong ton tai\n", maTinh);
                    }
                    break;
                case 5:
                    for (int i = 0; i < arrBienSo.length; i++) {
                        for (int j = 0; j < arrBienSo.length - i - 1; j++) {
                            if (arrBienSo[j].compareTo(arrBienSo[j + 1]) > 0) {
                                String tmp = arrBienSo[j];
                                arrBienSo[j] = arrBienSo[j + 1];
                                arrBienSo[j + 1] = tmp;
                            }
                        }
                    }
                    System.out.println("Da sap xep bien so xe tang dan");
                    break;
                case 6:
                    System.out.println("Tam biet!");
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap tu 1-6");
            }
        } while (true);
    }
}
