import java.util.*;

public class WeightConverter
	{
		static Scanner userInput;
		static String[] units = {"Pounds", "Kilograms", "Ounces", "Stones(UK)", "Metric Tons", "Pennyweights", "Grains", "Tons", "Hundredweights", "Grams", "Carots", "Milligrams", "Micrograms", "Long Tons(UK)", "Short Tons(US)"};    
		
		public static void main(String[] args)
		{
			userInput = new Scanner(System.in);
			greeting();
			
			
		}

		private static void greeting()
			{
				System.out.println("Welcome to the weight converter. "
						+ "\nWhat units are you starting from?");
				int i = 1;
				for(String s: units)
					{
						System.out.println("[" + i +"] " + s);
						i++;
					}
				int startingUnit = userInput.nextInt();
				if(startingUnit == 1)
					{
						
					}
				else if(startingUnit == 2)
					{
						
					}
				else if(startingUnit == 3)
					{
						
					}
				else if(startingUnit == 4)
					{
						
					}
				else if(startingUnit == 5)
					{
						
					}
				else if(startingUnit == 6)
					{
						
					}
				else if(startingUnit == 7)
					{
						
					}
				else if(startingUnit == 8)
					{
						
					}
				else if(startingUnit == 9)
					{
						
					}
				else if(startingUnit == 10)
					{
						
					}
				else if(startingUnit == 11)
					{
						
					}
				else if(startingUnit == 12)
					{
						
					}
				else if(startingUnit == 13)
					{
						
					}
				else if(startingUnit == 14)
					{
						
					}
				else if(startingUnit == 15)
					{
						
					}
				
//				lbs();
//				kg();
//				oz();
//				st();
//				metTon();
//				penny();
//				gr();
//				t();
//				hunWei();
//				g();
//				K();
//				mg();
//				microG();
//				longTonUK();
//				shortTonUS();
				
			}
		
		
	}
