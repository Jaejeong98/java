package ±¸Çö2;

import java.io.*;

public class n_3985 {
    public static void main(String[] args)throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int T=Integer.parseInt(br.readLine()),num=Integer.parseInt(br.readLine()), arr[]=new int[T+1],em=0, em_n=1000,rm=0,rm_n=1000;
       for(int i=0; i<num; i++){
         String st[]=br.readLine().split(" ");
         int n1=Integer.parseInt(st[0]), n2=Integer.parseInt(st[1]), count=0;
         if(em<n2-n1+1){em=n2-n1+1;em_n=i+1;}
         for(int j=n1; j<=n2; j++){
           if(arr[j]==0){arr[j]++; count++;}
         }
         if(rm<count){rm=count;rm_n=i+1;}
       }
       System.out.println(em_n+"\n"+rm_n);
    }
}