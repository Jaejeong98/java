package ¹®ÀÚ¿­;

import java.io.*;

public class n_2703 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
         String st=br.readLine(), str[]=br.readLine().split("");
         for(int j=0;j<st.length(); j++){
           if(st.charAt(j)==' ')
            bw.write(" ");
           else{
              int num=st.charAt(j)-'A';
              bw.write(str[num]+"");
           }
         }
         bw.write("\n");
        }
        bw.flush();bw.close();
    }
}