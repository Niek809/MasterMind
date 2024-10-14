package masterMind;

import java.util.*;

public class master {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int i;

		int computercolor1;
		int computercolor2;
		int computercolor3;
		int computercolor4;

		computercolor1 = 2;
		computercolor2 = 3;
		computercolor3 = 4;
		computercolor4 = 4;
		int pegsInRightPosition = 0;
		int pegsMisplaced;
		int usercolor1;
		int usercolor2;
		int usercolor3;
		int usercolor4;

		System.out.println("Welkom bij mastermind in flowgorithm, ik hoop dat jullie het een leuk spel gaan vinden, succes met oplossen!");
		System.out.println("U heeft 10 pogingen om mijn code te raden, u moet 4 cijfer in typen om te spelen. (kies uit 1t/m6)");
		System.out.println("Zwart betekend dar u het cijfer op de goede plek heeft staan, Wit betekend dat de cijfer goed is maar hij staat niet op de goede plek, en - is dat dat cijfer er niet in zit.");
		for (i = 1; i <= 10; i++) {
			System.out.println("Typ hier je gok: ");
			System.out.println("poging: " + i);
			usercolor1 = input.nextInt();
			usercolor2 = input.nextInt();
			usercolor3 = input.nextInt();
			usercolor4 = input.nextInt();
			pegsInRightPosition = 0;
			pegsMisplaced = 0;
			if (usercolor1 == computercolor1) {
				System.out.print("zwart ");
				pegsInRightPosition = pegsInRightPosition + 1;
			} else {
				if (usercolor1 == computercolor2) {
					System.out.print("wit ");
				} else {
					if (usercolor1 == computercolor3) {
						System.out.print("wit ");
					} else {
						if (usercolor1 == computercolor4) {
							System.out.print("wit ");
						} else {
							System.out.print(" - ");
						}

					}
				}
			}
			if (usercolor2 == computercolor2) {
				System.out.print("zwart ");
				pegsInRightPosition = pegsInRightPosition + 1;
			} else {
				if (usercolor2 == computercolor1) {
					System.out.print("wit ");
				} else {
					if (usercolor2 == computercolor3) {
						System.out.print("wit ");
					} else {
						if (usercolor2 == computercolor4) {
							System.out.print("wit ");
						} else {
							System.out.print(" - ");
						}
					}
				}
			}
			if (usercolor3 == computercolor3) {
				System.out.print("zwart ");
				pegsInRightPosition = pegsInRightPosition + 1;
			} else {
				if (usercolor3 == computercolor2) {
					System.out.print("wit ");
				} else {
					if (usercolor3 == computercolor1) {
						System.out.print("wit ");
					} else {
						if (usercolor3 == computercolor4) {
							System.out.print("wit ");
						} else {
							System.out.print(" - ");
						}
					}
				}
			}
			if (usercolor4 == computercolor4) {
				System.out.println("zwart ");
				pegsInRightPosition = pegsInRightPosition + 1;
			} else {
				if (usercolor4 == computercolor2) {
					System.out.println("wit ");
				} else {
					if (usercolor4 == computercolor3) {
						System.out.println("wit ");
					} else {
						if (usercolor4 == computercolor1) {
							System.out.println("wit ");
						} else {
							System.out.println(" - ");
						}
					}
				}
			}
			if (pegsInRightPosition == 4) {
				i = 11;
			}
		}
		if (pegsInRightPosition == 4) {
			System.out.println("Zo ik ben verbaast, goed gedaan!");
		} else {
			System.out.println("Dat is niet best, volgende keer beter.");
		}
	}
}
