package ÇØ½Ì;

import java.util.Scanner;

public class n_15829{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int len = sc.nextInt();
         String st = sc.next();
         long n = 31, m = 1234567891, r = 1, ans = 0; 
         for(int i=0; i<len; i++){
              ans += (st.charAt(i)-'a'+1)*r;
              r=(r*=n)%m;
         }
         System.out.println(ans%m);
     }
}