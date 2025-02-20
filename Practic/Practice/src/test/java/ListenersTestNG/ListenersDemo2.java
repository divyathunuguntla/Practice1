package ListenersTestNG;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersTestNG.TestNGlisteners.class)
public class ListenersDemo2 {
	@Test
	public void test5()
	{
		System.out.println("Testing");
	}
	@Test
	public void test6()
	{
		System.out.println("Testing");
		//Assert.assertTrue(false);
	}
		
}
