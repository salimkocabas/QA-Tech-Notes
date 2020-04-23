package com.practice.temp;


import org.testng.annotations.Test;

public class AnnotationDemo {

	
	
	@Test(priority=1)
	public void test1() {
		System.out.println("1: Open Browser");
	}
	
	@Test(priority=3)
	public void test2() {
		System.out.println("2: PIM Test case");
	}
	
	@Test(priority=2)
	public void test3() {
		System.out.println("3: Leave Test Case");
	}
	
	@Test(priority=4)
	public void test4() {
		System.out.println("4: Close browser");
	}
	
	
	
	
	
	
	
	

}
