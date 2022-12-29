/*
mo ta cau truc cua 1 san pham, bao gom:
- instance fields: id, ten, don vi tinh, don gia
- instance methods: input(), out()
 */
package data;

import java.util.Scanner;

public class Product {

    //khai bao instance fields
    public String id, name, unit;
    public int price;
    
    //ham dung ko co tham so
    public Product(){
        id="P01";
        name="coca cola";
        unit="lon";
        price=1;
    }

    //ham dung co tham so
    public Product(String id, String name, String dvt, int gia ){
        this.id = id;
        this.name = name;
        this.unit = dvt;
        this.price = gia;
    }
    
    //ham nhap thong tin san pham
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println(" nhap thong tin san pham");
        System.out.print(" >> nhap id: ");
        id = sc.nextLine().trim();
        System.out.print(" >> nhap ten: ");
        name = sc.nextLine().trim();
        System.out.print(" >> nhap don vi tinh: ");
        unit = sc.nextLine().trim();
        System.out.print(" >> nhap don gia: ");
        price = sc.nextInt();
    }
    
    //ham xuat thong tin san pham
    public void output(){
        System.out.println("\n *** Thong tin san pham ***");
        System.out.println(" id  : " + id);
        System.out.println(" ten : " + name);
        System.out.println(" dvt : " + unit);
        System.out.println(" gia : " + price);
    }

    @Override
    public String toString() {
        return String.format("%s, %s (%s), %d ", id, name, unit, price );      
    }
    
   
    //chuong trinh kiem thu
    public static void main(String[] args) {
        Product p = new Product();
        System.out.println("San pham: " + p);
        
        Product p2 = new Product("P10","Banh snack","goi",6 );
        System.out.println("San pham: " + p2);
        
        Product p3 = new Product();
        p3.input();
        System.out.println("San pham: " + p3);
        p3.output();
        
    }
    
}
