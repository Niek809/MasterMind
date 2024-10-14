
package chickens01;

public class Chickens01 {
    public static void main(String[] args) {
    
    	int eggsPerChicken = 5;
		int chickenCount =3;
		int totalEggs = eggsPerChicken*chickenCount;
		System.out.println(totalEggs);
		
		chickenCount++;
		totalEggs = eggsPerChicken*chickenCount;
		System.out.println(totalEggs);
		
		chickenCount /= 2;
		totalEggs = eggsPerChicken*chickenCount;
		System.out.println(totalEggs);
		
		
		
		
		
		int eggsPerChicken1 = 5;
		int chickenCount1 =8;
		int totalEggs1 = eggsPerChicken1*chickenCount1;
		System.out.println(totalEggs1);
		
		chickenCount1++;
		totalEggs1 = eggsPerChicken1*chickenCount1;
		System.out.println(totalEggs1);
		
		chickenCount1 /= 2;
		totalEggs1 = eggsPerChicken1*chickenCount1;
		System.out.println(totalEggs1);
    }   
}
