package ¼öÇĞp6;

import java.io.*;

public class n_2145 {
    public static int func(String st){
      String str[]=st.split("");
      int num=0;
      for(int i=0; i<str.length; i++)
        num+=Integer.parseInt(str[i]);
      if(num<10)
        return num;
      else
        return func(Integer.toString(num));
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String st=new String();
        while((st=br.readLine()).equals("0")==false){
          bw.write(func(st)+"\n");
        }
        bw.flush();bw.close();
    }
}