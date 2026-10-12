import java.util.Scanner;
public class Q17 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter an integer: "); int n=sc.nextInt();
  System.out.println("After left rotation by 2 bits: "+((n<<2)|(n>>>30)));
  sc.close();
 }
}
