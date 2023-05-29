package listeners;

import org.testng.annotations.Test;

public class dependency1 {
	private static final String depends = null;
	@Test
	public void test1()
	{
		System.out.println("bangalore");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Karnataka");
	}
	@Test(dependsOnMethods ="test2")
	public void test3()
	{
		System.out.println("India");
	}
	
	
}
