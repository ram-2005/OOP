import java.util.Scanner;

public class program3
{
  public static void main(String[] args)
  {

    Scanner sc = new Scanner(System.in);

    //Getting the first interger
    System.out.println("Enter the First integer");
    int num1 = sc.nextInt();

    //Getting the second integer
    System.out.println("Enter the Second integer");
    int num2 = sc.nextInt();

    //Adding the both integers
    int sum = num1 + num2;

    //Printing the Sum of the two integers
    System.out.println("The sum of "+num1+" and "+num2+" is "+sum);


  }
}
