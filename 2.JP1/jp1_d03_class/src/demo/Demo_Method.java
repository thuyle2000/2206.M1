/*
chuong trinh minh hoa cac cach lap trinh phuong thuc
 */
package demo;

import java.util.Scanner;

public class Demo_Method {

    public static void main(String[] args) {
        Demo_Method o = new Demo_Method();
        o.printTriangle();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\n >> nhap so nguyen N (>0): ");
        int n = sc.nextInt();
        double kq = o.factorial(n);
        System.out.printf(" %d! = %.0f \n", n, kq);
        
        System.out.printf("\n Tong cua 4,5,7,12 = %d \n", o.total(4,5,7,12));
        System.out.printf("\n Tong cua 3,12,8 = %d \n", o.total(3,12,8));
    }
    
    //phuong thuc ko tham so (), ko gia tri tra ve (void)
    private void printTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so tang cua tam giac (> 0) : ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    //phuong thuc co tham so (int), co gia tri tra ve (double)
    private double factorial(int n){
        double r = 1;
        for (int i = 2; i <= n; i++) {
            r *= i;
        }
        return r;
    }
    
    //phuong thuc co danh sach doi so (int) ko xac dinh, co gtri tra ve (int)
    private int total(int...a){
        int sum = 0;
        for (int n : a) {
            sum += n;
        }
        return sum;
    }
    
}
