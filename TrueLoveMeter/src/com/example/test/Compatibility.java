package com.example.test;

class Compatibility
{
	private int Your;
	private int Partner; 

	public Compatibility(int Your,int Partner)
		{
			this.Your = Your;
			this.Partner = Partner;	
		}

	public String showCompatibility()

		{
			if(Your == 1 && Partner == 1)
				return "Share a lot in common,<br> Ego clashes possible";
			else if((Your ==2 && Partner == 1)||(Your ==2 && Partner == 4)||(Your ==3 && Partner == 6)||(Your ==4 && Partner == 2)||(Your ==6 && Partner == 1)||(Your ==6 && Partner == 3))
				return "Compatible";
			else if(Your == 3 && Partner == 1)
				return "Excitingly Compatible";
			else if((Your ==4 && Partner == 1)||(Your ==1 && Partner == 4)||(Your ==2 && Partner == 9)||(Your ==3 && Partner == 4)||(Your ==4 && Partner == 3)||(Your ==4 && Partner == 5)
				||(Your ==5 && Partner == 4)||(Your ==5 && Partner == 6)||(Your ==6 && Partner == 5)||(Your ==7 && Partner == 3)||(Your ==3 && Partner == 7)||(Your ==7 && Partner == 3)||(Your ==7 && Partner == 7)
				||(Your ==9 && Partner == 2))
				return "Incompatible";
			else if((Your == 5 && Partner == 1)||(Your == 1 && Partner == 5))
				return "Vibrant, Jealousy Possible";
			else if((Your == 7 && Partner == 1)||(Your == 1 && Partner == 7))
				return "Platonic; great friendship";
			else if((Your == 8 && Partner == 1)||(Your == 1 && Partner == 8))
				return "Materialistic combination; compatible";
			else if((Your == 9 && Partner == 1)||(Your == 1 && Partner == 9))
				return "Volatile, incompatible";
			else if((Your == 1 && Partner == 2))
				return "Good partnership";
			else if((Your == 2 && Partner == 2))
				return "Too much in common, neutral";
			else if((Your == 3 && Partner == 2)||(Your == 2 && Partner == 3))
				return "Impatience; incompatible";
			else if((Your == 5 && Partner == 2)||(Your == 2 && Partner == 5))
				return "Opposite attraction; compatible";
			else if((Your == 6 && Partner == 2)||(Your == 2 && Partner == 6))
				return "Jealousy and possessiveness<br> possible, compatible";
			else if((Your ==7 && Partner == 2)||(Your ==2 && Partner == 7)||(Your ==1 && Partner == 6)||(Your ==4 && Partner == 4)||(Your ==6 && Partner == 6)||(Your ==6 && Partner == 8)||(Your ==8 && Partner == 4)||(Your ==4 && Partner == 8))
				return "Very Compatible";
			else if((Your == 8 && Partner == 2)||(Your == 2 && Partner == 8))
				return "Most compatible";
			else if(Your == 1 && Partner == 3)
				return "Very Stimulating";
			else if(Your == 3 && Partner == 3)
				return "Comfortable";
			else if((Your ==5 && Partner == 3)||(Your ==3 && Partner == 5)||(Your ==3 && Partner == 8)||(Your ==8 && Partner == 3))
				return "Short-term compatibility";
			else if((Your == 9 && Partner == 3)||(Your == 3 && Partner == 9))
				return "Competitive but <br>compatible";
			else if((Your ==6 && Partner == 4)||(Your ==4 && Partner == 6)||(Your ==5 && Partner == 8)||(Your ==8 && Partner == 5)||(Your ==9 && Partner == 9))
				return "Ideal compatibility";
			else if((Your == 7 && Partner == 4)||(Your == 4 && Partner == 7))
				return "Cold incompatible";
			else if(Your == 5 && Partner == 5)
				return "Adventurous, compatible";
			else if((Your == 7 && Partner == 5)||(Your == 5 && Partner == 7))
				return "Creative compatibility";
			else if((Your == 7 && Partner == 6)||(Your == 6 && Partner == 7))
				return "Difficult";
			else if(Your == 8 && Partner == 6)
				return "Extremely compatible";
			else if((Your == 9 && Partner == 6)||(Your == 6 && Partner == 9))
				return "Friendly; compatible";
			else if((Your == 8 && Partner == 7)||(Your == 7 && Partner == 8))
				return "Compatible for business,<br> not relationships";
			else if((Your == 9 && Partner == 7)||(Your == 7 && Partner == 9))
				return "Soulmates";
			else if(Your == 8 && Partner == 8)
				return "Excellent compatibility";
			else if((Your == 9 && Partner == 8)||(Your == 8 && Partner == 9))
				return "Better friends than<br> spouses or partners";
			else if((Your == 4 && Partner == 9)||(Your ==9 && Partner == 4))
				return "Very incompatible";
			else if((Your == 5 && Partner == 9)||(Your ==9 && Partner == 5))
				return "Great friends, <br>lousy partners or spouses";
			else
				return "Good luck";
			
			
		}
}