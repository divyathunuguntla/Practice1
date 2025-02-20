package ListenersTestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersTestNG.TestNGlisteners.class)
public class ListenersDemo {
	@Test
	public void test1()
	{
		System.out.println("Testing");
	}
	@Test
	public void test2()
	{
		System.out.println("Testing");
		//Assert.assertTrue(false);
	}
	@Test
	public void test3()
	{
		System.out.println("Testing");
	}
	@Test
	public void test4()
	{
		System.out.println("Testing");
	}
}
