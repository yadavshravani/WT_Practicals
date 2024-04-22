import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args) {
        //Initialization of variables
        int T1 = 0;
        int T2 = 1;
        int n = 0;
        //Starting of do while loop
        do {
            System.out.println("Fibonacci Series:");
            System.out.println("Enter a Number:");
            Scanner sc = new Scanner(System.in);

            //Try catch block for exception handling
            try {
                n = sc.nextInt();
                for (int i = 1; i <= n; ++i) {
                    System.out.print(T1 + ", ");
                    int Tn = T1 + T2;
                    T1 = T2;
                    T2 = Tn;
                }
            } catch (Exception exception) {
                System.out.println("Exception is" + exception);
            }
        } while (n <=100);
    }
}
