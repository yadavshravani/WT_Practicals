
import java.util.*;
public class Calculator
{
    public static void main(String[] args)
    {
        System.out.println("Basic Calculator:");
        System.out.println("Enter 1st Number:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number:");
        Scanner sc1 = new Scanner(System.in);
        int num2 = sc1.nextInt();
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;

        System.out.println("Addition of the two number is:"+sum);
        System.out.println("Substraction of the two number is:"+sub);
        System.out.println("Multiplication of the two number is:"+mul);
        System.out.println("Division of the two number is:"+div);
    }
}
