import java.util.Scanner;
public class Q1 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter three sides: ");
  double a=sc.nextDouble(), b=sc.nextDouble(), c=sc.nextDouble();
  if(a+b>c && a+c>b && b+c>a) {
   double s=(a+b+c)/2;
   System.out.println("Area = "+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
  } else System.out.println("Invalid triangle");
  sc.close();
 }
}
