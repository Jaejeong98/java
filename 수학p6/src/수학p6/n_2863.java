package ¼öÇÐp6;

import java.util.*;

public class n_2863 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Double arr[]=new Double[4], num=0.0, max=0.0, temp=0.0;
    int c=0;
    for(int i=0;i<4; i++) arr[i]=sc.nextDouble();
    for(int i=0; i<4; i++){
      num=arr[0]/arr[2]+arr[1]/arr[3];
      if(max<num){max=num; c=i;}
      temp=arr[0];
      arr[0]=arr[2];
      arr[2]=arr[3];
      arr[3]=arr[1];
      arr[1]=temp;
    }
    System.out.println(c);
  }
}