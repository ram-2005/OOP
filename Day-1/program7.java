import java.util.Scanner;

public class program7
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    //Getting the string value from the user
    System.out.println("Enter the String :");
    String str = sc.nextLine();

    //Checking if the input is less than 2 chars
    if(str.length() == 1)
    {
      System.out.println("There is only one letter in the string");
      return;
    }

    //using indexing to get the first and second char
    char ch1 = str.charAt(0);
    char ch2 = str.charAt(1);


    //Comparing the both characters
    if(ch1 < ch2)
    {
      System.out.println(ch1+" , "+ch2);
    } else if (ch2 < ch1) {
      System.out.println(ch2+" , "+ch1);
    } else {
      System.out.println("Both characters are same");
    }
  }
}
