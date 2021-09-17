package ¹®ÀÚ¿­;

import java.io.*;
import java.util.*;

public class n_15819 {
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String st[]=br.readLine().split(" ");
    ArrayList<String> list=new ArrayList<>();
    for(int i=0; i<Integer.parseInt(st[0]); i++)
      list.add(br.readLine());
    Collections.sort(list);
    System.out.println(list.get(Integer.parseInt(st[1])-1));
  }
}