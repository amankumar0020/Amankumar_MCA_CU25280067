public class Q19 {
 public static void main(String[] args) {
  for(int n=1;n<=1000;n++) {
   int temp=n, digits=String.valueOf(n).length(), sum=0;
   while(temp>0) { int digit=temp%10; sum+=(int)Math.pow(digit,digits); temp/=10; }
   if(sum==n) System.out.print(n+" ");
  }
 }
}
