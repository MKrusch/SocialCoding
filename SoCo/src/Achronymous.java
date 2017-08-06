import static org.junit.Assert.*;
import org.junit.*;

public class Achronymous 
{

	public String create(String input)
	{
		StringBuilder result = new StringBuilder();
		String text = input.toUpperCase();
		String[] parts = text.split(" ");
		
		for(String part : parts) result.append(part.subSequence(0, 1));

		return result.toString();
	}
	
	@Test
	public void test()
	{
		assertEquals("WAL", create("we are legion"));	
	}
}
