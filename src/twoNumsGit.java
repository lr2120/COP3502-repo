import java.util.Scanner;

public class twoNumsGit
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNum = keyboard.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = keyboard.nextInt();
        System.out.print(firstNum + " - " + secondNum + " = ");
        System.out.println(firstNum - secondNum);
    }
}
