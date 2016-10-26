/**
 * A program to carry on conversations with Ma human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0
				|| statement.indexOf("fish") >= 0
				|| statement.indexOf("kraken") >= 0)
		{
			response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("Chen") >= 0)
		{
			response = "pls no more; MY EARS THEY BLEED!!!!!!";
		}
		else if (statement.indexOf("joke") >= 0)
		{
			response = "What is a jedis favorite dessert  ...         Obi-Wan Kanolies";
		}
		else if (statement.indexOf("life") >= 0)
		{
			response = "ALL LIFE IS MEANINGLESS JUST LIKE YOU";
		}
		else if (statement.indexOf("Keyword") >= 0)
		{
			response = "STOP TRYING TO FIGURE OUT HOW TO BREAK ME";
		}
		else if (statement.trim().equals(""))
		{
			response = "...";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 7;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "HMMMMMMMMMMMM!!!!!!!!!!!";
		}
		else if (whichResponse == 5)
		{
			response = "????";
		}
		else if (whichResponse == 6)
		{
			response = "SAY THINGS I UNDERSTAND PLS";
		}
		return response;
	}
}