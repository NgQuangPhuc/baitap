/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_bt1;

    import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class ProductMenu{
    static int menu(){
    System.out.println("*******MENU*********");
    System.out.println("1.Nhap thong tin");
    System.out.println("2.Hien thi thong tin");
    System.out.println("3.Sap xep thong tin giam dan");
    System.out.println("4.Thoat");
    int chon;
    Scanner sc=new Scanner(System.in);
    do{
        System.out.println("HAY CHON YEU CAU !");
        chon=sc.nextInt();
    }while(chon<1||chon>4);
       return chon;
}
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Product> arr = new ArrayList<>();
        int soluong = 0;
        int chon;
        do{
            chon = menu();
            switch(chon){
                case 1:
                    System.out.print("Nhập vào số lượng hàng hóa: ");
                     soluong = sc.nextInt();
                   for (int i = 0; i < soluong; i++){
                      Product hh = new Product();
                  System.out.println("Nhập thông tin cho hồ sơ thứ : "+(i+1));
                      hh.Nhap();
                      arr.add(hh);
                   }
                   break;
              
                case 2:for (int i = 0; i < soluong; i++){
                         arr.get(i).Xuat();
                }
                         break;
                case 3:  for(int i=0;i< soluong-1;i++)
                         for(int j=i+1;j<soluong;j++)
                         {
                            if(arr.get(i).getgia()<arr.get(j).getgia())
                            {
                                Product tg=new Product();
                                tg=arr.get(i);
                                arr.set(i, arr.get(j));
                                arr.set(j, tg);
                             
                            }
                         }
                System.out.println("Sap xep giam dan theo don gia");
                    for (int i = 0; i < soluong; i++){
                         arr.get(i).Xuat();
                  }
                    break;
                          
    }
        }while(chon!=4);
}  
}


