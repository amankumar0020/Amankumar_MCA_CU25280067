import java.util.Scanner;
public class Q15 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a non-negative integer: ");
  int n=sc.nextInt(), count=0;
  while(n>0) { count+=n&1; n=n>>>1; }
  System.out.println("Number of set bits = "+count);
  sc.close();
 }
}
