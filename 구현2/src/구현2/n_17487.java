package ±¸Çö2;

import java.util.*;

public class n_17487 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String st=sc.nextLine();
    int left=0, right=0, shift=0;
    for(int i=0; i<st.length(); i++){
      char ch=st.charAt(i);
      if(ch>='A'&&ch<='Z'||ch==' ')
        shift++;
    }
    st=st.toLowerCase();
    for(int i=0; i<st.length(); i++){
      char ch=st.charAt(i);
      if(ch==' ') continue;
      else if(ch>='h'&&ch<='p'||ch=='u') right++;
      else left++;
    }
    while(shift!=0){
      if(left>right) right++;
      else left++;
      shift--;
    }
    System.out.println(left+" "+right);
  }
}
