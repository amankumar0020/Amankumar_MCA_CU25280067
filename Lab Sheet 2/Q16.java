import java.util.Scanner;
public class Q16 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter integer and power (0-30): ");
  int n=sc.nextInt(), power=sc.nextInt();
  if(power<0 || power>30) System.out.println("Invalid power");
  else {
   System.out.println("Multiplied by 2^"+power+" = "+(n<<power));
   System.out.println("Divided by 2^"+power+" = "+(n>>power));
  }
  sc.close();
 }
}
