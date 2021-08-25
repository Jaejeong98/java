package ¹®ÀÚ¿­;

import java.io.*;

public class n_17838 {
    public static void main(String[] args)throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
       int T=Integer.parseInt(br.readLine());
       for(int i=0; i<T; i++){
         String st=br.readLine();
         if(st.length()!=7) bw.write(0+"\n");
         else{
          String str=st.replace(st.charAt(0),'1').replace(st.charAt(2),'2');
          if(str.equals("1122122")) bw.write(1+"\n");
          else bw.write(0+"\n");
         }
       }
       bw.flush();bw.close();
    }
}