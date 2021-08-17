package ±¸Çö2;

import java.io.*;

public class n_2774 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
          String st[]=br.readLine().split("");
          int arr[]=new int[10], count=0;
          for(int j=0; j<st.length; j++)
            arr[Integer.parseInt(st[j])]++;
          for(int j=0; j<10; j++){
            if(arr[j]!=0) count++;
          }
          bw.write(count+"\n");
        }
        bw.flush();bw.close();
    }
}