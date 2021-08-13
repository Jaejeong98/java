package ±¸Çö2;

import java.util.*;

public class n_7572 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8","9"},  a[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
        "K", "L"};
        int N = sc.nextInt(), num = (N + 56) % 60, n1= 0,n2= 0;
        for(int i = 0; i < num; i++){
            if(n1 == 9) n1 = 0;
            else n1++;
            if(n2 == 11) n2 = 0;
            else n2++;
        }
        System.out.print(a[n2]+n[n1]);
    }
}