package ±¸Çö2;

import java.io.*;

public class n_2511 {
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String st1[]=br.readLine().split(" "), st2[]=br.readLine().split(" ");
    int a=0, b=0, c=0;
    for(int i=0; i<10; i++){
      if(Integer.parseInt(st1[i])==Integer.parseInt(st2[i])){a++;b++;}
      else{
        if(Integer.parseInt(st1[i])>Integer.parseInt(st2[i])){ a+=3; c=1;}
        else {b+=3;c=2;}
      }
    }
    System.out.println(a+" "+b);
    if(a==b){
      if(c==0) System.out.println("D");
      else System.out.println(c==1?"A":"B");
    }else
      System.out.println(a>b?"A":"B");
  }
}