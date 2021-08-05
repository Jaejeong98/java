package ±¸Çö2;

import java.io.*;

public class n_14910 {
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String st[]=br.readLine().split(" ");
    boolean b=false;
    for(int i=1; i<st.length; i++){
      if(Integer.parseInt(st[i])<Integer.parseInt(st[i-1])){
        b=true;
        break;
      }
    }
    System.out.println(b?"Bad":"Good");
  }
}