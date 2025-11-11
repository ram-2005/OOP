import java.util.Scanner;

public class program2
{
  public static void main(String[] args)
  {

    Scanner sc = new Scanner(System.in);

    //Getting the name from the user
    System.out.println("Enter the name: ");
    String name = sc.next();

    //printing the name with welcome message
    System.out.println("Welcome "+name);
  }
}
