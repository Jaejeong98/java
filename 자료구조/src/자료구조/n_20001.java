package 자료구조;

import java.io.*;

public class n_20001 {
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String st="";
    int count=0;
    while((st=br.readLine()).equals("고무오리 디버깅 끝")==false){
      if(st.equals("문제")) count++;
      else if(st.equals("고무오리")){
        if(count==0) count+=2;
        else count--;
      }
    }
    System.out.println(count==0?"고무오리야 사랑해":"힝구");
  }
}