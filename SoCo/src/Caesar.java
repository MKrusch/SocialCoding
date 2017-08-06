import static org.junit.Assert.*;
import org.junit.*;

public class Caesar {
	
	public String cipher(String msg, int key2)
	{
		String base2 = "., abcdefghijklmnopqrstuvwxyz";
		
		int key = key2;
		key *= -1;
		key %= base2.length();
		key *= -1;
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<msg.length(); i++)
		{
			int place = base2.indexOf(msg.charAt(i));
			if(key>0)
			{
				result.append(base2.charAt((place+key)%base2.length()));
			}
			else if(key==0)
			{
				result.append(msg.charAt(i));
			}
			else if(key<0)
			{
				if((place-(key*-1)%base2.length())>=0)
				{
					result.append(base2.charAt(place+key));
				}
				else
				{
					result.append(base2.charAt(place+(base2.length()+key)));
				}
			}
		}
		return result.toString();
	}
	

	public static void main(String[] args)
	{
		String msg = "abc";
		System.out.println(msg.substring(0, 1));
	}
	
	@Test
	public void keyZero()
	{
		assertEquals("., abcdefghijklmnopqrstuvwxyz", cipher("., abcdefghijklmnopqrstuvwxyz",0));
	}
	
	@Test
	public void keyOne()
	{
		assertEquals(", abcdefghijklmnopqrstuvwxyz.", cipher("., abcdefghijklmnopqrstuvwxyz",1));
	}
	
	@Test
	public void key29()
	{
		assertEquals("., abcdefghijklmnopqrstuvwxyz", cipher("., abcdefghijklmnopqrstuvwxyz",29));
	}
	
	@Test
	public void key30()
	{
		assertEquals(", abcdefghijklmnopqrstuvwxyz.", cipher("., abcdefghijklmnopqrstuvwxyz",30));
	}
	
	@Test
	public void keyMinus1()
	{
		assertEquals(" ", cipher("a",-1));
		assertEquals("z., abcdefghijklmnopqrstuvwxy", cipher("., abcdefghijklmnopqrstuvwxyz",-1));
	}
	
	@Test
	public void keyMinus29()
	{
		assertEquals("., abcdefghijklmnopqrstuvwxyz", cipher("., abcdefghijklmnopqrstuvwxyz",-29));
	}
	
	@Test
	public void keyMinus30()
	{
		assertEquals("z., abcdefghijklmnopqrstuvwxy", cipher("., abcdefghijklmnopqrstuvwxyz",-30));
	}
}
