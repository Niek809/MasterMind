package exercises;

import java.util.Scanner;

public class exercisesOpdrachtenAf extends execises {
	
	private static final double EARTH_RADIUS = 0;

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
//
//	32
//	33
//	36
//	37
//	38
//
//	39
//	42
//	43
//	50
//	69
	 
// opdracht 32
//	        System.out.print("eerste cijfer: ");
//	        int eersteNumber = scanner.nextInt();
//
//	        System.out.print("tweede cijfer: ");
//	        int tweedeNumber = scanner.nextInt();
//
//	        
//	        if (eersteNumber != tweedeNumber) {
//	            System.out.println(eersteNumber + " != " + tweedeNumber);
//	        if (eersteNumber <= tweedeNumber) {
//	            System.out.println(eersteNumber + " < " + tweedeNumber);
//	            System.out.println(eersteNumber + " <= " + tweedeNumber);
//	        } 
//	        if (eersteNumber >= tweedeNumber){
//	            System.out.println(eersteNumber + " > " + tweedeNumber);
//	            System.out.println(eersteNumber + " >= " + tweedeNumber);
//	        }
//	        }
//	        else  {
//	            System.out.println(eersteNumber + " == " + tweedeNumber);
//	            
//	        }
//
//	        opdracht 33
//        
//        
//		System.out.print("Enter an integer: ");
//		String nummer = sc.nextLine();
//		String[] split = nummer.split("");
//		int nummer1 = Integer.valueOf(split[0]);
//		int nummer2 = Integer.valueOf(split[1]);
//		System.out.println(nummer1 + nummer2);
//	        
//        opdracht 36
//
//        final double EARTH_RADIUS = 6371.01;
//        
//        System.out.print("Input the latitude of coordinate 1: ");
//        double x1 = Math.toRadians(scanner.nextDouble());
//
//        System.out.print("Input the longitude of coordinate 1: ");
//        double y1 = Math.toRadians(scanner.nextDouble());
//
//        System.out.print("Input the latitude of coordinate 2: ");
//        double x2 = Math.toRadians(scanner.nextDouble());
//
//        System.out.print("Input the longitude of coordinate 2: ");
//        double y2 = Math.toRadians(scanner.nextDouble());
//
//        double distance = EARTH_RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) +
//                           Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
//
//        System.out.printf("The distance between the two points is: %.2f km%n", distance);
//
//        
//        
// opdracht 37
//         
//        System.out.print("Input a string: ");
//        String input = scanner.nextLine();
//
//        String reversed = new StringBuilder(input).reverse().toString();
//
//        System.out.println("Reversed string: " + reversed);
//	        
//		 opdracht 38
//        
//        System.out.println("Typ hier je tekst:");
//        String input = sc.nextLine();
//
//        int letter = 0;
//        int spatie = 0;
//        int nummer = 0;
//        int anderefiguurtjes = 0;
//
//        for (int i = 0; i < input.length(); i++) {
//            char ch = input.charAt(i);
//
//            if (Character.isLetter(ch)) {
//            	letter++;
//            } else if (Character.isDigit(ch)) {
//                nummer++;
//            } else if (Character.isWhitespace(ch)) {
//            	spatie++;
//            } else {
//            	anderefiguurtjes++;
//            }
//        }
//
//        System.out.println("Letters: " + letter);
//        System.out.println("Spaties: " + spatie);
//        System.out.println("Nummers: " + nummer);
//        System.out.println("Andere figuurtjes: " + anderefiguurtjes);
//  
//        opdracht 39
//        
//        int count = 0;
//
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= 4; j++) {
//                for (int k = 1; k <= 4; k++) {
//                    if (i != j && i != k && j != k) {
//                        System.out.println(i * 100 + j * 10 + k);
//                        count++;
//                    }
//                }
//            }
//        }
//
//        System.out.println("Total number of the three-digit-number is " + count);
//      
//       opdracht 42
//        
//        System.out.print("Input your Password: ");
//        String password = scanner.nextLine();
//
//        System.out.println("Your password was: " + password);
//        
//        opdracht 43
//        
//        System.out.println("Twinkle, twinkle, little star,");
//        System.out.println("    How I wonder what you are!");
//        System.out.println("        Up above the world so high,");
//        System.out.println("        Like a diamond in the sky.");
//        System.out.println("Twinkle, twinkle, little star,");
//        System.out.println("    How I wonder what you are");
//        
//        opdracht 50
//
//        System.out.println("Divided by 3:");
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 != 0) {
//                System.out.print(i + ", ");
//            }
//        }
//
//        System.out.println("\nDivided by 5:");
//        for (int i = 1; i <= 100; i++) {
//            if (i % 5 == 0 && i % 3 != 0) {
//                System.out.print(i + ", ");
//            }
//        }
//
//        System.out.println("\nDivided by 3 & 5:");
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.print(i + ", ");
//            
//                
//            }
//        }
//        
//        opdracht 69
//
//        System.out.print("Input a string of even length: ");
//        String input = scanner.nextLine();
//
//        if (input.length() % 2 == 0) {
//            System.out.println("First half: " + input.substring(0, input.length() / 2));
//        } else {
//            System.out.println("The input string length is not even.");
//        }
//        
	        scanner.close();
	    }
}
