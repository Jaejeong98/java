package ¹®ÀÚ¿­;

import java.io.*;

public class n_1871 {
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    int T=Integer.parseInt(br.readLine());
    for(int i=0; i<T; i++){
      String st[]=br.readLine().split("-");
      int sum=0;
      for(int j=0; j<st[0].length(); j++){
        sum+=(st[0].charAt(j)-'A')*Math.pow(26, st[0].length()-j-1);
      }
      if(Math.abs(sum-Integer.parseInt(st[1]))<=100) bw.write("nice\n");
      else bw.write("not nice\n");
    }
    bw.flush(); bw.close();
  }
}