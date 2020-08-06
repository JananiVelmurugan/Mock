import java.util.Scanner;
public class InterestCalculation{
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter p");
  int p=scanner.nextInt();
  System.out.println("Enter n");
  int n=scanner.nextInt();
  System.out.println("Enter r");
  int r=scanner.nextInt();
  InterestCalculation calculation = new InterestCalculation();
  calculation.calculateInt(p,n,r);
 }
 private void calculateInt(int p,int n,int r){
  int interest = ( p * n * r ) / 100;
  System.out.println("Interest is " + interest);
 }
}

