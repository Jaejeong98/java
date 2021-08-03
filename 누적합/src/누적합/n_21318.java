package ДЉРћЧе;

import java.io.*;

public class n_21318 {
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    int T=Integer.parseInt(br.readLine()), arr[]=new int[T+1], arr2[]=new int[T+1], num=0;
    String st[]=br.readLine().split(" ");
    for(int i=1; i<T+1; i++)
      arr[i]=Integer.parseInt(st[i-1]);
    for(int i=1; i<T; i++){
      if(arr[i+1]<arr[i]) num++;
      arr2[i+1]=num;
    }
    int C=Integer.parseInt(br.readLine());
    for(int i=0; i<C; i++){
      String str[]=br.readLine().split(" ");
      bw.write(arr2[Integer.parseInt(str[1])]-arr2[Integer.parseInt(str[0])]+"\n");
    }
    bw.flush(); bw.close();
  }
}
