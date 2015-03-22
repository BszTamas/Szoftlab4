import java.io.BufferedReader;
import java.io.InputStreamReader;

import Setup.UseCases;

public class Main {

  public static void main(String[] args) {
	//Men�pontok ki�r�sa
	System.out.println("V�lassz az al�bbi men�pontok kz�l, a megfelel� use-case lej�tsz�s�hoz!\n"
					+ "1. J�t�k ind�t�sa \n"
					+ "2. Gyors�t�s, lass�t�s \n"
					+ "3. Item lerak�sa \n"
					+ "4. Olaj lerak�sa \n"
					+ "5. Ragacs lerak�sa \n"
					+ "6. Lyukra ugr�s \n"
					+ "7. Olajra l�p�s \n"
					+ "8. Ragacsra l�p�s \n"
					+ "9. J�t�k l�ptet�se \n"
					+ "10. J�t�k v�ge \n\n"
					+ "Nyomj null�t a kil�p�shez!");
	int place;
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	try {
		String temp;
		boolean going = true;
		//Ciklus a men�h�z
		while (going){
		temp = reader.readLine();
		place = Integer.parseInt(temp);
		switch(place){
			case 1: System.out.println("- 1. J�t�k ind�t�sa");
					UseCases.startGame();
					break;
					
			case 2:	System.out.println("- 2. Gyors�t�s, lass�t�s");
					System.out.println("? Melyik ir�nyba akarsz gyors�tani?	E/H");
					temp = reader.readLine();
					if (temp.equals("E"))	UseCases.accelerateOrDecelerate(true);
					else UseCases.accelerateOrDecelerate(false);
					break;
					
			case 3:	System.out.println("- 3. Item lerak�sa");
					UseCases.placeItems(true);
					break;
					
			case 4:	System.out.println("- 4. Olaj lerak�sa");
					UseCases.placeOil();
					break;
					
			case 5:	System.out.println("- 5. Ragacs lerak�sa");
					UseCases.placeTacky();
					break;
					
			case 6:	System.out.println("- 6. Lyukra ugr�s");
					UseCases.holeInteract();
					break;
					
			case 7:	System.out.println("- 7. Olajra l�p�s");
					UseCases.oilInteract();
					break;
					
			case 8:	System.out.println("- 8. Ragacsra l�p�s");
					UseCases.tackyInteract();
					break;
					
			case 9:	System.out.println("- 9. J�t�k l�ptet�se");
					UseCases.stepGame();
					break;
					
			case 10: System.out.println("- 10. J�t�k v�ge");
					 System.out.println("? Lej�rt az id�, vagy mindenki kiesett?	L/K");
					 temp = reader.readLine();
					 if (temp.equals("L"))	UseCases.endGame(false);
					 else UseCases.endGame(true);
					 break;
					 
			case 0: going = false;
					break;
					
			default: System.out.println("�rv�nytelen parancs!");
				
		}
	}
	} catch (Exception e) {
		System.out.println("Hib�s beolvas�s! A program kil�p.");
	}
  }

}
