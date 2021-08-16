package ¹®ÀÚ¿­;

import java.util.*;

public class n_17201 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int T=sc.nextInt();
    String st[]=sc.next().split("");
    boolean b=false;
    for(int i=0; i<T*2-1; i++){
      if(st[i+1].equals(st[i])){
        b=true;
        break;
      } 
    }
    System.out.println(b?"No":"Yes");
  }
}