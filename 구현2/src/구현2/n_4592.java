package ±¸Çö2;

import java.io.*;

public class n_4592 {
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    String st=new String();
    while((st=br.readLine()).equals("0")==false){
      String str[]=st.split(" "), result="";
      for(int i=1; i<str.length; i++){
        if(str[i].equals(result))
          continue;
        else{
          result=str[i];
          bw.write(str[i]+" ");
        }
      }
      bw.write("$\n");
    }
    bw.flush(); bw.close();
  }
}