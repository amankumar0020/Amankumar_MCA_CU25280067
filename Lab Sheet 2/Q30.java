import java.util.Scanner;
public class Q30 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a positive integer: "); int n=sc.nextInt();
  int temp=n;
  if(temp>0) while(temp%4==0) temp=temp>>2;
  System.out.println(n>0 && temp==1?"Power of 4":"Not a power of 4");
  System.out.println("After toggling third bit: "+(n^(1<<2)));
  for(int i=1;i<=10;i++) {
   int product=n*i;
   if(product%48==0) break;
   if(product%6==0) continue;
   System.out.println(n+" x "+i+" = "+product);
  }
  sc.close();
 }
}
