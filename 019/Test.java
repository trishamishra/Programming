import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a lowercase letter: ");
        char c = sc.next().charAt(0);

        if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u'))
            System.out.println(c + " is a vowel");
        else
             System.out.println(c + " is a consonant");
    }
}

/*

1)
Enter a lowercase letter: c
c is a consonant

2)
Enter a lowercase letter: e
e is a vowel

 */
