package ¹®ÀÚ¿­;

import java.io.*;

public class n_4470 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
          String st=br.readLine();
          bw.write((i+1)+". "+st+"\n");
        }
        bw.flush();bw.close();
    }
}