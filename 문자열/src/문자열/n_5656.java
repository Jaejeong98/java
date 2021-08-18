package ¹®ÀÚ¿­;

import java.io.*;

public class n_5656 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String st=new String();
        int count=0;
        while((st=br.readLine()).contains("E")==false){
          count++;
          String str[]=st.split(" ");
          int n1=Integer.parseInt(str[0]), n2=Integer.parseInt(str[2]);
          bw.write("Case "+count+": ");
          switch(str[1]){
            case ">":
              bw.write(n1>n2?"true":"false"); break;
            case ">=":
              bw.write(n1>=n2?"true":"false");break;
            case "<":
              bw.write(n1<n2?"true":"false");break;
            case "<=":
              bw.write(n1<=n2?"true":"false");break;
            case "==":
              bw.write(n1==n2?"true":"false");break;
            default: 
              bw.write(n1!=n2?"true":"false");break;
          }
          bw.write("\n");
        }
        bw.flush();bw.close();
    }
}