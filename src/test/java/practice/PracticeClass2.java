package practice;

import org.testng.annotations.Test;

public class PracticeClass2 {
	
	@Test
	public void test()
	{
		String url = System.getProperty("url");
		System.out.println(url);
		String b = System.getProperty("browser");
		System.out.println(b);
		System.out.println("test2");
	}

}
