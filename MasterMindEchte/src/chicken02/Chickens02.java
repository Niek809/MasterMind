package chicken02;

import java.util.Scanner;

public class Chickens02 {
	public static void main(String[] args) {
		// Put yout code here

		Scanner sc = new Scanner(System.in);

		int day1 = 100;
		int day2 = 121;
		int day3 = 117;
		double dailyAverage = (day1 + day2 + day3) / 3.0;
		System.out.println("Gemiddelde " + dailyAverage);

		double monthlyAverage = dailyAverage *= 30;
		System.out.println("Monthly Average: " + monthlyAverage);

		double monthlyProfit = monthlyAverage *= 0.18;
		System.out.println("Monthly Profit:  $" + monthlyProfit);

		sc.close();
	}

}
