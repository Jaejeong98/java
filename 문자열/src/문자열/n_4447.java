package ¹®ÀÚ¿­;

import java.io.*;

public class n_4447 {
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    int T=Integer.parseInt(br.readLine());
    for(int i=0; i<T; i++){
      String st=br.readLine();
      int g=0, b=0;
      for(int j=0; j<st.length(); j++){
        char ch=st.charAt(j);
        if(ch>='A'&&ch<='Z') ch+=32;
        if(ch=='g') g++;
        else if(ch=='b')b++;
      }
      bw.write(st+" is ");
      if(g==b) bw.write("NEUTRAL\n");
      else bw.write(g>b?"GOOD\n":"A BADDY\n");
    }
    bw.flush(); bw.close();
  }
}