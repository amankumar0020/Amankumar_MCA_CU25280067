import java.util.Scanner;
public class Q3 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter x1 y1 x2 y2: ");
  double x1=sc.nextDouble(), y1=sc.nextDouble(), x2=sc.nextDouble(), y2=sc.nextDouble();
  System.out.println("Distance = "+Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
  sc.close();
 }
}
