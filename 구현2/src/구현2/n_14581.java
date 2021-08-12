package ±¸Çö2;

import java.util.*;

public class n_14581 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        if(i==1&&j==1)
          System.out.print(":"+st+":");
        else
          System.out.print(":fan:");
      }
      System.out.println("");
    }
  }
}