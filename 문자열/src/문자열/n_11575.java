package ¹®ÀÚ¿­;

import java.io.*;

public class n_11575 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
          String st[]=br.readLine().split(" "), s=br.readLine();
          for(int j=0; j<s.length(); j++){
            int num=s.charAt(j)-'A';
            char ch=(char)((num*Integer.parseInt(st[0])+Integer.parseInt(st[1]))%26);
            bw.write(ch+'A');
          }
          bw.write("\n");
        }
        bw.flush(); bw.close();
    }
}