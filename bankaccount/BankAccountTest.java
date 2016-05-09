package bankaccount;

/**
 * Test Development Driven.
 * Simple class
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BankAccountTest {

	BankAccount acc;	
	@Before
	public void setUp() throws Exception{
		acc = new BankAccount(75);	
	}
	@After
	public void tearDown() throws Exception{
		acc.setBalance(0);
	}
	
	@Test
	public void testDepostit() {
		acc.deposit(50);
		assertEquals(acc.getBalance() , 125);
	}
	
	@Test
	public void testWithdraw(){
		acc.withdraw(30);
		assertEquals(acc.getBalance(), 45);
	}
	@Test
	public void testWithdrawPenalty(){
		//System.out.println(acc.getBalance());
		acc.withdraw(100);
		assertEquals(acc.getBalance(), -30);
	}
	
	@Test//(expected=IllegalArgumentException.class)
	public void testAccDoesNotHaveBalance(){
		assertFalse(acc.getBalance() < 0);
	}
}

