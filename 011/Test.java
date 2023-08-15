import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        char input_character;
        System.out.print("Enter a character: ");
        input_character = sc.next().charAt(0);

        System.out.println("Your character is " + input_character);
    }
}


/*
Enter a character: a
Your character is a
*/


