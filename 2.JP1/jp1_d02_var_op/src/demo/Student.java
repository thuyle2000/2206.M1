/*
 * dinh nghia cau truc sinh vien, bao gom:
 * thuoc tinh : id, ten, gioi tinh, nam sinh va ten truong
 * phuong thuc : nhap thong tin sv, xuat thong tin sinh vien
 */
package demo;

import java.util.Scanner;

public class Student {

    //khai bao cac thuoc tinh id, name va gender, yob (instance variable)
    public String id, name;
    public boolean gender;
    public int yob;

    //khai bao thuoc tinh dung chung cho tat ca dt kieu Student(static variable)
    public static String schoolName = "fpt-aptech";

    //phuong thuc (ham) nhap thong tin cho 1 doi tuong sinh vien (instance method)
    public void input() {
        //khai bao bien cuc bo (local variable) sc, de ho tro viec nhap du lieu
        Scanner sc = new Scanner(System.in);

        System.out.print(" >> nhap ma so sinh vien: ");
        id = sc.nextLine();

        System.out.print(" >> nhap ho ten sinh vien: ");
        name = sc.nextLine();

        System.out.print(" >> nhap gioi tinh (true->nam/false->nu): ");
        gender = sc.nextBoolean();

        System.out.print(" >> nhap nam sinh: ");
        yob = sc.nextInt();
    }

    //phuong thuc (ham) in ra chi tiet cua doi tuong sv (instance method)
    public void output() {
        //in ra thong tin chi tiet (ms, ho ten...) cua sinh vien sv1
        System.out.println("== Thong tin sinh vien ==");
        System.out.println("truong: " + Student.schoolName);
        System.out.println("id: " + id);
        System.out.println("ho ten: " + name);
        System.out.println("gioi tinh: " + (gender ? "nam" : "nu"));
        System.out.println("nam sinh: " + yob);
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %d", id, name,gender ? "nam":"nu",yob);
    }
    
    
}
