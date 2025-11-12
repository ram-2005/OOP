import java.util.Scanner;

public class program4
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    //getting the number from the user
    System.out.println("Enter a number :");
    int num = sc.nextInt();
    
    //if num is greater than 0 then its postive
    if(num > 0)
    {
      System.out.println("The entered number is positive");
    } else if(num < 0) { //if num is lesser than 0 then negative
      System.out.println("The entered number is negative");
    } else { //if the num is equal to 0 then its O(ferrai meme reference)
      System.out.println("The entered number is Zero");
    }

    sc.close();
  }
}
