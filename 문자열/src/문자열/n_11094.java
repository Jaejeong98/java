package ¹®ÀÚ¿­;

import java.io.*;

public class n_11094 {
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    int T=Integer.parseInt(br.readLine());
    for(int i=0; i<T; i++){
      String st[]=br.readLine().split(" ");
      if(st[0].equals("Simon")&&st[1].equals("says")){
        for(int j=2; j<st.length; j++)
          bw.write(" "+st[j]);
        bw.write("\n");
      }
    }
    bw.flush();bw.close();
  }
}