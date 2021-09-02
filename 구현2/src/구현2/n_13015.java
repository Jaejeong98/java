package 구현2;

import java.util.*;
import java.io.*;

public class n_13015 {
  public static void main(String[] args)throws IOException{
    Scanner sc=new Scanner(System.in);
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    int T=sc.nextInt();
    for(int i=0; i<T; i++){
      for(int j=0; j<i; j++)
        bw.write(" ");
      for(int j=0; j<T; j++){
        if(i==0) bw.write("*");
        else{
          if(j==0||j==T-1) bw.write("*");
          else bw.write(" ");
        }
      }
      for(int j=0; j<(T-2-i)*2+1; j++)
        bw.write(" ");
      for(int j=0; j<T; j++){
        if(i==0) bw.write("*");
        else{
          if(i==T-1&&j==0) continue;
          else if(j==0||j==T-1) bw.write("*");
          else bw.write(" ");
        }
      }
      bw.write("\n");
    }
    for(int i=T-2; i>=0; i--){
      for(int j=0; j<i; j++)
        bw.write(" ");
      for(int j=0; j<T; j++){
        if(i==0) bw.write("*");
        else{
          if(j==0||j==T-1) bw.write("*");
          else bw.write(" ");
        }
      }
      for(int j=0; j<(T-2-i)*2+1; j++)
        bw.write(" ");
      for(int j=0; j<T; j++){
        if(i==0) bw.write("*");
        else{
          if(i==T-1&&j==0) continue;
          else if(j==0||j==T-1) bw.write("*");
          else bw.write(" ");
        }
      }
      bw.write("\n");
    }
    bw.flush();bw.close();
  }
}
//코드 줄일 방법 생각해보기