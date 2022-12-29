/*
chuong trinh java, minh hoa cach nhap du lieu:
    - nhap 1 chuoi, chua ho ten sinh vien
    - nhap 1 so, chua nam sinh
    => in ra man hinh, ho ten cua sinh vien va tuoi
 */

package demo;

import java.util.Scanner;
import java.time.Year;

public class Demo2 {
    public static void main(String[] args) {
        //khoi tao bien kieu Scanner de thuc hien cac lenh nhap lieu
        Scanner sc = new Scanner(System.in);
        
        //xuat thong bao, yeu cau nhap ho ten sv
        System.out.print("vui long nhap ho ten: ");
        String name = sc.nextLine();    //cho nhap chuoi => cat vo bien [name]
        
        //xuat thong bao, yeu cau nhap nam sinh
        System.out.print("vui long nhap nam sinh: ");
        int yob = sc.nextInt();
        
        int current_year = Year.now().getValue();           
            
        //in ra ho ten va tuoi cua sinh vien
        System.out.println(" >> Ho ten: " + name);
        System.out.println(" >> Tuoi: " + (current_year-yob));
        
        System.out.printf("\n >> ho ten: %s, tuoi: %d \n", name, current_year-yob);
        
    }
    
}
