import java.util.Scanner;
public class Q6 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a positive number: ");
  double n=sc.nextDouble(); int steps=0;
  while(n>=1) { n/=2; steps++; }
  System.out.println("Steps = "+steps);
  System.out.println("Final value = "+n);
  sc.close();
 }
}
