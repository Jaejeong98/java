package ¹®ÀÚ¿­;

import java.io.*;

public class n_9226 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String st=new String(), l="aeiou";
        while((st=br.readLine()).equals("#")==false){
          int j=0;
          boolean b=false;
          String str[]=st.split(""), result="";
          for(int i=0; i<str.length; i++){
            if(l.contains(str[i])){
              j=i; b=true; break;
            }
            else result+=str[i];
          }
          if(b){
            for(int i=j; j<str.length; j++) bw.write(str[j]);
          }
          bw.write(result+"ay\n");
        }
        bw.flush();bw.close();
    }
}