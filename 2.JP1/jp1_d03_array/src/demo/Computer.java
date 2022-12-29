/*
mo ta 1 cau truc may tinh, bao gom :
    - fields : id, thuong hieu, don gia
    - methods: input(), toString()
    - constructors
 */
package demo;

import java.util.Scanner;

public class Computer {
    public String id, brand;
    public int price;

    public Computer() {
        id="C01";
        brand="Asus";
        price=200;
    }

    public Computer(String id, String brand, int price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhap id: ");
        id=sc.nextLine().trim();
        System.out.print(" nhap thuong hieu: ");
        brand = sc.nextLine().trim();
        System.out.print(" nhap don gia: ");
        price = sc.nextInt();
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d",id, brand, price);
    }
}
