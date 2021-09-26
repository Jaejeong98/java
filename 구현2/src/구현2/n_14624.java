package ±¸Çö2;

import java.util.*;

public class n_14624 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int T=sc.nextInt();
    if(T%2==0) System.out.println("I LOVE CBNU");
    else{
      for(int i=0; i<(T+1)/2+1; i++){
        if(i==0){
          for(int j=0; j<T; j++) 
        	  System.out.print("*");
        }
        else{
          for(int j=0; j<(T-1)/2-i+1; j++) 
        	  System.out.print(" ");
          System.out.print("*");
          if(i!=1){
            for(int j=0; j<(i-2)*2+1; j++)
              System.out.print(" ");
            System.out.print("*");
          }
        }
        System.out.println("");
      }
    }
  }
}