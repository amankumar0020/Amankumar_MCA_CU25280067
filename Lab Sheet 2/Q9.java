import java.util.Scanner;
public class Q9 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter first string: "); String a=sc.nextLine();
  System.out.print("Enter second string: "); String b=sc.nextLine();
  int i=0, limit=Math.min(a.length(),b.length());
  while(i<limit && a.charAt(i)==b.charAt(i)) i++;
  if(i==limit) {
   if(a.length()==b.length()) System.out.println("Strings are equal");
   else if(a.length()<b.length()) System.out.println("First string comes before second");
   else System.out.println("First string comes after second");
  } else if(a.charAt(i)<b.charAt(i)) System.out.println("First string comes before second");
  else System.out.println("First string comes after second");
  sc.close();
 }
}
