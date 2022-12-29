/*
chuong trinh demo cau truc lap trinh dieu kien
 */
package demo;

import java.util.Scanner;

public class Demo_Condition {

    public static void main(String[] args) {
//        testDivision();
//        testGrade();

        testDayInMonth();

    }

    //demo if-else
    private static void testDivision() {
        Scanner sc = new Scanner(System.in);
        System.out.print(">> nhap so nguyen thu 1: ");
        int a = sc.nextInt();

        System.out.print(">> nhap so nguyen thu 2: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println(">> Loi: mau so=0, nen ko the thuc hien phep chia !");
        } else {
            System.out.printf(" %d / %d = %.2f \n", a, b, (float) a / b);
        }
    }

    //demo if-else-if ladder
    private static void testGrade() {
        Scanner sc = new Scanner(System.in);
        System.out.print(">> nhap ten sv: ");
        String name = sc.nextLine().trim();
        System.out.print(">> nhap diem ket qua: ");
        int mark = sc.nextInt();

        String comment = "";

        if (mark < 0 || mark > 100) {
            System.out.println(" *** Loi: diem nhap ko hop le !");

        } else if (mark >= 90) {
            comment = "xuat sac";
        } else if (mark >= 80) {
            comment = "gioi";
        } else if (mark >= 65) {
            comment = "kha";
        } else if (mark >= 50) {
            comment = "trung binh";
        } else {
            comment = "chua dat !";
        }

        if (!comment.isEmpty()) {
            System.out.println("\n Thong tin sinh vien: ");
            System.out.println(" ho ten: " + name);
            System.out.println(" diem ket qua: " + mark);
            System.out.println(" xep loai: " + comment);
        }

    }

    //demo switch-case
    private static void testDayInMonth() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kiem tra so ngay trong thang");
        System.out.print(" >> nhap nam: ");
        int year = sc.nextInt();
        System.out.print(" >> nhap thang: ");
        int month = sc.nextInt();
                
        switch (month) {
            case 1,3,5,7,8,10,12:
                System.out.printf(">> thang %d, nam %d co 31 ngay.\n", month, year);
                break;
            case 4,6,9,11:
                System.out.printf(">> thang %d, nam %d co 30 ngay.\n", month, year);
                break;
            case 2:
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.printf(">> thang %d, nam %d co 29 ngay.\n", month, year);
                }
                else{
                    System.out.printf(">> thang %d, nam %d co 28 ngay.\n", month, year);
                }
                break;
            default:
                System.out.println(">> Loi: Thang nhap ko hop le !!!");
                break;
        }
    }

    
    private static void testDayInMonth2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kiem tra so ngay trong thang");
        System.out.print(" >> nhap nam: ");
        int year = sc.nextInt();
        System.out.print(" >> nhap thang: ");
        int month = sc.nextInt();
        int days = -1;
        
        switch (month) {
            case 1,3,5,7,8,10,12 -> days=31;
            case 4,6,9,11 -> days=30;
            case 2 -> {
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    days = 29;
                }
                else{                   
                    days = 28;
                }
            }
            default -> System.out.println(">> Loi: Thang nhap ko hop le !!!");
        }
        
        if(days!=-1){
            System.out.printf(">> thang %d, nam %d co %d ngay.\n", month, year, days);
        }
        
    }
}
