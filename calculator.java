import java.util.Scanner;

public class Calculator1
{
    public static void main(String[] args)
    {
        System.out.println("Basic Calculator");
        System.out.println("Enter First Number:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number:");
        Scanner sc1 = new Scanner(System.in);
        int num2 = sc1.nextInt();
        System.out.println("Enter the Operator:+-*/");
        char input = sc.next().charAt(0);
        int result =0;
        switch (input)
        {
            case '+':
                result=num1+num2;
                break;

            case '-':
                result=num1-num2;
                break;

            case '*':
                result=num1*num2;
                break;

            case '/':
                result=num1/num2;
                break;

            default:
                System.out.println("Please Enter valid input");
        }
        System.out.println("The result is:"+result);
    }


}
