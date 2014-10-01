package com.example.test;

class calc
{
	int Result = 0;
	public calc(String YourName,String PartnerName)
		{
			String PureName = YourName + PartnerName;
		
			

			for(int i = 0;i<PureName.length();i++)
				{
					char alpha = PureName.charAt(i);
					int x=0;
					for(int j=i+1;j<PureName.length();j++)
						{
							if(alpha == PureName.charAt(j))	
							
							x++;
						}
					
						Result = Result + x + 1;		
	
				} 
			while(Result >10)
				{
					int y = Result%10;
						int z = Result/10;
					Result = y+z;
				}
			System.out.println("Your Love result out of 10 is : " + Result);
		}

}
