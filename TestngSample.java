package org.testngrevision;

import javax.management.RuntimeErrorException;

import org.testng.annotations.Test;

public class TestngSample {
	
	@Test(/*enabled=false,*/alwaysRun=true)
	public void signUp() {
		 System.out.println("sighUp");

	}
	@Test(dependsOnMethods="signUp")
	public void login() {
		System.out.println("Login");
	}
	@Test(dependsOnMethods="testngrevision.TestngSample.login")
	public void searchProduct() {
		System.out.println("searchProduct");

	}
	@Test(/*dependsOnMethods="searchProduct"*/priority=2)
	public void addToCart() {
		 System.out.println("add to cart");
		 throw new RuntimeException();

	}
	@Test(dependsOnMethods="testngrevision.TestngSample.addToCart",alwaysRun=true)
	public void signOut() {
		 System.out.println("signout");

	}

}
