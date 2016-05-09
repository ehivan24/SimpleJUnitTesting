package bankaccount;

/**
 * Test Development Driven.
 * Simple class
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void testDepostit() {
		BankAccount acc = new BankAccount();
		acc.deposit(50);
		assertEquals(acc.getBalance() , 50);
		//System.out.println(acc.getBalance());
	}
	
	@Test
	public void testWithdraw(){
		BankAccount acc = new BankAccount(75);
		acc.withdraw(30);
		assertEquals(acc.getBalance(), 45);
		//System.out.println(acc.getBalance());
	}
	@Test
	public void testWithdrawPenalty(){
		BankAccount acc = new BankAccount(10);
		acc.withdraw(20);
		assertEquals(acc.getBalance(), -15);
		//System.out.println(acc.getBalance());
	}
}
