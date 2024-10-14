package masterMind;

import java.util.Scanner;

public class hhaha
{
 
	public static void main(String[] args)
	{
		
		System.out.println("Maak een code met de beschikbare kleuren. rood, geel, groen, blauw, lavendel");
		Scanner CodeKleur = new Scanner(System.in);
		
		
		  String code_1 = CodeKleur.next();  
		  String code_2 = CodeKleur.next();   
		  String code_3 = CodeKleur.next();
		  String code_4 = CodeKleur.next();
		  
			System.out.println("De code:");
			
			
			System.out.println(code_1+" "+code_2+" "+code_3+" "+code_4);
			
			 System.out.println(" ");
			
		  
		 
	  int rij = 1;            
	  System.out.println("beurt "+rij);
	  System.out.println(" ");
	  

	
	  System.out.println("Raad de code:");
	  System.out.println("kies uit rood, geel, groen, blauw, lavendel");
	  
	  String AntCode_1=CodeKleur.next(); 
	  String AntCode_2=CodeKleur.next();
	  String AntCode_3=CodeKleur.next();
	  String AntCode_4=CodeKleur.next();
	  
		System.out.println("Gokje: "+AntCode_1+" "+AntCode_2+" "+AntCode_3+" "+AntCode_4);
		
		System.out.println("");
 
	 
	   
	  System.out.println("Hint:");
	  System.out.println("Kies uit: zwart, wit");
	  System.out.println(""); 
		
	  String hintPositie_1 =CodeKleur.next();
	  String hintPositie_2 =CodeKleur.next();
	  String hintPositie_3 =CodeKleur.next();
	  String hintPositie_4 =CodeKleur.next();
	  
		System.out.println("Hint: "+hintPositie_1+" "+hintPositie_2+" "+hintPositie_3+" "+hintPositie_4);
	
 
 
	}
}

}
