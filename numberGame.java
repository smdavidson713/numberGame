import java.util.Scanner;
import java.util.Random; 
import java.lang.Math;

public class numberGame{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int guess = 0; 
		int difference;
		String answer;
		

	do{
		int num = rand.nextInt(10) + 1;
		System.out.println("I am thinking of a number between 1 and 10 including both." 
			                + " Guess what it is!");

		System.out.println("To guess what it is, type in a number: ");
		guess = keyboard.nextInt();
		difference = Math.abs(num - guess);

		if(guess == num){
			System.out.println("Congradulations! You guessed it!");
		}
		else if (guess != num){
			System.out.println("So, your guess was " + guess);
			System.out.println("You were off by " + difference);
			System.out.println("The number I was thinking of was " + num);
		}
		System.out.print("Do you want to play again? (Y/N)");
		answer = keyboard.next();
	}while(answer.equals("Y"));

	}
}