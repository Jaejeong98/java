package ¹®ÀÚ¿­;

import java.io.*;

public class n_10205 {
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    int T=Integer.parseInt(br.readLine());
    for(int i=0; i<T; i++){
      int c=Integer.parseInt(br.readLine());
      String st[]=br.readLine().split("");
      for(int j=0; j<st.length; j++){
        if(st[j].equals("c")) c++;
        else c--;
      }
      bw.write("Data Set "+(i+1)+":\n"+c+"\n\n");
    }
    bw.flush(); bw.close();
  }
}