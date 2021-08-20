package ¹®ÀÚ¿­;

import java.io.*;

public class n_10174 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
          String st=br.readLine().toLowerCase(), str[]=st.split("");
          boolean b=false;
          for(int j=0; j<(int)Math.floor((double)str.length/2); j++){
            if(str[j].equals(str[str.length-j-1])==false){ b=true; break; }
          }
          bw.write(b?"No\n":"Yes\n");
        }
        bw.flush();bw.close();
    }
}
