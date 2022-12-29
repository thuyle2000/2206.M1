/*
chuong trinh minh hoa cach tao mang so nguyen ngau nhien
 */
package demo;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Demo_array_int {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        
        while(true){
            System.out.print(">> nhap so phan tu N (>2): ");
            n = sc.nextInt();
            if(n>2){
                break;
            }
        }
        
        //khai bao mang so nguyen a[]- co n-phan tu
        int[] a = new int[n];
        
        Random r = new Random();
        
        //khoi tao gia tri ngau nhien cho n-phan tu
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(0, 100);
        }
        
        //in mang a[] ra man hinh
        System.out.printf("\n Day so ngau nhien %d-phan tu \n", n);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d  ", a[i]);
        }
        
        //in mang a[] sau khi sap xep thu tu
        Arrays.sort(a);
        System.out.printf("\n Day so sau khi xep thu tu \n", n);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d  ", a[i]);
        }
        
        
    }
    
}
