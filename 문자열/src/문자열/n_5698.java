package ¹®ÀÚ¿­;

import java.io.*;

public class n_5698 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String st=new String();
        while((st=br.readLine()).equals("*")==false){
          st=st.toLowerCase();
          String str[]=st.split(" ");
          boolean b=false;
          char ch=str[0].charAt(0);
          for(int i=1; i<str.length; i++){
            if(str[i].charAt(0)!=ch){b=true; break;}
          }
          bw.write(b?"N\n":"Y\n");
        }
        bw.flush(); bw.close();
    }
}