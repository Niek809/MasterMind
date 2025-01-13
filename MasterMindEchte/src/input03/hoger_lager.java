package input03;

import java.util.Random;
import java.util.Scanner;

public class hoger_lager {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int i;
		int randomgok;

		Random rnd = new Random();
		int randomNumber = rnd.nextInt(100) + 1;

		Scanner sc = new Scanner(System.in);
		for (i = 1; i <= 7; i++) {
			System.out.println("Typ hier je gok: ");

			randomgok = input.nextInt();

			if (randomgok > randomNumber) {
				System.out.print("Te hoog\n");
			} else if (randomgok < randomNumber) {
				System.out.print("Te laag\n");
			}else {
				System.out.print("Precies goed\n");
				i = 7;
			}
		}

	}
}
