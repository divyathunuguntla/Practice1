package Test;

import org.testng.annotations.Test;

public class TestNGPriority {
	@Test (priority =2)
	public void test1()
	{
		System.out.println("Testing1");
	}
	@Test (priority = 1)
	public void test2()
	{
		System.out.println("Testing2");
		//Assert.assertTrue(false);
	}
	@Test (priority = 4)
	public void test3()
	{
		System.out.println("Testing3");
	}
	@Test (priority =3)
	public void test4()
	{
		System.out.println("Testing4");
	}
}
