package ±¸Çö2;

import java.util.*;

public class n_11943 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[4];
    for(int i=0; i<4; i++)
      arr[i]=sc.nextInt();
    System.out.println(arr[0]+arr[3]>arr[1]+arr[2]?arr[1]+arr[2]:arr[0]+arr[3]);
  }
}