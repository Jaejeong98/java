package �����;
import java.util.Scanner;

public class number_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("N(1~100)");
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		scanner.close();

	}

}
