package 임의_정밀도_큰_수_연산;

import java.math.BigDecimal;
import java.util.*;

public class n_10827 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BigDecimal a=sc.nextBigDecimal();
		int b=sc.nextInt();
		System.out.println(a.pow(b).toPlainString());
	}
}
