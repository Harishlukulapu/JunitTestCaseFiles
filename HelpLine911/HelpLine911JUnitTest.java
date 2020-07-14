package com.day6.Assessment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelpLine911JUnitTest {

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


	@Test(timeout=3000)
	public void test() 
	{
		
		Dog tiger=new Dog();		
		Child munnu=new Child();		
		munnu.playWithDog(new Stick(), tiger);
		assertEquals("dog is running..... no worries..... enjoy.....","dog is running..... no worries..... enjoy.....");
	}

}
