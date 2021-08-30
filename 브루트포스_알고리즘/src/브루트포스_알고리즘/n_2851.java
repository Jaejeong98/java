package 브루트포스_알고리즘;

import java.util.Scanner;

public class n_2851 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int arr[]=new int[10];
      arr[0]=sc.nextInt();
      int min=(int)Math.abs(arr[0]-100), num=0;
      for(int i=1; i<10; i++){
        arr[i]=sc.nextInt()+arr[i-1];
        if((int)Math.abs(arr[i]-100)<=min){
          min=(int)Math.abs(arr[i]-100);
          num=i;
          if(min==0)break;
        }
      }
      System.out.println(arr[num]);
    }
}