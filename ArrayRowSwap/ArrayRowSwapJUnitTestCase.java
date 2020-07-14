package Jtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayRowSwapJUnitTestCase {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	

	@Test(timeout=5000)
	public void test() 
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		
		int TwoD[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Before Row Swapping ");
		for(int i=0;i<=TwoD.length-1;i++)
		{
			for(int j=0;j<=TwoD[i].length-1;j++)
			{
				System.out.print(TwoD[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		System.out.println("After Row Swapping ");
		for(int i=0;i<=TwoD.length-1;i++)
		{
			for(int j=TwoD[i].length-1;j>=0;j--)
			{
				System.out.print(TwoD[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		
	}
	
	@Test
	public void test1() 
	{
		int TwoD[][]=new int[][] {{'a',2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Before Row Swapping ");
		for(int i=0;i<=TwoD.length-1;i++)
		{
			for(int j=0;j<=TwoD[i].length-1;j++)
			{
				System.out.print(TwoD[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		System.out.println("After Row Swapping ");
		for(int i=0;i<=TwoD.length-1;i++)
		{
			for(int j=TwoD[i].length-1;j>=0;j--)
			{
				System.out.print(TwoD[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		
	}

}
