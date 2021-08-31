package ±¸Çö2;

import java.util.*;
import java.io.*;

public class n_2804 {
    public static void main(String[] args) throws IOException{
      Scanner sc = new Scanner(System.in);
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      String st1 = sc.next(),st2 = sc.next();
      int n1 = 0,  n2 = 0;
      char arr[][] = new char[st2.length()][st1.length()];
      for (int i = 0; i < st2.length(); i++)
        Arrays.fill(arr[i], '.');
      boolean b = false;
      for(int i=0; i<st1.length(); i++) {
        for(int j=0; j<st2.length(); j++) {
          if(st1.charAt(i) == st2.charAt(j) && !b) {
            b = true;
            n1 = j; n2 = i;
          }
        }
      }
      arr[n1] = st1.toCharArray();
      for(int i=0; i<st2.length(); i++)
        arr[i][n2] = st2.charAt(i);
      for(int i=0; i<st2.length(); i++) {
        for(int j=0; j<st1.length(); j++)
          bw.write(arr[i][j]);
        bw.write("\n");
      }
      bw.flush();bw.close();
  }
}