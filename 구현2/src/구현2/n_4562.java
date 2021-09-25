package ±¸Çö2;

import java.io.*;

public class n_4562 {
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    int T=Integer.parseInt(br.readLine());
    for(int i=0; i<T; i++){
      String st[]=br.readLine().split(" ");
      bw.write(Integer.parseInt(st[0])<Integer.parseInt(st[1])?"NO BRAINS\n":"MMM BRAINS\n");
    }
    bw.flush();bw.close();
  }
}