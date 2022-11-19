package org.testngrevision;

import org.testng.annotations.Test;

public class TestngGroups {
	@Test (groups="smoke")
	public void signUp() {
		System.out.println("sighUp");

	}
	@Test (groups= {"somke,sanity"})
	public void login() {
		System.out.println("Login");
	}
	@Test (groups= {"smoke"})
	public void searchProduct() {
		System.out.println("searchProduct");

	}
	@Test(groups= {"sanity"})
	public void addToCart() {
		System.out.println("add to cart");


	}
	@Test (groups= {"regression"})
	public void signOut() {
		System.out.println("signout");


	}
}