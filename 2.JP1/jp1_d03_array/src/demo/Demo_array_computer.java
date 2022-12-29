/*
minh hoa cach lap trinh mang cac doi tuong
 */
package demo;

import java.util.*;

public class Demo_array_computer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (true) {
            System.out.print(">> nhap so phan tu N (>2): ");
            n = sc.nextInt();
            if (n > 2) {
                break;
            }
        }

        sc.nextLine();

        //tao mang ds[] co n doi tuong Computer
        Computer[] ds = new Computer[n];

        //vong lap nhap n doi tuong Computer
        for (int i = 0; i < n; i++) {
            System.out.printf("nhap computer thu %d: \n", i + 1);
            ds[i] = new Computer();
            ds[i].input();
        }
        
        //in danh sach cac doi tuong Computer
        System.out.println("\n Danh sach cac may tinh ");
        for (Computer item : ds) {
            System.out.println(item);
        }

    }

}
