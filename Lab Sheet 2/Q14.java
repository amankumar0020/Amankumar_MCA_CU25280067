import java.util.Scanner;
public class Q14 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter two integers: ");
  int a=sc.nextInt(), b=sc.nextInt();
  a^=b; b^=a; a^=b;
  System.out.println("After swapping: a = "+a+", b = "+b);
  sc.close();
 }
}
