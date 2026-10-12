import java.util.Scanner;
public class Q23 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter an integer: "); int n=sc.nextInt();
  if(n<0) System.out.println("Not a palindrome");
  else {
   int original=n, reverse=0;
   while(n>0) { int digit=n%10; reverse=reverse*10+digit; n/=10; }
   System.out.println(original==reverse?"Palindrome":"Not a palindrome");
  }
  sc.close();
 }
}
