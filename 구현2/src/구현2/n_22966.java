package ±¸Çö2;

import java.io.*;

public class n_22966 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine()), score=5;
        String title="";
        for(int i=0; i<T; i++){
          String st[]=br.readLine().split(" ");
          if(Integer.parseInt(st[1])<score){
        	  title=st[0]; 
        	  score=Integer.parseInt(st[1]);
          }
        }
        System.out.println(title);
    }
}