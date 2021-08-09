package ½Ã¹Ä·¹ÀÌ¼Ç;

import java.io.*;

public class n_10810 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String st[]=br.readLine().split(" "), result[]=new String[Integer.parseInt(st[0])+1];
        for(int i=0; i<Integer.parseInt(st[1]); i++){
          String str[]=br.readLine().split(" ");
          for(int j=Integer.parseInt(str[0]); j<=Integer.parseInt(str[1]); j++)
            result[j]=str[2];
        }
        for(int i=1; i<=Integer.parseInt(st[0]); i++)
          bw.write(result[i]==null?"0 ":result[i]+" ");
        bw.flush();bw.close();
    }
}