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
public class bt2 {
    public static void main(String[] args) {
        int a,b,c,mx,mn;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        a=sc.nextInt();
        System.out.println("Nhap so thu hai: ");
        b=sc.nextInt();
        System.out.println("Nhap so thu ba: ");
        c=sc.nextInt();
        mx=a;
        mn=a;
       if(mx<b){mx=b;};
       if(mx<c){mx=c};
       if(mn>b){mn=b;};
       if(mn>c){mn=c;};
        System.out.println("max: "+mx);         
        System.out.println("min: "+mn);
    }
}
