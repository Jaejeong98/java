package ±¸Çö2;

import java.util.*;

public class n_6778 {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n1=sc.nextInt(), n2=sc.nextInt();
       if(n1>=3&&n2<=4) System.out.println("TroyMartian");
       if(n1<=6&&n2>=2) System.out.println("VladSaturnian");
       if(n1<=2&&n2<=3) System.out.println("GraemeMercurian");
    }
}