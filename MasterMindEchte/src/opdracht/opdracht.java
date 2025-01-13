package opdracht;

import java.util.Scanner;

public class opdracht {
        
        public static void main(String[] args)
        
        {
        	Scanner sc = new Scanner(System.in);
        	double percentage = sc.nextDouble();
            int x = (int) Math.round(percentage * 10);
            int o = 10 - x;
            String antwoord = ("x".repeat(x) + ("o".repeat(o)));
            System.out.println(antwoord);
            
            sc.close();
        }

        	
        	
        }
	


