import java.util.Scanner;


public class Simple_Intrest_Calculator
{
  public static void main(String[] args){
   
  Scanner Sc = new Scanner(System.in);

  System.out.println("Enter the Principle amount");
  int p = Sc.nextInt();

  System.out.println("Enter the rate of intrest");
  float r = Sc.nextFloat();

  System.out.println("Enter No of years");
  int n = Sc.nextInt();

  System.out.println("THE pnr value is "+(p*n*r));
  }
}
