/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_bt1;

import java.util.Scanner;

/**
 *
 * @author Laptop NamAnh
 */

    public class Product {

    
    public String thh;
    public String nsx;
    public int gia;

   
 
    public void getthh(){
        this.thh=thh;
    }
    public void getnsx(){
        this.nsx=nsx;
    }
    public int getgia(){
        return gia;
    }
    public Product(String thh, String nsx, int gia) {
        this.thh = thh;
        this.nsx = nsx;
        this.gia = gia;
    }

    public Product() {
    }

   
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Nhập Tên Hàng Hóa: ");
        thh= sc.nextLine();
        System.out.print("Nhập Tên Nhà Sản Xuất: ");
        nsx= sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        gia = sc.nextInt();
    }
     public void Xuat(){
        
        System.out.println("HÀNG HÓA: "+thh+"\t NHÀ SX: "+nsx+"\t Đơn GIá: "+gia);
}

     

}
    

