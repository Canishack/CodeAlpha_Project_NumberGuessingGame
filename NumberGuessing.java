import java.util.*;
public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*********Welcome to Number Guessing Game By Cani*********");
        System.out.println("*******You have to guess the number between 1-100 in 5 tries*******");
        System.out.println();
        int num = 1 + (int) (100 * Math.random());
        int k = 5;
        int flag = -1;
        while (k > 0) {
            System.out.print("Guess a number: ");
            int guess = sc.nextInt();
            if (guess == num) {
                System.out.println("Hurray!! You guessed it correct ");
                flag = 1;
                break;
            }
            if (guess < num) {
                System.out.println("Original number is HIGHER than Guessed number " + guess + " !!");
                System.out.println();

            }
            if (guess > num) {
                System.out.println("Original number is LOWER than Guessed number " + guess + " !!");
                System.out.println();
            }
            k--;
        }
        if (flag == 1)
            System.out.println("You Won!!");
        else
            System.out.println("You Lost!!\nThe number was: " + num);
    }
}
