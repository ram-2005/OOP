import java.util.Scanner;

public class program8
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    //getting the single character from the user
    System.out.println("Enter the character : ");
    char ch = sc.next().charAt(0);

    //Checking the nature of the character
    if(Character.isLetter(ch))
    {
      System.out.println(ch+" is a Alphabet");
    }else if(Character.isDigit(ch)){
      System.out.println(ch+" is a Digit");
    }else{
      System.out.println(ch+" is a Special Character");
    }
  }
}
