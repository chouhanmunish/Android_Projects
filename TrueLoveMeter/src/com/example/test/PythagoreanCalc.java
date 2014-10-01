package com.example.test;

class Pythagoreancalc
{
	private int Your = 0;
	private int Acsii=0;
	private int Partner =0;
	String Status = "Normal";
	 
	public Pythagoreancalc(String YourName,String PartnerName)
		{
			Your = findPythagoreanValue(YourName);
			Partner = findPythagoreanValue(PartnerName);	
			
			Compatibility c = new Compatibility(Your,Partner);			
			Status = c.showCompatibility();

		}
	int findPythagoreanValue(String Name)
		{	
			int Result =0;
		
			for(int i = 0;i<Name.length();i++)
				{
					char alpha = Name.charAt(i);
					Acsii = alpha;
					int x= Acsii-96;
					while(x>9)
						x-=9;
					Result+=x;
				} 
			while(Result >9)
				{
					int y = Result%10;
						int z = Result/10;
					Result = y+z;
				}
			System.out.println(Result);
			return Result;
		}

}
