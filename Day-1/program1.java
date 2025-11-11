import java.util.Scanner;

public class program1
{
  public static void main(String[] args)
  {

    Scanner sc = new Scanner(System.in);

    //getting the name of the company
    System.out.println("Enter the company name: ");
    String company = sc.nextLine();

    //getting the location of the company
    System.out.println("Enter the location: ");
    String location = sc.nextLine();

    //Checking if the entries are not empty
    if(company != "" && location != "")
    {
      //printing the ouput if teh entries are not empty
      System.out.println(company+" Tecnologies "+location);

    }else{
      //printing that some entry is empty
      System.out.println("One of the entry is empty");
    }

  }
}
