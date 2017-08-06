import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class WordCount {
	
	public static String[] count(String input)
	{
		// Alle , und . aus dem Text entfernen. replaceAll ist mächtiger, aber hatte Probleme mit regex.
		input = input.replace(",", " ");
		input = input.replace(".", " ");
		
		String[] rawParts = input.split(" "); int maxLength = rawParts.length;
		String[] countedParts = new String[maxLength];
		for(int i=0; i<maxLength; i++)
		{
			countedParts[i] = "parts";
		}
		int[] counts = new int[maxLength];
		int pointer = 0;
		
		
		
		for(int i=0; i<maxLength; i++)
		{
			if(rawParts[i].length()>0)
			{
				for(int j=0; j<maxLength; j++)
				{
					System.out.println(countedParts[j]);
					if(countedParts[j].equalsIgnoreCase(rawParts[i]))
					{
						counts[j]++;
						break;
					}
					else if(!countedParts[j].equalsIgnoreCase(rawParts[i]) && j==maxLength-1)
					{
						countedParts[pointer] = rawParts[i].toLowerCase();
						counts[pointer] = 1;
						pointer++;
						break;
					}
				}
			}
		}
		
		String[] sortingArray = new String[pointer];
		String[][] finerArray = new String[pointer][2];
		for(int i=0; i<pointer; i++)
		{
			sortingArray[i] = new String(counts[i]+countedParts[i]); // Todo 3. Part vorher überprüfen. soll nur 1 char sein.
			finerArray[i][0] = countedParts[i];
			finerArray[i][1] = Integer.toString(counts[i]);
			
		}
		Arrays.sort(sortingArray);
		
		/**
		 * Konsolenausgabe könnte noch gemacht werden.
		 */
		
		return sortingArray;
	}
	
	public static void main(String[] args)
	{
		count("");
	}
	
	@Test
	public void simpleTest()
	{
		String[] test = {"1test"};
		assertEquals(test, count("test"));
	}
	
	@Test
	public void twoWords()
	{
		String[] test = {"1apfel", "1test"};
		assertEquals(test, count("test apfel"));
		assertEquals(test, count(" test, apfel"));
	}
	
	@Test
	public void threeWords()
	{
		String[] test = {"1apfel", "2abgrund"};
		assertEquals(test, count("Abgrund abgrund apfel"));
		assertEquals(test, count(" abgrund, apfel abgrund"));
	}
	
}

