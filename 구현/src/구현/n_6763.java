package ±¸Çö;

import java.util.*;

public class n_6763 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt(), speed=sc.nextInt();
		if(limit>=speed) System.out.println("Congratulations, you are within the speed limit!");
		else{
			if(speed-limit<=20) System.out.println("You are speeding and your fine is $100.");
			else if(speed-limit<=30) System.out.println("You are speeding and your fine is $270.");
			else System.out.println("You are speeding and your fine is $500.");
		}
	}
}

