import java.util.Scanner;
public class Q22 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter an integer: "); int n=sc.nextInt();
  long temp=Math.abs((long)n), reverse=0;
  while(temp>0) { long digit=temp%10; reverse=reverse*10+digit; temp/=10; }
  if(n<0) reverse=-reverse;
  System.out.println("Reversed number = "+reverse); sc.close();
 }
}
