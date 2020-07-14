package Jtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TwoDArray {
	
	String a[]=new String[5];
	String attendance[][]=new String[4][5];
	int n=1;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("before class");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tear down after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("set up method called...");
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("teardown method called.....");
	}
	
	@Test
	public void test()
	{
	
		for(int i=0;i<attendance.length;i++) {
			for(int j=0;j<attendance[i].length;j++) {
				System.out.print(n+"\t");
				n++;
			}
			
			System.out.println("\n");
		}
		assertEquals("1	2	3	4	5	\r\n" + 
				"\r\n" + 
				"6	7	8	9	10	\r\n" + 
				"\r\n" + 
				"11	12	13	14	15	\r\n" + 
				"\r\n" + 
				"16	17	18	19	20	\r\n" + 
				"", "1	2	3	4	5	\r\n" + 
						"\r\n" + 
						"6	7	8	9	10	\r\n" + 
						"\r\n" + 
						"11	12	13	14	15	\r\n" + 
						"\r\n" + 
						"16	17	18	19	20	\r\n" + 
						"");
	}

}
