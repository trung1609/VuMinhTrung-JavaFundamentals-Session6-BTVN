package Session6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class luyentap2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = null;
        String email = null;
        String password = null;
        String phone = null;
        do {
            System.out.println("*******************QUAN LY NGUOI DUNG***********************");
            System.out.println("1. Nhap thong tin nguoi dung");
            System.out.println("2. Chuan hoa ho ten");
            System.out.println("3. Kiem tra email hop le");
            System.out.println("4. Kiem tra so dien thoai hop le");
            System.out.println("5. Kiem tra mat khau hop le");
            System.out.println("6. Thoat");
            System.out.print("Lua chon cua ban: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhap ho va ten: ");
                    name = input.nextLine();
                    System.out.print("Nhap email: ");
                    email = input.nextLine();
                    System.out.print("Nhap password: ");
                    password = input.nextLine();
                    System.out.print("Nhap phone: ");
                    phone = input.nextLine();
                    break;
                case 2:
                    //Cat 2 khoang dau va cuoi
                    //Bo nhung cho co tren 2 khoang trang
                    //Viet hoa chu dau con lai viet thuong
                    //Bo khoang trang cuoi
                    String nameStandard = name.trim().replaceAll("\\s+", " ");
                    String[] arrName = nameStandard.split(" ");
                    StringBuilder sb = new StringBuilder();
                    for (String element : arrName) {
                        sb.append(Character.toUpperCase(element.charAt(0)))
                                .append(element.substring(1).toLowerCase()).append(" ");
                    }
                    System.out.println("Chuoi sau khi chuan hoa: " + sb.toString().trim());
                    break;
                case 3:
                    String checkEmail = "[a-zA-Z\\d]{1,}@[a-zA-Z\\d]{1,}\\.[a-zA-Z]{2,3}";
                    if (Pattern.matches(checkEmail, email)) {
                        System.out.println("Email hop le");
                    } else {
                        System.out.println("Email khong hop le");
                    }
                    break;
                case 4:
                    Matcher checkPhone = Pattern.compile("(032|033|034|035|036|037|038|039|096|097|098|086|083|084|085|081|082|088|091|094|070|079|077|076|078|090|093|089|056|058|092|059|099)[0-9]{7}").matcher(phone);
                    if (checkPhone.find()) {
                        System.out.println("Phone hop le");
                    } else {
                        System.out.println("Phone khong hop le");
                    }
                    break;
                case 5:
                    String checkPassword = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()])[a-zA-Z0-9!@#$%^&*()]{8,}";
                    if (Pattern.matches(checkPassword, password)) {
                        System.out.println("Password hop le");
                    } else {
                        System.out.println("Password khong hop le");
                    }
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
