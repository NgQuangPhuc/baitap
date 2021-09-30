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
public class bt4 {
    public static void main(String[] args) {
       int td,sd;
       Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so dien: ");
        sd=sc.nextInt();
        if(sd<50)
        {
            td=sd*5000;
        }
        else
        {
            td=50*5000+(sd-50)*1200;
        }
        System.out.println("Tien dien cua ban la: "+td+ " VNĐ");
    }
}
