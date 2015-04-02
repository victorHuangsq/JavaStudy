public class SimpleDotCom
{
	int[] locationCells;
	int numOfHits = 0;
	
	public void setLocationCells(int[] locs)
	{
		locationCells = locs;	
	}
	
	public String checkYourself(String stringGuess)
	{
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		/*
		for(int cell : locationCells)
		{
			if(cell == guess)
			{
				result = "hit";
				numOfHits++;
				break;
			}	
		}
		*/
		for(int i=0; i<locationCells.length; i++)
		{
			if(locationCells[i] == guess)
			{
				locationCells[i] = -1;
				result = "hit";
				numOfHits++;
				break;	
			}	
		}
		
		if(numOfHits == locationCells.length)
		{
			result = "kill";
		}
		System.out.println(result);
		
		return result;
	}
}