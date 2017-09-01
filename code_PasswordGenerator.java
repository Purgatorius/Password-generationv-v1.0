import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("It is a program to generate a password from a-z. Give me lenght of password you would like to have: ");
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int r;
        for (int i = 0; i < a; i++)
        {
            r = random.nextInt(26) + 97;
            stringBuilder.append((char)r);
        }
        System.out.println("Your password is: ");
        System.out.println(stringBuilder.toString());
    }
}
