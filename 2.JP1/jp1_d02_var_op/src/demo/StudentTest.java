/*
day la chuong trinh kiem thu doi tuong Sinh Vien
 */
package demo;

public class StudentTest {

    public static void main(String[] args) {
        Student sv1 = new Student();
        
        //goi ham input() tren dt sv1, de nhap du lieu cho sv1
        sv1.input();
        
        //in ra thong tin chi tiet (ms, ho ten...) cua sinh vien sv1
        //sv1.output();
        
        //in thong tin cua doi tuong sv1, thong qua gia tri tra ve cua ham toString()
        System.out.println("thong tin sinh vien: " + sv1.toString());
        System.out.println("thong tin sinh vien: " + sv1);
        
    }
    
}
