package ¹®ÀÚ¿­;

import java.io.*;

public class n_5789 {
    public static void main(String[] args)throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
       int T=Integer.parseInt(br.readLine());
       for(int i=0; i<T; i++){
         String st[]=br.readLine().split("");
         int length=st.length/2;
         if(st[length-1].equals(st[length])) bw.write("Do-it\n");
         else bw.write("Do-it-Not\n");
       }
       bw.flush(); bw.close();
    }
}