package ±¸Çö2;

import java.util.*;

public class n_14038 {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int w=0;
       String st="";
       for(int i=0; i<6; i++){
         if((st=sc.nextLine()).equals("W")) w++;
       }
       if(w==5||w==6) System.out.println(1);
       else if(w==3||w==4) System.out.println(2);
       else if(w==2||w==1) System.out.println(3);
       else System.out.println(-1);
    }
}