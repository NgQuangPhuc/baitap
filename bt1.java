/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

import java.util.Scanner;

/**
 *
 * @author Laptop NamAnh
 */
public class bt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a;
       double b;
       char kt;
       String str;
       Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so nguyen: ");
        a=sc.nextInt();
        System.out.println("Nhap vao 1 so double: ");
        b=sc.nextDouble();
        System.out.println("Nhap vao 1 ki tu: ");
        sc.nextLine();
        kt=sc.nextLine().charAt(0);
        System.out.println("Nhap vao 1 chuoi:");
        str=sc.nextLine();
        System.out.println("So nguyen:"+a+"So double:"+b+"Ki tu: "+kt+"Chuoi:"+str);
    }
    
}
