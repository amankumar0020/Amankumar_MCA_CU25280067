import java.util.Scanner;
public class Q12 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter four numbers: ");
  int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();
  int minAB=(a<b)?a:b, minCD=(c<d)?c:d;
  int smallest=(minAB<minCD)?minAB:minCD;
  System.out.println("Smallest = "+smallest);
  sc.close();
 }
}
