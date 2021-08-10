package ±¸Çö2;

import java.io.*;
import java.util.*;

public class n_17293 {
    public static void main(String[] args) throws IOException{
      Scanner sc=new Scanner(System.in);
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      int T=sc.nextInt(), T_copy=T;
      while(T!=0){
        String st=T==1?"1 bottle":T+" bottles", st1=(T-1)==1?"1 bottle":(T-1)+" bottles";
        bw.write(st+" of beer on the wall, "+st+" of beer.\nTake one down and pass it around, ");
        bw.write((T-1)==0?"no more bottles of beer on the wall.\n\n":st1+" of beer on the wall.\n\n");
        T--;
      }
      bw.write("No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, ");
      bw.write(T_copy==1?"1 bottle":T_copy+" bottles");
      bw.write(" of beer on the wall.\n");
      bw.flush();bw.close();
    }
}