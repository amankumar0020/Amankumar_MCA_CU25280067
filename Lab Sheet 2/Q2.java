import java.util.Scanner;
public class Q2 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter principal, annual rate (%), and time (years): ");
  double p=sc.nextDouble(), r=sc.nextDouble(), t=sc.nextDouble();
  double amount=p*Math.pow(1+r/100,t);
  System.out.println("Amount = "+amount);
  System.out.println("Compound Interest = "+(amount-p));
  sc.close();
 }
}
