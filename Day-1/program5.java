import java.util.Scanner;

public class program5
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    //Getting the number from the user
    System.out.println("Enter the number to be checked");
    int num = sc.nextInt();

    //Checking if its Odd or Even
    if(num % 2 == 0)
    {
      System.out.println(num+" is Even number");
    } else {
      System.out.println(num+" is Odd number");
    }

  }
}
