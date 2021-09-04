package ±¸Çö2;

import java.io.*;

public class n_14582 {
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String st1[]=br.readLine().split(" "), st2[]=br.readLine().split(" ");
    int s1=0,s2=0;
    boolean b=false;
    for(int i=0; i<9; i++){
      s1+=Integer.parseInt(st1[i]);
      if(s1>s2) b=true;
      s2+=Integer.parseInt(st2[i]);
    }
    System.out.println(b?"Yes":"No");
  }
}