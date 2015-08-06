import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 100, bet;
		
		while (money > 0 && money < 500) {
			System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
			System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
			System.out.println("He lays down three cards.");
			System.out.println();
			System.out.print("You have $" + money + ". How much do you want to bet? ");
			
			bet = sc.nextInt();
			while (bet > money) {
				System.out.print("You don't have that much. Please bet another amount. ");
				bet = sc.nextInt();
			}
			money -= bet;
			
			System.out.println();
			System.out.println("Which one is the ace?");
			System.out.println();
			System.out.println("	##  ##  ##");
			System.out.println("	1   2   3 ");
			System.out.println();
			System.out.print("> ");
			
			Random r = new Random();
			int answer = 1 + r.nextInt(3);
			
			int guess = sc.nextInt();
			while (guess != 1 && guess != 2 && guess != 3) {
				System.out.print("Invalid number. Try again. ");
				guess = sc.nextInt();
			}
			
			System.out.println();
			
			if (guess == answer) {
				System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
				money += bet * 2;
			} else {
				System.out.println("Ha! Fast Eddie wins again! The ace was card number " + answer + ".");
			}
			System.out.println();
			if (answer == 1) {
				System.out.println("	AA  ##  ##");
			} else if (answer == 2) {
				System.out.println("	##  AA  ##");
			} else {
				System.out.println("	##  ##  AA");
			}
			System.out.println("	1   2   3 ");
			System.out.println();
		}
		if (money == 0) {
			System.out.print("You lose. ");
		} else {
			System.out.print("You win. ");
		}
		System.out.println("Thank you for playing the game.");
	}
	
}
