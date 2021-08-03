package ¹®ÀÚ¿­;

import java.io.*;

public class n_11367 {
  public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    int T=Integer.parseInt(br.readLine());
    for(int i=0; i<T; i++){
      String st[]=br.readLine().split(" "),sc=new String();
      int score=Integer.parseInt(st[1]);
      if(score>=97) sc="A+";
      else if(score>=90) sc="A";
      else if(score>=87) sc="B+";
      else if(score>=80) sc="B";
      else if(score>=77) sc="C+";
      else if(score>=70) sc="C";
      else if(score>=67) sc="D+";
      else if(score>=60) sc="D";
      else sc="F";
      bw.write(st[0]+" "+sc+"\n");
    }
    bw.flush(); bw.close();
  }
}
