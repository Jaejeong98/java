package 임의_정밀도_큰_수_연산;

import java.io.*;
import java.math.*;

public class n_22193{
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String st=br.readLine();
    BigInteger n1=new BigInteger(br.readLine()), n2=new BigInteger(br.readLine());
    System.out.println(n1.multiply(n2));
  }
}