/*
minh hoa cach lam viec voi mang chuoi ky tu
 */
package demo;

import java.util.*;

public class Demo_array_string {

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
        
        //tao mang ds[] co n-chuoi ky tu
        String[] ds = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.printf("nhap chuoi thu %d: ", i+1);
            ds[i] = sc.nextLine().trim();
        }
        
        //in ra chuoi ky tu
        System.out.println("\n danh sach: ");
        for (String item : ds) {
            System.out.println("\t "+ item);
        }
        
    }

}
