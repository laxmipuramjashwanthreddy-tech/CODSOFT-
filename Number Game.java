import java.util.*;

public class NumberGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random ();
		char play;
		
		do {
			System.out.println("1. Easy (1-50)\n2. Medium (1-100)\n3. Hard (1-200)");
			System.out.print("Choose Level: ");
			int level = sc.nextInt();
			
			int max = (level == 1) ? 50 : (level == 2) ? 100 : 200;
			int number = r.nextInt(max) +1;
			int attempts = 5, score = 100;
			boolean win = false;
			
			System.out.println("Guess the number between 1 and " + max);
			
			for (int i = 1 ; i <= attempts; i++)  {
				System.out.print("Attempt" + i + " : ");
				int guess = sc.nextInt();
				if (guess == number) {
					System.out.println("Correct! You Win!");
					System.out.println("Score: " + score);
					win = true;
					break;
				} else if (guess < number) {
					System.out.println("Too High!");
				}
				score -= 20;
			}
			
			if (!win)
			   System.out.println("You Lost! Number was" + number);
			   play = sc.next().charAt(0);
			   
		} while (play == 'Y' || play == 'y');
		 
		  sc.close();
	}
}
			   
	