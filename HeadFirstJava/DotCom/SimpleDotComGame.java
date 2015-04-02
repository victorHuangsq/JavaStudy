public class SimpleDotComGame
{
	public static void main(String[] args)
	{
		int numOfGuess = 0;
		GameHelper helper = new GameHelper();
		SimpleDotCom dot = new SimpleDotCom();
		int random = (int)(Math.random() * 5);
		int[] loc = {random, random+1, random+2};
		dot.setLocationCells(loc);
		
		boolean isAlive = true;
		while(isAlive)
		{
			String guess = helper.getUserInput("Enter a number");
			String result = dot.checkYourself(guess);
			numOfGuess++;
			if(result.equals("kill"))
			{
				isAlive = false;
				System.out.println("You took " + numOfGuess + " guessed");	
			}	
		}
	}
}