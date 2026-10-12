import java.util.Scanner;
public class Q13 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a character: ");
  char ch=sc.next().charAt(0), lower=Character.toLowerCase(ch);
  String result=(ch>='0' && ch<='9')?"Digit":
   ((lower>='a' && lower<='z')?("aeiou".indexOf(lower)>=0?"Vowel":"Consonant"):"Special symbol");
  System.out.println(result); sc.close();
 }
}
