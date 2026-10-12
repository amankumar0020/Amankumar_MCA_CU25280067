public class Q25 {
 public static void main(String[] args) {
  int[][] marks={{80,75,90},{65,70,85},{90,88,95}};
  int total=0,count=0;
  for(int[] student:marks) for(int mark:student) { total+=mark; count++; }
  System.out.println("Average marks = "+((double)total/count));
 }
}
