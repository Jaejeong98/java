package ¹®ÀÚ¿­;

import java.io.*;

public class n_10176 {
    public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      int T=Integer.parseInt(br.readLine());
      for(int i=0; i<T; i++){
        boolean b=false;
        String st=br.readLine().toLowerCase();
        int ch[]=new int[26];
        for(int j=0; j<st.length(); j++){
          if(st.charAt(j)>='a'&&st.charAt(j)<='z')
            ch[st.charAt(j)-'a']++;
        }
        for(int j=0; j<13; j++){
          if(ch[j]!=ch[25-j]) {b=true;break;}
        }
        bw.write(b?"No\n":"Yes\n");
      }
      bw.flush();bw.close();
  }
}